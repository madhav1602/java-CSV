package com.bridgelabz;

import java.io.*;


public class ReadCsvFile {
    public static void main(String[] args) throws Exception{
        try(BufferedReader bf = new BufferedReader(new FileReader("src/main/java/com/bridgelabz/Student.csv"))){
            String line;
            while((line = bf.readLine())!=null){
                String[] columns = line.split(",");
                System.out.println(columns[0]+" , "+columns[1]+" , "+columns[2]+" , "+columns[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
