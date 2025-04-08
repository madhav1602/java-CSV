package com.bridgelabz;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class SearchStudent {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("src/main/java/com/bridgelabz/StudentOutput.csv"))){
            String[] records;
            reader.readNext();
            while ((records=reader.readNext())!=null){
                if(records[1].equals("Madhav")){
                    System.out.println(records[0]+" "+records[1]+" "+records[2]+" "+records[3]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
