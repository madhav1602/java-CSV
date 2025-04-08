package com.bridgelabz;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TopSalary {
    public static void main(String[] args) {
        List<String[]> employees = new ArrayList<>();

        try(CSVReader reader  = new CSVReader(new FileReader("src/main/java/com/bridgelabz/Employees.csv"))){
            String[] header = reader.readNext();
            String[] line;

            while((line = reader.readNext())!=null){
                employees.add(line);
            }

            employees.sort((a,b) -> {
                double sal1 = Double.parseDouble(a[2]);
                double sal2 = Double.parseDouble(b[2]);
                return Double.compare(sal2,sal1);
            });



            for(int i=0;i<5;i++){
                String[] employee = employees.get(i);
                System.out.println("Name: "+employee[0]+", Department: "+employee[1]+", Salary: "+employee[2]);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
