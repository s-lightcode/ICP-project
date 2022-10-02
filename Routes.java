package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Routes {
    private String airlineCode ;
    private String airlineId;
    private String sourceOfAirport;
    private String airportId;
    private String destinationAirport;
    private String destinationId;
    private String codeShare;
    private String stops;
    private String equipment;

    public Routes(String airlineCode, String airlineId, String sourceOfAirport,
                  String airportId, String destinationAirport,
                  String destinationId, String codeShare, String stops, String equipment){
                        this.airlineCode = airlineCode;
                        this.airlineId = airlineId;
                        this.sourceOfAirport = sourceOfAirport;
                        this.airportId = airportId;
                        this.destinationAirport = destinationAirport;
                        this.destinationId = destinationId;
                        this.codeShare = codeShare;
                        this.stops = stops;
                        this.equipment = equipment;
    }


    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public void setSourceOfAirport(String sourceOfAirport) {
        this.sourceOfAirport = sourceOfAirport;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public void setCodeShare(String codeShare) {
        this.codeShare = codeShare;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public String getSourceOfAirport() {
        return sourceOfAirport;
    }

    public String getAirportId() {
        return airportId;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDestinationInd() {
        return destinationId;
    }

    public String getCodeShare() {
        return codeShare;
    }

    public String getStops() {
        return stops;
    }

    public String getEquipment() {
        return equipment;
    }
    @Override
    public String toString()
    { return  airlineCode+","+airlineId+","+sourceOfAirport+","+airportId+","+destinationAirport+","+destinationId+","+codeShare+","+stops+","+equipment; }


    public static void main(String [] args) {

        List<Routes> routes = readreroutes("C:\\Users\\nice.ineza\\Downloads\\Assignment\\routes.csv");
        for(Routes r: routes){
            System.out.println(r);
        }
    }

    private static List<Routes> readreroutes(String  fileName){
        List<Routes> routes = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try(BufferedReader readness = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){

            String line = readness.readLine();

            while(line !=  null ){
                String [] attributes = line.split(",");

                Routes route = createRoute(attributes);
                routes.add(route);
                line = readness.readLine();
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return routes;
    }

    private static Routes createRoute(String[] anydata){
        String airlineCode = anydata[0];
        String airlineId = (anydata[1]);
        String sourceOfAirport = anydata[2];
        String airportId = (anydata[3]);
        String destinationAirport = anydata[4];
        String destinationId = anydata[5];
        String codeShare = anydata[6];
        String stops = (anydata[7]);
        String equipment = String.valueOf(anydata.length-1);

        return new Routes(airlineCode, airlineId, sourceOfAirport, airportId,destinationAirport,destinationId,codeShare,stops,equipment);
    }

}
