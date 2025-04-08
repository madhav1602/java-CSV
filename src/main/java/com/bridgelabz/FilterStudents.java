package com.bridgelabz;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class FilterStudents {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("src/main/java/com/bridgelabz/Student.csv"))){
            String[] line;
            reader.readNext(); //skipping the header

            while((line=reader.readNext())!=null){
                int marks = Integer.parseInt(line[3]);
                if(marks >80){
                    System.out.println(line[0]+" "+line[1]+" "+line[2]+" "+marks);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
