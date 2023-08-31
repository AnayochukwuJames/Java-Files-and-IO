package org.example;

public class Teacher extends Person{
    public Teacher(String fName, String lName, String address, String email, String phoneNumber, int age) {
        super(fName, lName, address, email, phoneNumber, age);
    }
    private String teacherID;
    private String gradeLevel;

    public Teacher() {

    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}

