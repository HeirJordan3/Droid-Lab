package com.codedifferently.droid;

public class Droid {
    String name;
    int batteryLevel;


    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;

    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing a task: " + task);

    }

    public int newBatteryLevel(){
        int newBatteryLife = batteryLevel - 10 ;
        batteryLevel = newBatteryLife ;
        return newBatteryLife;

    }




    public static void main(String[] args) {

        Droid droid1 = new Droid("Codey");
        System.out.println(droid1);
        droid1.performTask("dancing");
        System.out.println(droid1.batteryLevel);
        System.out.println(droid1.newBatteryLevel());
        droid1.performTask("run");
        droid1.performTask("workout");
        System.out.println(droid1.newBatteryLevel());
        System.out.println(droid1.newBatteryLevel());


    }
}
