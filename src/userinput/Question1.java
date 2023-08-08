package userinput;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum numbers to print the prime number : ");
        int output1 = sc.nextInt();

        System.out.println("The sequence of prime number : "+output1);
        String output2 = sc.next();


    }
}
