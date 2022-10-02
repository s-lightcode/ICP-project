package Assignment;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Trial {

    public static void main(String [] args) {
        String line = "";
        String splitBy = ",";

        BufferedReader details;
        //BufferedReader otherdetails = null;
        //BufferedReader moredetails = null;

        try {
            details = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\ICP\\routes.csv"));
            while ((line = details.readLine()) != null) {
                String[] routes = line.split(splitBy);
                //System.out.println(routes[1]+"\t"+routes[2]+"\t\t"+routes[3]);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("------------------------------------------------------------------------");

        String[] airports = new String[0];
        try {
            details = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\ICP\\airports.csv"));
            while ((line = details.readLine()) != null) {
                airports = line.split(splitBy);
                System.out.println(airports[1]+"\t\t\t\t\t\t\t\t\t"+airports[2]+"\t\t\t\t\t\t"+airports[3]);
            }
        } catch (IOException ex) {ex.printStackTrace();}
        System.out.println("------------------------------------------------------------------------");

        String[] airlines = new String [0];
        try {
            details = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\ICP\\airlines.csv"));
            while ((line = details.readLine()) != null) {
                airlines = line.split(splitBy);
                //System.out.println(airlines[1]+"\t\t\t\t\t\t\t\t\t"+airlines[2]+"\t\t\t\t\t\t"+airlines[3]);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        try {
//            otherdetails = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\ICP\\airports.csv"));
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        String[] airports = new String[0];
//        while (true) {
//            try {
//                if (((line = otherdetails.readLine()) != null)) break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            airports = line.split(splitBy);
//            //if(cityInput.equals(airports[2])){
//            System.out.println(airports[0] + "\t\t\t" + airports[2]);
//        }

//
//        try {
//            moredetails = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\ICP\\airlines.csv"));
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        String[] airlines = new String[0];
//        while (true) {
//            try {
//                assert moredetails != null;
//                if (((line = moredetails.readLine()) != null)) break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            assert line != null;
//            airlines = line.split(splitBy);
//            //if(cityInput.equals(airports[2])){
//            //System.out.println(airlines[0] + "\t\t\t" + airlines[2]);
//        }
//
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the city : ");
        String cityInput = Input.next();
        System.out.println(cityInput);
        if (cityInput.equals(airports[2])){
            if (airports[4].equals(airlines[3]))
                System.out.print("The Airport name in that city is : " + airlines[7]);
                }
           // }

            //System.out.println(airports[2]);
            //    public static void main(String[]args) throws Exception{
//           Scanner filedetails = new Scanner(new File("C:\\Users\\user\\Documents\\ICP\\airlines.csv"));
//           filedetails.useDelimiter(",");
//           while(filedetails.hasNext()){
//               System.out.print(filedetails.next());
//           }
//           filedetails.close();
//
//        }

        }
    }


