/*
LeetCode's Problem
# 1603 - Design Parking System - Easy
*/

import java.util.ArrayList;

public class DesignParkingSystem {

    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        arr.add(null);
        
        arr.add(parkingSystem.addCar(1));
        arr.add(parkingSystem.addCar(2));
        arr.add(parkingSystem.addCar(3));
        arr.add(parkingSystem.addCar(1));
        
        System.out.println("# test_case: " + arr.toString());

    }
}

class ParkingSystem {
    private static int big;
    private static int medium;
    private static int small;

    public ParkingSystem(int big, int medium, int small) {
        ParkingSystem.big = big;
        ParkingSystem.medium = medium;
        ParkingSystem.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1) {
            if(ParkingSystem.big >= 1) {
                ParkingSystem.big -= 1;
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if(ParkingSystem.medium >= 1) {
                ParkingSystem.medium -= 1;
                return true;
            } else {
                return false;
            }
        } else {
            if(ParkingSystem.small >= 1) {
                ParkingSystem.small -= 1;
                return true;
            } else {
                return false;
            }
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */