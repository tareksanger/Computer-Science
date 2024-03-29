/**
 * Created by Tarek Sanger on 2017-03-24.
 * Student Number: 101059686
 */

public class Taxi implements Comparable<Taxi>{
    private int plateNumber;
    private boolean available;
    private String destination;
    private int estimatedTimeToDest;

    public int getPlateNumber() {
        return plateNumber;
    }

    public boolean getAvailable() {
        return available;
    }

    public String getDestination() {
        return destination;
    }

    public int getEstimatedTimeToDest() {
        return estimatedTimeToDest;
    }

    public void setAvailable(boolean avail) {
        available = avail;
    }

    public void setDestination(String d) {
        destination = d;
    }

    public void setEstimatedTimeToDest(int t) {
        estimatedTimeToDest = t;
    }


    public void decreaseEstimatedTimeToDest() {
        estimatedTimeToDest--;
    }

    public Taxi(int plate) {
        plateNumber = plate;
        available = true;
        destination = "";
        estimatedTimeToDest = 0;
    }

    public String toString() {
        if (available)
            return plateNumber + " (available)";
        return plateNumber + "(" + estimatedTimeToDest + ")";
    }

    public boolean equals(Object x) {
        return x instanceof Taxi && plateNumber == ((Taxi) x).plateNumber;
    }
    public int hashCode() { return plateNumber; }
    public int compareTo(Taxi t) {
        return estimatedTimeToDest - t.estimatedTimeToDest;
    }
}

