package com.jeffapps.calculator;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class DistancesCalculatorTest {

    DistancesCalculator distancesCalculator = new DistancesCalculator();


    @Test
    public void distances_calculator_test() {
        double expectedDistances = 19.374906329256483;//in km
        double lat1 = 41.028381;
        double lon1 = -81.625397;
        double lat2 = 41.12;
        double lon2 = -81.822;


        double distances = distancesCalculator.calculate(lat1, lon1, lat2, lon2);

        System.out.print("distances = " + distances);
        assertThat(distances, equalTo(expectedDistances));
    }

    @Test
    public void distances_calculator2_test() {
        double expectedDistances = 800.0000000000219;//in km
        double lat1 = 41.028381;
        double lon1 = -81.625397;
        double lat2 = 44.076596357693234;
        double lon2 = -72.77107380313763;


        double distances = distancesCalculator.calculate(lat1, lon1, lat2, lon2);

        System.out.print("distances = " + distances);
        assertThat(distances, equalTo(expectedDistances));
    }

    @Test
    public void distances_calculator3_test() {
        double expectedDistances = 21.45992521403341;//in km
        double lat2 = 52.39764097752146;
        double lon2 =  0.14922580057959914;
        double lat1 = 52.20472;
        double lon1 = 0.14056;


        double distances = distancesCalculator.calculate(lat1, lon1, lat2, lon2);

        System.out.print("distances = " + distances);
        assertThat(distances, equalTo(expectedDistances));
    }
}
