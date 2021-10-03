package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    synchronized public String getName() {
        return name;
    }

    synchronized public void setName(String name) {
        this.name = name;
    }

    synchronized public float getDistance() {
        return distance;
    }

   synchronized public void setDistance(float distance) {
        this.distance = distance;
    }

    synchronized public int getQuality() {
        return quality;
    }

    synchronized public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
   synchronized public int compareTo(Beach o) {
        int value = 0;
        value += Float.compare(this.quality, o.quality);
        value -= Float.compare(this.distance, o.distance);

        return value;
    }


    interface Comparable<Beach>{

    }

    public static void main(String[] args) {
Beach beach1 = new Beach("Sochi", (float) 1000.5, 4);
Beach beach2 = new Beach("Anapa", (float) 999.5, 5);
        System.out.println(beach1.compareTo(beach2));

    }
}
