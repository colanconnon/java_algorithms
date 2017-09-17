package com.colanconnon.app;

/**
 * Created by colanconnon on 1/28/17.
 */
public class DistanceBetweeClockHands {

    public static int FindDistance(int minuteHand, int hourHand) {

        if (hourHand == 12) hourHand = 0;
        int minuteHandDegrees = minuteHand * 6;
        int hourHandDegrees = (int) Math.floor(.5 * (hourHand * 60 + minuteHand));


        int forwardDegrees = Math.abs(hourHandDegrees - minuteHandDegrees);
        int backwardDegrees = Math.abs(hourHandDegrees + minuteHandDegrees);

        if (forwardDegrees > 360) forwardDegrees = forwardDegrees - 360;
        if (backwardDegrees > 360) backwardDegrees = backwardDegrees - 360;


        return forwardDegrees < backwardDegrees ? forwardDegrees : backwardDegrees;
    }
}
