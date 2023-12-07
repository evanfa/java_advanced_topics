package methodology.good.practice;


/*
 * Don Repeat Yourself
 *
 * Validation for Nested IFs
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrincipleDRY {

    //private static final String REGEX_DATE_ENG = "((January|Febuary|March|April|May|June|July|August|September|October|November|December|Enero|Febrero|Marzo|Abril|Mayo|Junio|Julio|Agosto|Septiembre|Septiembrre|Saptiembre|Octubre|Octubr|Ocutubre|Noviembre|Diciembre|Decembere).([0-9]{1,2}).*(\\d{2,4}))";
    private static final String REGEX_DATE_ENG = "\\w+[a-zA-Z]";
    private static final List<String> lstMonths = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre",
            "Jan", "Ene", "Feb", "Mar", "Apr", "Abr", "May", "Jun", "Jul", "Aug", "Ago", "Sep", "Oct", "Nov", "Dec", "Dic");

    private final Pattern pattern = Pattern.compile(REGEX_DATE_ENG, Pattern.CASE_INSENSITIVE);

    public void noDryPrinciple(String textToReview) {
        String rstString = "";
        String montString = "";
        Matcher matcher = pattern.matcher(textToReview);

        if (matcher.find()) {

            for (String lst : lstMonths) {
                //if (matcher.group(2).equals(lst)) {
                //if (.equals(lst)) {
                    if (lst.equals("January") || lst.equals("Enero") || lst.equals("Ene") || lst.equals("Jan")) {
                        montString = "01";
                    }
                    if (lst.equals("February") || lst.equals("Febrero") || lst.equals("Feb")) {
                        montString = "02";
                    }
                    if (lst.equals("March") || lst.equals("Marzo") || lst.equals("Mar")) {
                        montString = "03";
                    }
                    if (lst.equals("April") || lst.equals("Abril") || lst.equals("Apr") || lst.equals("Abr")) {
                        montString = "04";
                    }
                    if (lst.equals("May") || lst.equals("Mayo")) {
                        montString = "05";
                    }
                    if (lst.equals("June") || lst.equals("Junio") || lst.equals("Jun")) {
                        montString = "06";
                    }
                    if (lst.equals("July") || lst.equals("Julio") || lst.equals("Jul")) {
                        montString = "07";
                    }
                    if (lst.equals("August") || lst.equals("Agosto") || lst.equals("Aug") || lst.equals("Ago")) {
                        montString = "08";
                    }
                    if (lst.equals("September") || lst.equals("Septiembre") || lst.equals("Sep")) {
                        montString = "09";
                    }
                    if (lst.equals("October") || lst.equals("Octubre") || lst.equals("Oct")) {
                        montString = "10";
                    }
                    if (lst.equals("November") || lst.equals("Noviembre") || lst.equals("Nov")) {
                        montString = "11";
                    }
                    if (lst.equals("December") || lst.equals("Diciembre") || lst.equals("Decembere") || lst.equals("Dic") || lst.equals("Dec")) {
                        montString = "12";
                    }
                }
            }
        }

        /*try {
            if (matcher.group(2).length() == 4) {
                rstString = rstString.concat("20" + matcher.group(4)).concat("-").concat(montString).concat("-").concat(matcher.group(3));
                System.out.println("Year: " + rstString);
            }
        } catch (Exception e) {
            NoFoundException pE = new NoFoundException("Empty Result - No match found");
            pE.initCause(e);
        }

    }*/

    public void dryPrinciple(String textToReview) {
        String foundWord = null;
        Pattern pattern = Pattern.compile("\\w+[a-zA-Z]");
        for (String lst : lstMonths) {
            try {
                Matcher matcher = pattern.matcher(textToReview);
                if (matcher.find()) {
                    foundWord = matcher.group();
                    System.out.println("Match Found: "+lstMonths.indexOf(foundWord));
                }
                System.out.println("Matcher: "+matcher);
                System.out.println("Found: "+foundWord);
            }catch (Exception ex){
                System.out.println("Exceptions: "+ex);
            }


        }
    }
}
