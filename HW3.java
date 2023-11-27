public class HW3 {
    //    Напишіть метод, який знаходить найдовше слово серед трьох,
//    використовуючи if/else
    public static String findLongestWord(String word1, String word2, String word3) {
        if (word1.length() >= word2.length() && word1.length() >= word3.length()) {
            return word1;
        } else {
            return word2.length() >= word1.length() && word2.length() >= word3.length() ? word2 : word3;
        }
    }
    // У класі Month створити метод, у якого 1 параметр типу даних
    //int. Цей параметр буде означати порядковий номер місяця.
    //Використовуючи switch, вивести на екран кількість днів
    //цього місяця (2023 рік). Перевірити роботу даного метода в
    //main

    public static int Day() {
        static int monthDayQuantity ( int monthNumber){
            switch (monthNumber) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                default:
                    System.out.println("Sorry, this value is out of the range, please enter correct month number");
            }
            return monthNumber;
        }
    }

    public static void printFirstChristmasTree() {
        int i;
        int j;
        for(i = 1; i <= 5; ++i) {
            for(j = 1; j <= i; ++j) {
                System.out.print("x");
            }

            System.out.println();
        }

        for(i = 4; i >= 1; --i) {
            for(j = 1; j <= i; ++j) {
                System.out.print("x");
            }

            System.out.println();
        }

    }

    public static void printSecondChristmasTree() {
        for(int i = 4; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("x");
            }

            System.out.println();
        }

    }

    public static void printThirdChristmasTree() {
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("x");
            }

            System.out.println();
        }

        System.out.println();
    }
}
