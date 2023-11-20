public class HW1 {
    int year = 2023;

    static void overloadedMethod(int a, int b) {
        int sum = a + b;
    }
    public static void main(String[] args) {
        overloadedMethod("Hi", "Bye");
    }
}
