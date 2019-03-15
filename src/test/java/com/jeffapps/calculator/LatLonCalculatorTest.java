package com.jeffapps.calculator;

import com.jeffapps.calculator.model.Location;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class LatLonCalculatorTest {

    private LatLonCalculator latLonCalculator;
    private DistancesCalculator distancesCalculator;

    @Before
    public void setUp() throws Exception {
        distancesCalculator = new DistancesCalculator();
        latLonCalculator = new LatLonCalculator();
    }

    @Test
    public void calculate_target() {
        //expected values come from:
        //https://www.fcc.gov/media/radio/find-terminal-coordinates
        double expectedTargetLat = 44.076596357693234;
        double expectedTargetLon = -72.77107380313763;
        double lat1Input = 41.028381;
        double lon1Input = -81.625397;
        double distancesInput = 800;
        double bearingInput = 62;


        Location target = latLonCalculator.calculate(lat1Input,lon1Input,distancesInput,bearingInput);

        assertThat(target.getLat(), equalTo(expectedTargetLat));
        assertThat(target.getLon(), equalTo(expectedTargetLon));
    }

    @Test
    public void calculate_target2() {
        //expected values come from:
        //https://www.fcc.gov/media/radio/find-terminal-coordinates
        double expectedTargetLat = 52.39764097752146;
        double expectedTargetLon =  0.14922580057959914;
        double lat1Input = 52.20472;
        double lon1Input = 0.14056;
        double bearingInput = 1.57;//Bearing is 90 degrees converted to radians.
        double distancesInput = 21.45992521403341;//Distance in km


        Location target = latLonCalculator.calculate(lat1Input,lon1Input,distancesInput,bearingInput);


        assertThat(target.getLat(), equalTo(expectedTargetLat));
        assertThat(target.getLon(), equalTo(expectedTargetLon));
    }
}