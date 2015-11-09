package com.nursh;

import java.util.HashMap;
import java.util.Map;

public class HundredDoors {

    private static final int MAX_DOORS = 100;
    private Map<Integer, DoorStatus> Doors;
    private int doorLevel;

    public HundredDoors(){
        Doors = new HashMap<>();
        doorLevel = 1;
        this.insertDoors();
    }

    private void insertDoors() {
        int door = 1;
        for(; door <= MAX_DOORS; door++){
            Doors.put(door, DoorStatus.Close);
        }
    }

    public void play() {
        while (doorLevel <= MAX_DOORS) {
            for (int door = doorLevel; door <= MAX_DOORS; ) {
                this.changeDoorStatus(door);
                door = getNextDoor(door);
            }
            doorLevel++;
        }
    }

    private int getNextDoor(int presentDoor) {
        return presentDoor + doorLevel;
    }

    private void changeDoorStatus(int door){
        if(Doors.get(door) == DoorStatus.Close ){
            Doors.put(door, DoorStatus.Open);
        } else {
            Doors.put(door, DoorStatus.Close);
        }
    }

    public void print() {
        System.out.println("After 100 runs:  ");
        for(int door = 1; door <= Doors.size(); door++){
            if(Doors.get(door).getStatus().equals("Opened"))
                System.out.println("Door " + door + " is " + Doors.get(door).getStatus());
        }
    }

}
