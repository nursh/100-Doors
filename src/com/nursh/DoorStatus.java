package com.nursh;
public enum DoorStatus {
    Open("Opened"),
    Close("Closed");

    private String status;

    DoorStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
