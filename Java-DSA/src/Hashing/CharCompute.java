package Hashing;

import java.util.Scanner;

public class CharCompute {

    public static void main(String[] args) {

        int[] hashArray = new int[26];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char array size");
        int arraySize = sc.nextInt();

        char[] inputArray = new char[arraySize];

        for(int i=0;i<inputArray.length;i++){
            inputArray[i] = sc.next().charAt(0);
        }

        for(int i=0;i<inputArray.length;i++){
            hashArray[inputArray[i]-'a']+=1;
        }

        System.out.println("Enter the number of queries");
        int queries = sc.nextInt();

        for(int i=0;i<queries;i++){

            char ch = sc.next().charAt(0);
            System.out.println(ch + " appears " + hashArray[ch-'a'] + " times ");
        }

        sc.close();
    }
}
