public class Student {
    private String name;
    private int course;
    private int grade;

    public String getName (String Alex){
        this.name =  Alex;
        return name;
    }
    public String getCourse (String course){
        this.course =  4;
        return course;
    }
    public String getGrade (String grade){
        this.grade =  5;
        return grade;
    }

    interface ShowInfo{
        void Student();
    }
}

class TestStudent{
    public static class Student{
        interface ShowInfo{
            void Student();
        }
    }

}

