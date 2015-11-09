package com.nursh;

import java.util.HashMap;
import java.util.Map;

public class HundredDoors {

    private static final int MAX_DOORS = 100;
    private Map<Integer, DoorStatus> Doors;

    public HundredDoors(){
        Doors = new HashMap<>();
    }

    private void insertDoors() {
        int door = 1;
        for(; door <= MAX_DOORS; door++){
            Doors.put(door, DoorStatus.Close);
        }
    }
}
