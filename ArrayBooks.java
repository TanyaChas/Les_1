
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.UIManager.getColor;

public class ArrayBooks {
    //Є ArrayList зі списком 5ти книг (задайте перелік на свій розсуд). Напишіть метод, який буде
    //повертати HashMap на основі списку книг. За ключ в мапі вважайте номер індексу книги в ArrayList.
    //3. Потрібно вивести на екран таку інформацію про деяку категорію товару (оберіть на свій розсуд):
    //1. Вивести на екран всі товари. 2. Вивести на екран всі товари, які мають заданий колір. 3. Вивести
    //на екран товари, які мають ціну, вищу за вказану. Використовуйте Streams API при імплементації.

    public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         List.add("Book-1");
         List.add("Book-2");
         List.add("Book-3");
         List.add("Book-4");
         List.add("Book-5");
        System.out.println(list);
    }
        public static void main (String [] args){
        Map<String, String> map = new HashMap<>();
        map.put("202021", "Book-1");
        map.put("212120", "Book-2");
        map.put("222022", "Book-3");
        map.put("232023", "Book-4");
        map.put("242024", "Book-5");
        System.out.println(map.get("232023"));
    }


        public static class Books {
        private String name;
        private String color;

        public Books(String name, String color){
            this.name = name;
            this.color = color;
        }

        public static void main(String[] args) {
            Book st1 = new Book("Book-1", "yellow");
            Book st2 = new Book("Book-2", "blue");
            Book st3 = new Book("Book-3", "grey");
            Book st4 = new Book("Book-4", "red");
            Book st5 = new Book("Book-5", "pink");

            List<String> books = List.of(st1, st2, st3, st4, st5);
            List<books> bookstListUpd = books.stream().filter(book ->  books,getColor()).forEach(sout(bookstListUpd))};


    }
}
