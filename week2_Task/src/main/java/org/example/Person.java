package org.example;

public class Person {

    private String fName;
    private String lName;
    private String address;
    private String email;
    private String phoneNumber;
    private int age;

    public Person(String fName, String lName, String address, String email, String phoneNumber, int age) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public Person() {

    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        String name;
        return "class.Students{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", email=" + email +
                '}';
 }

}
