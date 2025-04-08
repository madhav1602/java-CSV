package com.bridgelabz;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class ConvertObjects {
    public static void main(String[] args) {
        try {FileReader reader = new FileReader("src/main/java/com/bridgelabz/Student.csv");
            CsvToBean<Studentt> record = new CsvToBeanBuilder<Studentt>(reader).withType(Studentt.class).build();

            List<Studentt> records = record.parse();

            for(Studentt Studentt : records){
                System.out.println(Studentt.getName()+" "+Studentt.getAge()+" "+Studentt.getMarks());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}