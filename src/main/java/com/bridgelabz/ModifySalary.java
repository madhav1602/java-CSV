package com.bridgelabz;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class  ModifySalary {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("src/main/java/com/bridgelabz/Employees.csv"));
            CSVWriter writer = new CSVWriter(new FileWriter("src/main/java/com/bridgelabz/UpdatedEmployees.csv"))){

            String[] header;
            header = reader.readNext();
            writer.writeNext(header);
            String[] read;
            while((read = reader.readNext())!=null){
                if(read[1].equals("IT")){
                    double salary = Double.parseDouble(read[2]);
                    salary = salary*1.10;
                    read[2] = String.valueOf(salary);
                }
                writer.writeNext(read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
