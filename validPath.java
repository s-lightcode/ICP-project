//package Assignment;
//import java.io.*;
//import java.nio.Buffer;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//
//public class RouteFinder {
//    private static Object startcity;
//    //String startcity;
//    private static Object endcity;
//    private static Object startcountry;
//    private static Object endcountry;
//
//    final static String filepath = "C:\\Users\\nice.ineza\\Downloads\\Assignment\\airports.csv";
//
//
//    public static void main(String[] args) {
////        Map<String, String> mapoftheworld = HashMapFromCsvFile();
////        for(Map.Entry<String, String>entry :: mapoftheworld.entrySet()){
////            System.out.println(newmap);
////        }
//
//
//        //Map<String, String> newmap = new HashMap<String, String>();
//        //List<Routes> routes = new ArrayList<String>();
////       // Map<String, String> newmap = ArrayListMultimap<String, String>();
////        String line = "";
////        String splitBy = ",";
//        List<String> allinput = null;
//
//        BufferedReader worldmap = null;
//        try{
//
//            File airports = new File(filepath);
//            worldmap = new BufferedReader(new FileReader(airports));
//
//            String oneline = null;
//
//            while((oneline = worldmap.readLine()) != null){
//
//                String [] diffparts = oneline.split(splitBy);
//                String airportid =diffparts[0].trim();
//                String airportcity = diffparts[2].trim();
//                String airportcountry = diffparts[3].trim();
//                //String airportname = diffparts[2];
//                valueofkey.add(diffparts[2], diffparts[3], diffparts[0]);
//                if (!airportcountry.equals(line)&& !airportcity.equals(line)&& !airportid.equals(line))
//                    newmap.put(airportcity, airportcountry);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            if( worldmap != null){
//                try{
//                    worldmap.close();
//                }catch(Exception e){};
//            }
//        }
////        for(Map.Entry<String, String>entry:newmap.entrySet()){
////            System.out.println(entry.getKey()+"\t\t"+entry.getValue()+"\t\t"+entry.getValue());
////        }
//
//
//        try {
//            allinput = Files.readAllLines(Paths.get("C:\\Users\\nice.ineza\\Documents\\userentry.txt"));
//        for (String entry : allinput) {
//            System.out.println(entry);
//        }
//             System.out.println(allinput.get(1));
//    } catch (IOException e) {
//        e.printStackTrace();
//
//
//    }}
////
//        BufferedReader details;
//        //BufferedReader otherdetails = null;
//        //BufferedReader moredetails = null;
//        String[] routes = new String[0];
//        try {
//            details = new BufferedReader(new FileReader("C:\\Users\\nice.ineza\\Downloads\\Assignment\\airlines.csv"));
//            while ((line = details.readLine()) != null) {
//                routes = line.split(splitBy);
//                System.out.println(routes[1]+"\t"+routes[2]+"\t\t"+routes[3]);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println("------------------------------------------------------------------------");
//
//
//        String[] airports = new String[0];
//        try {
//            details = new BufferedReader(new FileReader("C:\\Users\\nice.ineza\\Downloads\\Assignment\\airports.csv"));
//            while ((line = details.readLine()) != null) {
//                airports = line.split(splitBy);
//                System.out.println(airports[1]+"\t\t\t\t\t\t\t\t\t"+airports[2]+"\t\t\t\t\t\t"+airports[3]);
//            }
//        } catch (IOException ex) {ex.printStackTrace();}
//        System.out.println("------------------------------------------------------------------------");
//
//
//        String[] airlines = new String [0];
//        try {
//            details = new BufferedReader(new FileReader("C:\\Users\\nice.ineza\\Downloads\\Assignment\\routes.csv"));
//            while ((line = details.readLine()) != null) {
//                airlines = line.split(splitBy);
//                //System.out.println(airlines[1]+"\t\t\t\t\t\t\t\t\t"+airlines[2]+"\t\t\t\t\t\t"+airlines[3]);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
////
//        startcity = allinput.get(0);
//        endcity = allinput.get(2);
//        startcountry = allinput.get(1);
//        endcountry = allinput.get(3);
//        System.out.println("The startcity is:"+ startcity);
//        System.out.println("The startcity is:"+ endcity);
//        System.out.println("The startcity is:"+ endcountry);
//        while(true) {
//            if (Airports.main();contains(startcity)) {
//                System.out.println("The city at the target is :" + airports[2]);
//            }
//        }
////    }
////
////}
//
//
