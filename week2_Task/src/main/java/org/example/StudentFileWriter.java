package org.example;

import java.io.BufferedWriter;
import java.io.IOException;

public class StudentFileWriter {
    public static void main(String[] args) throws IOException {
        String fileName = "Student.text";
        try (BufferedWriter bufferedWriter =  new BufferedWriter (new java.io.FileWriter(fileName, true))){
            String dataToWrite = "StudentID,FirstName,LastName,GradeLevel,Email,GuardianEmail1,GuardianEmail2,isArchived,isDeleted\n" +
                    "1,Evelyn,Torgenson,1,evelynt+student+academy@chalk.com,evelynt+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "2,Joseph,Sturdevant,1,josephs+student+academy@chalk.com,josephs+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "3,Scotty,Busch,1,scottyb+student+academy@chalk.com,scottyb+guardian+academy@chalk.com,nickyb+guardian+academy@chalk.com,Null,Null\n" +
                    "4,Nicky,Busch,1,nickyb+student+academy@chalk.com,nickyb+guardian+academy@chalk.com,scottyb+guardian+academy@chalk.com,Null,Null\n" +
                    "5,Hilma,Habbard,1,hilmah+student+academy@chalk.com,hilmah+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "6,Avis,Faulcon,2,avisf+student+academy@chalk.com,avisf+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "7,Marybeth,Bolduc,2,marybethb+student+academy@chalk.com,Null,Null,Null,Null\n" +
                    "8,Scarlet,Alt,2,scarleta+student+academy@chalk.com,scarleta+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "9,Rheba,Loftin,2,rhebal+student+academy@chalk.com,Null,Null,Null,Null\n" +
                    "10,Marvel,Alexander,2,marvela+student+academy@chalk.com,Null,Null,Null,Null\n" +
                    "11,Terri,Robeson,2,terrir+student+academy@chalk.com,terrir+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "12,Titus,Seese,3,tituss+student+academy@chalk.com,tituss+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "13,Dionne,Heron,3,dionneh+student+academy@chalk.com,dionneh+guardian+academy@chalk.com,dionneh2+guardian+academy@chalk.com,Null,Null\n" +
                    "14,Tanna,Weisberg,3,tannaw+student+academy@chalk.com,tannaw+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "15,Ethel,Kleckner,3,ethelk+student+academy@chalk.com,Null,Null,Null,Null\n" +
                    "16,Lorenza,Waggener,3,lorenzaw+student+academy@chalk.com,lorenzaw+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "17,Nannie,Stupka,4,nannies+student+academy@chalk.com,nannies+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "18,Emile,Rincon,4,emiler+student+academy@chalk.com,Null,Null,Null,Null\n" +
                    "19,Zeneida,Hotard,4,zeneidah+student+academy@chalk.com,zeneidah+guardian+academy@chalk.com,Null,Null,Null\n" +
                    "20,Lenora,Speights,4,lenoras+student+academy@chalk.com,lenoras+guardian+academy@chalk.com,Null,Null,Null\n";
            bufferedWriter.write(dataToWrite);
            bufferedWriter.close();

        }
    }
}