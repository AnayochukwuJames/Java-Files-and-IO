package org.example;

import java.io.BufferedWriter;
import java.io.IOException;

public class TeacherFileWriter {
    public static void main(String[] args) throws IOException {
        String fileName = "Teacher.text";
        try (BufferedWriter bufferedWriter =  new BufferedWriter (new java.io.FileWriter(fileName, true))){
            String dataToWrite = "TeacherID,Email,FirstName,LastName,GradeLevel\n" +
                    "gregory01,ogregory+teacher+academy@chalk.com,Oliver,Gregory,2\n" +
                    "lloyd01,slloyd+teacher+academy@chalk.com,Shelley,Lloyd,1\n" +
                    "osbourne01,lsobourne+teacher+academy@chalk.com,Lee,Osbourne,1\n" +
                    "walton01,jwalton+teacher+academy@chalk.com,Josephine,Walton,3\n" +
                    "fernandez01,ifernandez+support+teacher+academy@chalk.com,Inez,Fernandez,4";
            bufferedWriter.write(dataToWrite);
            bufferedWriter.close();

        }
    }
}