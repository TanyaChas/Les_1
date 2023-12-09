import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
    //Напишіть метод, який ділить кожен елемент масива на задане число і виводить на
    //екран новий масив елементів із поділеними елементами попереднього. Додайте
    //опрацювання виняткових ситуацій
        public static void main(String[] args) {
        int[] array = {10, 15, 25};
        try {
            array[15] = 208;
        }catch (IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
    }

    //Написати метод, який перевіряє валідність українського номера повного формату
    //(+380...)

    public static void main(String[] args) {
        List<String> phone = new ArrayList<>();
        phone.add("+380935588403");
        phone.add("+380535588403");
        phone.add("+3809355884021");

        String regex = "\\d{3}-\\d{7}";
        Pattern pattern = Pattern.compile(regex);
        for (String phone : phone){
            Matcher matcher =pattern.matcher(phone);
            System.out.println(phone + " : " + matcher.matches());
        }
    }
}
