package com.jeffapps.calculator;

import static java.lang.Math.*;

public class DistancesCalculator {
    double R  = 6371.0;
    double PI = 3.14159265359;


    public double calculate(double lat1, double lon1, double lat2, double lon2) {
        if (lat1 == 0 || lat2 == 0 || lon1 == 0 || lon2 == 0) return 0;

        lat1 = lat1 * PI / 180.0;

        lat2 = lat2 * PI / 180.0;

        lon1 = lon1 * PI / 180.0;

        lon2 = lon2 * PI / 180.0;

        double distance = 0.0;

        distance = acos(sin(lat1) * sin(lat2) + cos(lat1) * cos(lat2) * cos(lon2 - lon1)) * R;





        return distance;
    }

    public double distanceFrom(double lat1, double lon1, double lat2, double lon2)  {
        double R = 6378.1; // km
        double dLat = Math.toRadians(lat1-lat2);
        double dLon = Math.toRadians(lon1-lon2);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(lat1)) *
                        Math.sin(dLon/2) * Math.sin(dLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return R * c;
    }
}
