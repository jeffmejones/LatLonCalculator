package com.jeffapps.calculator;

import com.jeffapps.calculator.model.Location;

import static java.lang.Math.*;
import static java.lang.Math.toDegrees;

public class LatLonCalculator {


    public static void main(String[] args) {
        LatLonCalculator latLonCalculator = new LatLonCalculator();

        double lat1Input = 41.028381;
        double lon1Input = -81.625397;
        double distancesInput = 800;
        double bearingInput = 62;

        Location target = latLonCalculator.calculate(lat1Input,lon1Input,distancesInput,bearingInput);

        System.out.print(" lat = " + target.getLat());
        System.out.print(" lon = " + target.getLon());
        //see unit test
        //double expectedTargetLat = 44.076596357693234;
        //double expectedTargetLon = -72.77107380313763;
    }


    public Location calculate(double lat1Input, double lon1Input, double distancesInput, double bearingInput){

        double R = 6371.0 ;//Radius of the Earth
        bearingInput = Math.toRadians(bearingInput);

        lat1Input = toRadians(lat1Input);
        lon1Input  = toRadians(lon1Input);

        double lat2 = asin( sin(lat1Input)*cos(distancesInput/R) +
                cos(lat1Input)*sin(distancesInput/R)*cos(bearingInput));

        double lon2 = lon1Input + atan2(sin(bearingInput)*sin(distancesInput/R)*cos(lat1Input),
                cos(distancesInput/R)-sin(lat1Input)*sin(lat2));


        lat2 = toDegrees(lat2);
        lon2 = toDegrees(lon2);
        System.out.print("lat = " + lat2);
        System.out.print(" lon = " + lon2);
        return new Location(lat2,lon2);
    }
}
