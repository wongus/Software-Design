public class Student {
    private String name;
    private Integer studentNumber;
    private String favCourse;
    private Boolean presence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFavCourse() {
        return favCourse;
    }

    public void setFavCourse(String favCourse) {
        this.favCourse = favCourse;
    }

    public Boolean getPresence() {
        return presence;
    }

    public void setPresence(Boolean presence) {
        this.presence = presence;
    }

    Student(String name, Integer studentNumber, String favCourse, Boolean presence) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.favCourse = favCourse;
        this.presence = presence;

    }

}
