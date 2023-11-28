class StudentTest {
    public static void main(String[] args) {
        Student.Student student1 = new Student.Student(1, "Laura", "Isa", 2, 4.5, 3.8, 4.2);
        Student.Student student2 = new Student.Student(2, "Stepan", "Tetchenko", 3, 3.9, 4.1, 4.0);
        Student.Student student3 = new Student.Student(3, "Veronika", "Sudor", 1, 4.2, 4.6, 3.7);

        System.out.println("The student's average arithmetic grade " + student1.firstName + " " + student1.lastName + ": " + student1.calculateAverageGrade());
        System.out.println("The student's average arithmetic grade " + student2.firstName + " " + student2.lastName + ": " + student2.calculateAverageGrade());
        System.out.println("The student's average arithmetic grade " + student3.firstName + " " + student3.lastName + ": " + student3.calculateAverageGrade());
    }
}