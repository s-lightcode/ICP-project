package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Airlines {
    private int airlineID ;
    private String airlineName;
    private String allias;
    private String IATA;
    private String ICAO;
    private String callSign;
    private String active;


    public Airlines(int airlineID, String airlineName, String allias, String IATA, String ICAO,
                    String callSign,
                    String active){
        this.airlineID = airlineID;
        this.airlineName = airlineName;
        this.allias = allias;
        this.IATA = IATA;
        this.ICAO = ICAO;
        this.callSign = callSign;
        this.active = active;
    }


    @Override
    public String toString()
    { return  airlineID+",\t"+airlineName+",\t"+allias
            +",\t"+IATA+",\t"+ICAO+",\t"+callSign+",\t"+active; }


    public static void main(String [] args) {

        List<Airlines> airlines = readairlines("C:\\Users\\nice.ineza\\Downloads\\Assignment\\airports.csv");
        for(Airlines a: airlines){
            System.out.println(a);
        }
        System.out.println("let check : "+airlines.get(5));
    }

    public static List<Airlines> readairlines(String  fileName){
        List<Airlines> airlines = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try(BufferedReader readness = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)){

            String line = readness.readLine();

            while(line !=  null ){
                String [] attributes = line.split(",");

                Airlines airline = createAirline(attributes);
                airlines.add(airline);
                line = readness.readLine();
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return airlines;
    }
    public static Airlines createAirline(String[] airdata){
        int airlineID = Integer.parseInt(airdata[0]) ;
        String airlineName = airdata[1];
        String  allias = airdata[2];
        String IATA = airdata[3];
        String ICAO = airdata[4];
        String callSign = airdata[5];
        String active = airdata[6];

        return new Airlines(airlineID, airlineName, allias, IATA, ICAO, callSign, active);
    }

}


