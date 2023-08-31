package org.example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class TeacherFileReader{
    public static void main(String[] args) throws IOException {
        ArrayList<Student> StudentList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("/Users/user/Desktop/Java Project/week2_Task/src/main/resources/Teachers.csv"));
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

            Teacher teacher = new Teacher();
            teacher.setlName(data[0]);
            teacher.setGradeLevel(data[1]);
            teacher.setGradeLevel(data[2]);

        }
    }
}
