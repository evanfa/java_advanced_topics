package challenge.str;

import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class TokenizerSQL {

    static String[] arr = new String[100];

    public String[] getArr() {
        return arr;
    }
    public void addArr(int index, String str){
        arr[index] = str;
    }
    public static void main(String[] args) {
        String inputArray = Arrays.toString(new String[]{"StringOne", "StringTwo", "StringThree", "StringFour", "StringFive", "StringSix", "StringSeven", "StringEight"});
        String stringTest = "StringOne\nStringTwo\nStringThree\nStringFour\nStringFive\nStringSix\nStringSeven\nStringEight";
        String otherString = "my name is khan".concat(" ");
        String newLine = "Working with tokenizer and other things.\nGreat Work";

       /*
        System.out.println("Result: "+queryGenerator(inputArray));
        System.out.println("Result: "+queryGenerator(stringTest));
        System.out.println("Result: "+queryGenerator(otherString));
        System.out.println("Result: "+queryGenerator(newLine));
        */

        queryGeneratorTwo(inputArray);
        queryGeneratorTwo(stringTest);
        queryGeneratorTwo(otherString);
        queryGeneratorTwo(newLine);

    }

    /**
     * Function to generate query for multiple inserts
     * @param inputStr
     * @return
     */
    public static String queryGenerator(String inputStr){
        String strQuery = "INSERT INTO db_table(in1,in2,in3,in4,int6,int7,int8) VALUES (";

        StringTokenizer stToken = new StringTokenizer(inputStr);
        System.out.println("Total Tokens: "+stToken.countTokens());

        int index = 0;
        while (stToken.hasMoreTokens()){
            index++;
            System.out.println(index+" > Token: "+stToken.nextToken());

            strQuery = strQuery.concat(stToken.nextToken());
        }
        return strQuery;
    }

    public static void queryGeneratorTwo(String inputStr){
        String strQuery = "INSERT INTO db_table(in1,in2,in3,in4,int6,int7,int8) VALUES (";

        StringBuilder stBuilder = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(inputStr);
        Iterator<Object> iterator = tokenizer.asIterator();

        //if (iterator.hasNext()){
        //    System.out.println(">> "+stBuilder.append(iterator.next()).append("m"));
        //}

        /*while(iterator.hasNext()){
            int i = (int) iterator.next();
            System.out.println("Val> "+i);
            if(stBuilder.lastIndexOf(iterator)){

            }

        }*/
        String lastToken = "";
        while(tokenizer.hasMoreTokens()){
            lastToken = tokenizer.nextToken();
        }

        int lastIndex = inputStr.lastIndexOf(lastToken);

        System.out.println("Last Index Token: "+lastIndex);
        System.out.println("Token: "+lastToken);

        //iterator.forEachRemaining(token->stBuilder.append(token).append(","));
        //System.out.println(">>>: "+stBuilder.toString().trim());
        //stToken.asIterator().forEachRemaining(token->System.out.println(token.toString()));
    }


}
