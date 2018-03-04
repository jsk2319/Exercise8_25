import java.util.Scanner;

public class MarkovMatrix {

    public static void main(String[] args) {

        Scanner userKeyboard = new Scanner(System.in);

        System.out.println("The program test for a Markov Matrix. Enter a 3-by-3 matrix row by row. Hit enter to start the next row and the complete it.");
        double[][] markArray = new double[3][3];

        for (int x = 0; x < markArray.length; x++) {
            for (int y = 0; y < markArray[x].length; y++) {
                markArray[x][y] = userKeyboard.nextDouble();
            }
        }

        String whenNot = "";
        if (!isMarkovMatrix(markArray)) {
            whenNot = "not ";
        }
        System.out.println("It is " + whenNot + "a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] m) {

        for (int mX = 0; mX < m.length; mX++) {

            double sum = 0;
            for (int mY = 0; mY < m.length; mY++) {

                if (m[mY][mX] < 0) {
                    return false;
                }
                sum += m[mY][mX];
            }
            if (sum != 1.0) {
                return false;
            }
        }

        return true;
    }

}