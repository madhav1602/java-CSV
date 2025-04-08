package com.bridgelabz;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) throws Exception {
        Set<String> set = new HashSet<>();
        List<String[]> list = new ArrayList<>();

        CSVReader reader = new CSVReader(new FileReader("src/main/java/com/bridgelabz/Student.csv"));
        reader.readNext(); // Skip header

        String[] line;
        while ((line = reader.readNext()) != null) {
            String id = line[0];
            if (set.contains(id)) {
                list.add(line);
            } else {
                set.add(id);
            }

        }
        reader.close();

        if (list.isEmpty()) {
            System.out.println("No duplicate");
        } else {
            for (String[] record : list) {
                System.out.println(Arrays.toString(record));
            }
        }
    }
}
