public class HomeWork2 {
    // Напишіть метод (з non-access modifier static), який приймає
    //число (трьохзначне) і повертає суму цифр цього числа
    //(наприклад, якщо число 123, 1+2+3)
    public static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Напишіть перевантажений (overloaded) метод (до метода із
    //завдання 1), який приймає два слова (1 слово – це 1
    //параметр) і виводить на екран суму довжин цих 2х слів
    public static int overloadedMethod(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        return length1 + length2;
    }

    //Напишіть ще один перевантажений метод, який повертає true
    //і виводить на екран повідомлення, що число >0, якщо введене
    //із клавіатури число більше 0; і повертає false – якщо не
    //більше 0 і виводить на екран відповідне повідомлення
    static boolean overloadedMethod(int number) {
        if (number > 0) {
            System.out.println("Number is greater than zero");
            return true;
        } else {
            System.out.println("Number is not less than zero");
            return false;
        }
    }

    //Продемонструйте роботу всіх 3х методів
    public static void main(String[] args) {
        overloadedMethod( "Hi", "Bye");
    }
}
