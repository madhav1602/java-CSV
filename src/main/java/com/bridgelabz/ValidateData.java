package com.bridgelabz;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("src/main/java/com/bridgelabz/Information.csv"))){
            String[] header = reader.readNext();

            String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]{2,}";
            Pattern pattern1 = Pattern.compile(emailRegex);

            String numberRegex = "[0-9]{10}";
            Pattern pattern2 = Pattern.compile(numberRegex);

            String[] line;
            while((line= reader.readNext())!=null){

                Matcher matcher1 = pattern1.matcher(line[1]);
                Matcher matcher2 = pattern2.matcher(line[2]);
                if(matcher1.matches() && matcher2.matches()){

                    System.out.println(line[0]+" "+line[1]+" "+line[2]);

                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}