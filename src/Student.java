public class Student {
    String name;

    int age;

    void showDetails (){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    public static void main(String[] args){

        Student student1 = new Student();

        student1.name = "khaleel";
        student1.age  = 25;
        student1.showDetails();


        Student student2 = new Student();

        student2.name = "ranga";
        student2.age  = 23;
        student2.showDetails();
    }
}
