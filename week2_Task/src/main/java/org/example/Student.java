package org.example;

public class Student extends Person{

    public Student(String fName, String lName, String address, String email, String phoneNumber, int age) {
        super(fName, lName, address, email, phoneNumber, age);
    }
    private String studentID;
    private String GradeLevel;
    private String GuardianEmail1;
    private String GuardianEmail2;
    private String isArchived;
    private String isDeleted;

    public Student() {
        super();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getGradeLevel() {
        return GradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        GradeLevel = gradeLevel;
    }

    public String getGuardianEmail1() {
        return GuardianEmail1;
    }

    public void setGuardianEmail1(String guardianEmail1) {
        GuardianEmail1 = guardianEmail1;
    }

    public String getGuardianEmail2() {
        return GuardianEmail2;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        GuardianEmail2 = guardianEmail2;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(String isArchived) {
        this.isArchived = isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setLName(String datum) {
    }
}
