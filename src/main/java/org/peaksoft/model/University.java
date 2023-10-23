package org.peaksoft.model;


public class University {
    private  String name;
    private  String yearOfRelaese;
    private int countOfStudent;

    private Student student;
    private Teacher teacher;

//    public University(Student student, Teacher teacher) {
//        this.student = student;
//        this.teacher = teacher;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfRelaese() {
        return yearOfRelaese;
    }

    public void setYearOfRelaese(String yearOfRelaese) {
        this.yearOfRelaese = yearOfRelaese;
    }

    public int getCountOfStudent() {
        return countOfStudent;
    }

    public void setCountOfStudent(int countOfStudent) {
        this.countOfStudent = countOfStudent;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void getUniversity(){
        System.out.println("Acua");
        student.walk();
        teacher.walk();
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", yearOfRelaese='" + yearOfRelaese + '\'' +
                ", countOfStudent=" + countOfStudent +
                '}';
    }
}
