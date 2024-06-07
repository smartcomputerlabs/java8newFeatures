package org.javacommunity.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        try {
            // Read values from csv file
            // For this testing we have used the data from https://catalog.data.gov/dataset/crime-data-from-2020-to-present/resource/5eb6507e-fa82-4595-a604-023f8a326099
            // change the file path according to you csv file location
            InputStream is = new FileInputStream("H:/javacommunity/Crime_Data_from_2020_to_Present.csv");
            FileReader fr = new FileReader("H:/javacommunity/Crime_Data_from_2020_to_Present.csv");
            BufferedReader br2 = new BufferedReader(new FileReader("H:/javacommunity/Crime_Data_from_2020_to_Present.csv"));
            String line2;
            LinkedList<String> linkedList = new LinkedList<>();
            Date d3 = new Date();
            long instant3 = d3.getTime();
            while ((line2 = br2.readLine()) != null) {
                linkedList.add(line2);
            }
            Date d4 = new Date();
            long instant4 = d4.getTime();
            System.out.println("*** Time taken to add "+linkedList.size()+" records to Linked-List = " + (instant4 - instant3)+" milli seconds");
            //Uncomment following line to print Linked-List
            //linkedList.stream().peek(System.out::println).count();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
