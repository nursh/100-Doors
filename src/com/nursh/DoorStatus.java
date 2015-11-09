package com.nursh;
public enum DoorStatus {
    Open("Open"),
    Close("Close");

    private String status;

    DoorStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
