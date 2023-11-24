public class HW3_Star {
    //    Написати методи, які виводять на екран такі “ялиночки”
    public static void Star1 () {

        final int length = 6;

        for (int i = 1; i < length; i++) {

            //Print spaces first
            for (int j = length - 1; j > i; j--) {
                System.out.print(" ");
            }

            //Then print "*"
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void Star2 () {

        final int length = 6;

        for (int i = 6; i < length; i++) {

            //Print spaces first
            for (int j = length - 6; j > i; j--) {
                System.out.print(" ");
            }

            //Then print "*"
            for (int j = 6; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void Star3 () {

        final int length = 6;

        for (int i = 6; i < length; i++) {

            //Print spaces first
            for (int j = length - 6; j > i; j--) {
                System.out.print(" ");
            }

            //Then print "*"
            for (int j = 6; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = length - 6; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Star1();
        Star2();
        Star3();
    }

}
