public class HzPass {

    private Student student;

    public HzPass(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        String information = "Student: " + this.student.getName() + "StudentNumber:" + this.student.getStudentNumber();

        return information;
    }
}
