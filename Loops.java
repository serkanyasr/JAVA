public class Loops {
    public static void main(String[] args) {

        // For Loops
        int[] myNumbers = { 10, 20, 35, 45 };

        for (int i = 0; i < myNumbers.length; i++) {
            int x = myNumbers[i] / 3 * 5;
            // System.out.println(x);
        }
        for (int number : myNumbers) { // easy way
            int x = number / 3 * 5;
            // System.out.println(x);
        }

        // while
        int j = 0;
        while (j < 10) {
            System.out.println("sample");
            j++;

        }

    }
}
