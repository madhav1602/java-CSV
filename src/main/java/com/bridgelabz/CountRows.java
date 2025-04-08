package com.bridgelabz;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class CountRows {
    public static void main(String[] args) {
        int rows=0;
        try(CSVReader reader = new CSVReader(new FileReader("src/main/java/com/bridgelabz/StudentOutput.csv"))){
            String[] line;
            while((line = reader.readNext())!=null){
                rows++;
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Count of rows: "+(rows-1));
    }
}
