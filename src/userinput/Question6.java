package userinput;

import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        int numbers[] = {5, 4, 1, 8, 6, 9};
        int valuenow = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int b = i + 1; b < numbers.length; b++) {
                System.out.println(numbers[i]);


                if (numbers[i] < numbers[b]);
                valuenow=numbers[i];
                numbers[i]= numbers[b];
                numbers[b]=valuenow;




            }
            Arrays.toString(numbers[i]);
        }
    }
}
