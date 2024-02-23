package maths.testers;

import java.util.Scanner;

public class LevenshteinDistance {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        String  input = ns.nextLine();
        String[] arr = input.split("\\s+");
        System.out.println("Response: "+Levenshtein(arr[0],arr[1]));
    }

    public static int minimun(int a, int b, int c)
    {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        return c;
    }

    public static int Levenshtein(String str1, String str2)
    {
        int m = str1.length();
        int n = str2.length();

        int[]v0 = new int[m+1]; //cost
        int[]v1 = new int[m+1]; //new cost

        for (int i = 0; i < v0.length; i++) v0[i] = i;
        for (int i = 1; i < v1.length; i++)
        {
            v1[0] = i;

            for (int j = 1; j < v0.length; j++)
            {
                //int substitutionCost = v0[j - 1] +
                int match = (str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1;
                int substitutionCost = v0[j-1] + match;

                System.out.println("v0[j]: "+v0[j]+" "+str1.charAt(i - 1)+" - "+str2.charAt(j - 1));

                int insertionCost = v0[j] + 1;
                System.out.println("insertion: "+insertionCost);

                int deletionCost = v1[j - 1] + 1;



               // System.out.println("susti: "+substitutionCost);
               // System.out.println("inser: "+insertionCost);

                v1[j] = minimun(deletionCost, insertionCost, substitutionCost);
               // v1[j] = Math.min(Math.min(insertionCost, deletionCost), substitutionCost);
            }
            int [] x = v0; v0 = v1; v1=x;
        }

        return v0[v0.length-1];
        //return v0[v0.length-1];
    }

}
