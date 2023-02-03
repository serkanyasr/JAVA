public class Statements {
    public static void main(String[] args) {
        int x = 5;
        x = x + 1;
        x++;
        x--;
        int y = 4;

        boolean values = x > y;
        // System.out.println(values);
        values = x < y;
        // System.out.println(values);
        values = x >= y;
        values = x <= y;
        values = x == y;
        values = x != y;
        // And = && or = ||
        // System.out.println(x);

        // İf Statements
        if (x >= y) {
            System.out.println("x is bigger");
        } else if (x <= y) {
            System.out.println("y is bigger");
        } else {
            System.out.println("x == y");
        }

        // Switch
        int day = 1;
        String dayString = "";

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Thursday";
                break;
            case 3:
                dayString = "Wednesday";
                break;

            default:
                dayString = "Sunday";
        }
        // System.out.println(dayString);

    }
}
