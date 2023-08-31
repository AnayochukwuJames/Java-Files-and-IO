package org.example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class StudentFileReader{
        public static void main(String[] args) throws IOException {
                ArrayList<Student> StudentList = new ArrayList<>();

BufferedReader br = new BufferedReader(new FileReader("/Users/user/Desktop/Java Project/week2_Task/src/main/resources/Student.csv"));
String line = "";
                     while ((line = br.readLine()) != null){
                        String[] data = new String[9];
                        String[] data1 = line.split(",");
                        System.out.println(data1[2]);

                        for (int i = 0; i < data1.length; i++){
                              data[i] = data1[i];

                        if (data[i].isEmpty()) {
                                data[i] = "Null";
                        }
                }

                Student student = new Student();
                student.setStudentID(data[0]);
                student.setEmail(data[1]);
                student.setLName(data[2]);
                student.setlName(data[3]);
                student.setGradeLevel(data[4]);
                student.setGuardianEmail1(data[5]);
                student.setGuardianEmail2(data[6]);
                student.setIsArchived(data[7]);
                student.setIsDeleted(data[8]);

       }
}
}
