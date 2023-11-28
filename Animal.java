 class Animal {
     String name;
     int eyes;
     int eat;
     int drink;
     void aminal(){
         System.out.println("I am animal");
     }
     void eat(){
         System.out.println("Animal eats");
     }

     void drink(){
         System.out.println("Animal drinks");
     }
     static class Pet {
         void pet(){
             System.out.println("I am pet");
             System.out.println("Pet runs");
             System.out.println("Pet runs« jumps");
         }
         String name;
         int tai = 1;
         int paw = 4;
         String run;
         String jump;

         class Dog {
             int paw = 4;
             void dog(){
                 System.out.println("I am dog and my name is: Lord + Elli");
                 System.out.println("Dog plays");
             }
         }
         class Cat {
             String sleep;
             void cat(){
                 System.out.println("I am cat and my name is: Evi + Eva");
                 System.out.println("Cat sleeps");
             }
         }
     }


     public static void main(String[] args) {
         Pet pet = new Pet();
         pet.paw();
         pet.sleep();
     }
     // тут щось в мене не вийшло викликати на екран кількість лап об'єкта класу Dog і викличте метод sleep об'єкта
     //класу Cat. Я щось не розбираюсь як то правильно зробити. Прошу мені розписати main, будь-ласка.
}
