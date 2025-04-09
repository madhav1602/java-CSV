package com.bridgelabz;
import java.io.*;
import java.util.*;

public class ReadCSV {

    static int size= 100;

    public static void readCsv(String filePath) {
        int totalCount = 0;
        List<String> list= new ArrayList<>(size);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Optionally read and skip header
            String header = br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);

                if (list.size() == size) {
                    totalCount += list.size();
                    System.out.println("Processed records: " + totalCount);
                    list.clear();
                }
            }

            // Process any remaining records
            if (!list.isEmpty()) {
                totalCount += list.size();
                System.out.println("Processed records: " + totalCount);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        String filePath = "src/main/java/com/bridgelabz/Student.csv";
        readCsv(filePath);
    }
}
