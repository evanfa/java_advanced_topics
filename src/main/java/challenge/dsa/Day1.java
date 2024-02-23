package challenge.dsa;

/*
Two Sum Easy
Given an array of integers nums and an integer target , return indices of the two numbers
such that they add up to target. You may assume that each input would have exactly one solution, and
you may not use the same element twice. You can return the answer in any order.
 */

import java.util.Random;
import java.util.Scanner;

public class Day1 {
    private static int[] nums = new int[100];
    private int target = 4;
    private static int max=85;
    private static int min=1;
    private static int index;
    public static void main(String[] args) {
        populateArray();
        /*for (int n:nums) {
            System.out.println("Vale: "+nums[n]);
        }*/
        Scanner n1 = new Scanner(System.in);
        System.out.println("Input Int: ");
        int valN = n1.nextInt();
        int valInit = 0;


        for (int n:nums) {
            System.out.println(n+"->"+nums[n]);
            if(nums[n]==valN) {
//                System.out.printf("Index :"+n);
                index = n;
            }else{
                if(nums[n]>valN){
                    //remove
                    nums[n] = 0;
                }else{
                    valInit = nums[n];
                    int valTemp = valN-valInit;
                }
            }
            }

        System.out.println("-> Value: "+nums[index]+" Index: "+index);

        }

    public static void populateArray() {
        Random random = new Random();
        for (int i = 0; i < 99; i++) {
            nums[i] = random.nextInt(max+min)+min;
        }
    }

}
