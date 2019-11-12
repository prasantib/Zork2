package com.company;
public class Array {
    private int [][] location = new int[4][4];

    public int[][] getLocation() {
        return location;
    }

    public void setLocation(int[][] location) {
        this.location = location;
    }

    public Array(int[][] location) {
        this.location = location;
    }
    public void welcomeText(){
        System.out.println("Location: " + location);
    }
}