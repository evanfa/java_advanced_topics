package init.vault.loader.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSVLoader {

    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String COMMA_SEPARATOR = ",";

    /**
     * Function that retrieves and store whole data into an LinkedList from .csv file
     * @param csvFilePath
     * @param columnInput
     * @return
     * @throws FileNotFoundException
     */
    public static LinkedList<String> getRowsFromCSVList(String csvFilePath, int columnInput) throws FileNotFoundException {
        //System.out.println("Path: " + csvFilePath);
        LinkedList<String> list = new LinkedList<String>();

        try {
            Scanner scanner = new Scanner(new File(csvFilePath));
            //while (scanner.hasNext()) {
            while (scanner.hasNextLine()) {
                List<String> line = parseLine(scanner.nextLine());
                list.add(line.get(columnInput));
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * Function that retrieves and store whole data into an ArrayList from .csv file
     * @param csvFilePath
     * @param columnInput
     * @return
     * @throws FileNotFoundException
     */
    public static ArrayList<String> getRowsFromCSVtoArrayList(String csvFilePath, int columnInput) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(new File(csvFilePath));
        try{
               while(scanner.hasNextLine()){
                   List<String> line = parseLine(scanner.nextLine());
                   list.add(line.get(columnInput));
               }
            scanner.close();
        }catch (Exception ext){
            ext.printStackTrace();
        }
        return list;
    }

    /**
     * String Parser
     *
     * @param cvsLine
     * @param separators
     * @param customQuote
     * @return
     */
    public static List<String> parseLine(String cvsLine, char separators, char customQuote) {

        List<String> result = new ArrayList<>();

        //if empty, return!
        if (cvsLine == null && cvsLine.isEmpty()) {
            return result;
        }

        if (customQuote == ' ') {
            customQuote = DEFAULT_QUOTE;
        }

        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }

        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;

        char[] chars = cvsLine.toCharArray();

        for (char ch : chars) {

            if (inQuotes) {
                startCollectChar = true;
                if (ch == customQuote) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                } else {

                    //Fixed : allow "" in custom quote enclosed
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }
                }
            } else {
                if (ch == customQuote) {

                    inQuotes = true;

                    //Fixed : allow "" in empty quote enclosed
                    if (chars[0] != '"' && customQuote == '\"') {
                        curVal.append('"');
                    }

                    //double quotes in column will hit this!
                    if (startCollectChar) {
                        curVal.append('"');
                    }

                } else if (ch == separators) {

                    result.add(curVal.toString());

                    curVal = new StringBuffer();
                    startCollectChar = false;

                } else if (ch == '\r') {
                    //ignore LF characters
                    continue;
                } else if (ch == '\n') {
                    //the end, break!
                    break;
                } else {
                    curVal.append(ch);
                }
            }
        }
        result.add(curVal.toString());
        return result;
    }

    /**
     * Function parse line into list
     *
     * @param {String} cvsLine
     * @return List<String>
     */
    public static List<String> parseLine(String cvsLine) {
        return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
    }
}