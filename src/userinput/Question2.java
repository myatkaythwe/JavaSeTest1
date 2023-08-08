package userinput;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int output = numbers.nextInt();

        if (output>0){
            System.out.println("positive number");
        } else if (output<0) {
            System.out.println("negative number");
        }
        else {
            System.out.println("zero");
        }
    }
}
