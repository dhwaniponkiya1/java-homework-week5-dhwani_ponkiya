package javaweek5;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Program10Station {
    public static void main(String[] args) {
        // Create a map to associate Zone 1 stations with the lines that pass through them
        Map<String, String> zone1Stations = new HashMap<>();

        // Populate the map with Zone 1 station names and their corresponding lines
        zone1Stations.put("Bank", "Bakerloo, Central, Victoria");
        zone1Stations.put("Kennington", "Circle, Jubilee, Northern, Waterloo & City");
        zone1Stations.put("Bond Street", "Central, Circle, District, Hammersmith & City");
        zone1Stations.put("Waterloo", "Victoria, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");

        String stationToQuery = "Waterloo";

        if (zone1Stations.containsKey(stationToQuery)) {
            String lines = zone1Stations.get(stationToQuery);
            System.out.println("The following lines pass through " + stationToQuery + ": " + lines);
        } else
            System.out.println(stationToQuery + " is not a Zone 1 station.");

    }
}
