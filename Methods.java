public class Methods {
    static String username; // global variables

    public static void main(String[] args) {

        testMethod();
        int value = math(10, 10);
        System.out.println(value);
    }

    public static void testMethod() {
        username = "Serkan";
        int x = 4 + 4;
        System.out.println("value of x: " + x);
    }

    public static int math(int a, int b) {
        int value = a + b;
        return value;
    }
}
