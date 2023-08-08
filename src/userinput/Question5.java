package userinput;

public class Question5 {
    public static void main(String[] args) {
    int numbers [][] = new int[3][];
    int dnumbers [][] = {{1,2,3,4,5},{5,4,3,2,1},{7,8,9,1,5,7,7}};
        System.out.println(dnumbers);

        int anumbers [][] = new int [dnumbers.length][];
        for (int i = 0; i < dnumbers.length; i++) {
            anumbers[i] = new int[dnumbers.length];
            for (int j = 0; j < dnumbers[i].length; j++) {
                anumbers[i][j]=dnumbers[i][j]+1;
            }
        }

        for (int i = 0; i < anumbers.length; i++) {
            for (int j = 0; j < anumbers[i].length; j++) {
                System.out.println(anumbers[i][j] + "\t");
            }

            System.out.println();

        }
    }
}
