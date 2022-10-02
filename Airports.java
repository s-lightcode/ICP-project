package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Airports {
        private int airportID ;
        private String name;
        private String city;
        private String country;
        private String IATA;
        private String ICAO;
        private double latitude;
        private double longitude;
        private double altitude;
        private double timezone;
        private String DST;
        private String databaseTimeZone;
        private String typeOfAirport;
        private String sourceOfData;
//        private Set<Airports>incomingFlight = new HashSet<>();
//        private Set<Airports> outgoingFlight = new HashSet<>();

 //   @Override
//    public String toString() {
//        return "Airports{" +
//                "incomingFlight=" + incomingFlight +
//                ", outgoingFlight=" + outgoingFlight +
//                '}';
//
//    }

//    public Set<Airports> getIncomingFlight() {
//        return incomingFlight;
//    }
//
//    public void setIncomingFlight(Set<Airports> incomingFlight) {
//        this.incomingFlight = incomingFlight;
//    }
//
//    public Set<Airports> getOutgoingFlight() {
//        return outgoingFlight;
//    }
//
//    public void setOutgoingFlight(Set<Airports> outgoingFlight) {
//        this.outgoingFlight = outgoingFlight;
//    }

    public Airports(int airportID, String name, String city, String country, String IATA, String ICAO,
                    double latitude, double longitude, double altitude, double timezone,
                    String DST, String databaseTimeZone, String typeOfAirport, String sourceOfData){
            this.airportID = airportID;
            this.name = name;
            this.city = city;
            this.country= country;
            this.IATA = IATA;
            this.ICAO = ICAO;
            this.latitude = latitude;
            this.longitude = longitude;
            this.altitude = altitude;
            this.timezone = timezone;
            this.DST = DST;
            this.databaseTimeZone= databaseTimeZone;
            this.typeOfAirport = typeOfAirport;
            this.sourceOfData = sourceOfData;
        }

        public static void main() {
        }

        public int getAirportID() {
            return airportID;
        }

        public void setAirportID(int airportID) {
            this.airportID = airportID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getIATA() {
            return IATA;
        }

        public void setIATA(String IATA) {
            this.IATA = IATA;
        }

        public String getICAO() {
            return ICAO;
        }

        public void setICAO(String ICAO) {
            this.ICAO = ICAO;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getAltitude() {
            return altitude;
        }

        public void setAltitude(double altitude) {
            this.altitude = altitude;
        }

        public double getTimezone() {
            return timezone;
        }

        public void setTimezone(double timezone) {
            this.timezone = timezone;
        }

        public String getDST() {
            return DST;
        }

        public void setDST(String DST) {
            this.DST = DST;
        }

        public String getDatabaseTimeZone() {
            return databaseTimeZone;
        }

        public void setDatabaseTimeZone(String databaseTimeZone) {
            this.databaseTimeZone = databaseTimeZone;
        }

        public String getTypeOfAirport() {
            return typeOfAirport;
        }

        public void setTypeOfAirport(String typeOfAirport) {
            this.typeOfAirport = typeOfAirport;
        }

        public String getSourceOfData() {
            return sourceOfData;
        }

        public void setSourceOfData(String sourceOfData) {
            this.sourceOfData = sourceOfData;
        }

        @Override
        public String toString()
        { return  airportID+",\t"+name+",\t"+city
                +",\t"+country+",\t"+IATA+",\t"+ICAO+",\t"+latitude+",\t"+longitude+",\t"+altitude
                +",\t"+timezone+",\t"+DST+",\t"+databaseTimeZone+",\t"+typeOfAirport+",\t"+sourceOfData; }
        public static List<Airports> airports = new ArrayList<>();

        public static void main(String [] args) {

            List<Airports> airports = readairports("C:\\Users\\nice.ineza\\Downloads\\Assignment\\airports.csv");
            for(Airports a: airports){
                System.out.println(a);
            }
            System.out.print(airports.get(0));
        }

        public static List<Airports> readairports(String  fileName){

            Path pathToFile = Paths.get(fileName);

            try(BufferedReader readness = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)){

                String line = readness.readLine();

                while(line !=  null ){
                    String [] attributes = line.split(",");

                    Airports airport = createAirport(attributes);
                    airports.add(airport);
                    line = readness.readLine();
                }
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
            return airports;
        }

        public static Airports createAirport(String[] airdata){
            int airportID = Integer.parseInt(airdata[0]) ;
            String name = airdata[1];
            String city = airdata[2];
            String country = airdata[3];
            String IATA = airdata[4];
            String ICAO = airdata[5];
            double latitude = Double.parseDouble(airdata[6]);
            double longitude = Double.parseDouble(airdata[7]);
            double altitude = Double.parseDouble(airdata[8]);
            double timezone = Double.parseDouble(airdata[9]);
            String DST = airdata[10];
            String databaseTimeZone = airdata[11];
            String typeOfAirport = airdata[12];
            String sourceOfData = airdata[13];

            return new Airports(airportID, name, city, country, IATA, ICAO, latitude, longitude, altitude, timezone, DST, databaseTimeZone, typeOfAirport, sourceOfData);


    }}


