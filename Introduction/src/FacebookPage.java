public class FacebookPage {

    private Student student;

    public FacebookPage(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        String information = "Ik ben " + this.student.getName() + " en mijn favoriete course is " + this.student.getFavCourse();

        return information;
    }
}
