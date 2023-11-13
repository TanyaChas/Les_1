package p2;

public class TestClass {

//   static void sumOfTwoNumbers(int a, int b){           //() параметри
//        int sum = a + b;
//        System.out.println(sum);
//    }

    static int sumOfTwoNumbers(int a, int b){           //() параметри
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
//        sumOfTwoNumbers(1, 2);

//        int sum = sumOfTwoNumbers(1, 2);
//        System.out.println();

        System.out.println(sumOfTwoNumbers(1, 2));
    }
}
