public class HW3 {
    //    Напишіть метод, який знаходить найдовше слово серед трьох,
//    використовуючи if/else
    public static void Word () {
        // Довжина слова s1, s2, s3.
        String s1 = "September";
        int len1 = s1.length();
        String s2 = "Nowember";
        int len2 = s2.length();
        String s3 = "May";
        int len3 = s3.length();

        // Виведення кількості символів
        System.out.println( "Кількості символів \"September\": " + len1 + " символи.");
        System.out.println( "Кількості символів \"Nowember\": " + len2 + " символи.");
        System.out.println( "Кількості символів \"May\": " + len3 + " символи.");

        // Порівняння слів s1, s2, s3.
        if (len1 > len2) {
            System.out.println( "\nСлово \"September\" Довше слова \"Nowember\".");
        }
        else if (len1 < len2) {
            System.out.println( "\nСлово \"September\" Довше слова \"Nowember\".");
        }
        else if (len2 < len3) {
            System.out.println("\nСлово \"Nowember\" Довше слова \"May\".");
        }
        else if (len2 > len3) {
            System.out.println("\nСлово \"Nowember\" Довше слова \"May\".");
        }
        else if (len1 > len3) {
            System.out.println( "\nСлово \"May\" Коротше слова \"September\".");
        }
        else if (len1 < len3) {
            System.out.println( "\nСлово \"May\" Коротше слова \"September\".");
        }
        else {
            System.out.println( "len1". length());
            System.out.println( "len2". length());
            System.out.println( "len3". length());
        }
    }
    // У класі Month створити метод, у якого 1 параметр типу даних
    //int. Цей параметр буде означати порядковий номер місяця.
    //Використовуючи switch, вивести на екран кількість днів
    //цього місяця (2023 рік). Перевірити роботу даного метода в
    //main

    public static String Day() {
        int month = 7;
        String dayString="31";
        switch(month){
            case 1: dayString="1 - July";
                break;
            case 2: dayString="2 - July";
                break;
            case 3: dayString="3 - July";
                break;
            case 4: dayString="4 - July";
                break;
            case 5: dayString="5 - May";
                break;
            case 6: dayString="6 - July";
                break;
            case 7: dayString="7 - July";
                break;
            case 8: dayString="8 - July";
                break;
            case 9: dayString="9 - July";
                break;
            case 10: dayString="10 - July";
                break;
            case 11: dayString="11 - July";
                break;
            case 13: dayString="13 - July";
                break;
            case 14: dayString="14 - July";
                break;
            case 15: dayString="15 - July";
                break;
            case 16: dayString="16 - July";
                break;
            case 17: dayString="17 - July";
                break;
            case 18: dayString="18 - July";
                break;
            case 19: dayString="19 - July";
                break;
            case 20: dayString="20 - July";
                break;
            case 21: dayString="21 - July";
                break;
            case 22: dayString="22 - July";
                break;
            case 23: dayString="23 - July";
                break;
            case 24: dayString="24 - July";
                break;
            case 25: dayString="25 - July";
                break;
            case 26: dayString="26 - July";
                break;
            case 27: dayString="27 - July";
                break;
            case 28: dayString="28 - July";
                break;
            case 29: dayString="29 - July";
                break;
            case 30: dayString="30 - July";
                break;
            case 31: dayString="31 - July";
                break;

            default:System.out.println("Invalid !");
        }
        System.out.println(dayString);
        return dayString;
    }
}
