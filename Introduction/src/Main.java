public class Main {
    public static void main(String[] args) {
        Console console = new Console();

        School school = new School("HZ");

        console.log("Hello, welcome");

        Student student1 = new Student("Ruben", 12345, "UXD", true);
        Student student2 = new Student("John", 67890, "none", false);

        Student[] students = {student1, student2};

        console.log("het is nu 6 uur");

        console.log("we hebben " + students.length + " studenten. dit zijn: ");


        console.log(school.listStudentPasses());
    }
}
