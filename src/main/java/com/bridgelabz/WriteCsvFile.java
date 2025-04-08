package com.bridgelabz;

import com.opencsv.CSVWriter;

import java.io.FileWriter;

public class WriteCsvFile {
    public static void main(String[] args) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("src/main/java/com/bridgelabz/StudentOutput.csv"))){
            String[] header = {"ID","Name","Age","Marks"};
            String[] student1 = {"101","Madhav","21","99"};
            String[] student2 = {"102","Dhruv","22","98"};
            String[] student3 = {"103","Simran","25","95"};
            String[] student4 = {"104","Pranav","24","93"};
            String[] student5 = {"105","Ayush","22","91"};

            writer.writeNext(header);
            writer.writeNext(student1);
            writer.writeNext(student2);
            writer.writeNext(student3);
            writer.writeNext(student4);
            writer.writeNext(student5);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
