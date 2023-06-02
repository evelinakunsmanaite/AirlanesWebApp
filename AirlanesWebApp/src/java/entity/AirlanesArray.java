/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shishkis
 */
public class AirlanesArray {

    private static Airlanes[] airlanes;

    private static ArrayList<Airlanes> listDestination = new ArrayList<>();
    private static ArrayList<Airlanes> listWeek = new ArrayList<>();
    private static ArrayList<Airlanes> listWeekAndTime = new ArrayList<>();

    private static LocalTime departureTime1 = LocalTime.of(12, 30);
    private static LocalTime departureTime2 = LocalTime.of(13, 10);
    private static LocalTime departureTime3 = LocalTime.of(14, 20);
    private static LocalTime departureTime4 = LocalTime.of(15, 21);
    private static LocalTime departureTime5 = LocalTime.of(16, 25);

    static {
        airlanes = new Airlanes[5];
        airlanes[0] = new Airlanes(1, "Boeing", "Minsk", departureTime1, "Monday");
        airlanes[1] = new Airlanes(2, "BusinessJET", "LosAngeles", departureTime2, "Tuesday");
        airlanes[2] = new Airlanes(3, "Comfort+", "Vienna", departureTime3, "Wendsday");
        airlanes[3] = new Airlanes(4, "JETBlack", "Deggu", departureTime4, "Thursday");
        airlanes[4] = new Airlanes(5, "Airbus", "Daugapils", departureTime5, "Friday");
    }

    public static List<Airlanes> getAirlanes() {
        return Arrays.asList(airlanes);
    }

    public static ArrayList<Airlanes> getListDestination(String destination) {
        for (Airlanes airlane : getAirlanes()) {
            if (destination.equals(airlane.getDestination())) {
                listDestination.add(airlane);
            }
        }
        return listDestination;
    }
    public static ArrayList<Airlanes> getListWeek(String week) {
        for (Airlanes airlane : getAirlanes()) {
            if (week.equals(airlane.getWeek())) {
                listWeek.add(airlane);
            }
        }
        return listWeek;
    }

    public static ArrayList<Airlanes> getListWeekAndTime(String week, String timeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.parse(timeString, formatter);
        for (Airlanes airlane : getAirlanes()) {
           if (week.equals(airlane.getWeek())) {
                if (time.compareTo(airlane.getDepartureTime()) < 0) {
                    listWeekAndTime.add(airlane);
                }
            }
        }
        return listWeekAndTime;
    }
}
