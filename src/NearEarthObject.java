/**
 * Student Name: Shenphen Yeshi
 * SBU ID: 113814349
 * Recitation 3
 */

import java.text.ParseException;
import java.util.Date;

/**
 * This class represents a record in the database of asteroids currently tracked by NASA.
 * This class is constructed by the BigData library. It serves as a data container for the information that is already hosted by the NeoW API.
 */
public class NearEarthObject {
    private int referenceID;
    private String name;
    private double absoluteMagnitude;
    private double averageDiameter;
    private boolean isDangerous;
    private Date closestApproachDate;
    private double missDistance;
    private String orbitingBody;

    /**
     * Default Constructor
     *
     * @param referenceID          Unique the ID of the NEO.
     *                             Fetched using the "near_earth_objects/neo_reference_id" identifier.
     * @param name                 Unique name of the asteroid or orbital body.
     *                             Fetched using the "near_earth_objects/name" identifier.
     * @param absoluteMagnitude    Absolute brightness of the asteroid or orbital body in the sky.
     *                             Fetched using the "near_earth_objects/absolute_magnitude_h" identifier.
     * @param minDiameter          Estimated minimum diameter of the asteroid or orbital body in kilometers. This parameter should be used in conjunction with the maxDiameter parameter to calculate and initialize the averageDiameter member variable.
     *                             Fetched using the "near_earth_objects/estimated_diameter/kilometers/estimated_diameter_min" identifier.
     * @param maxDiameter          Estimated maximum diameter of the asteroid or orbital body in kilometers. This parameter should be used in conjunction with the minDiameter parameter to calculate and initialize the averageDiameter member variable.
     *                             Fetched using the "near_earth_objects/estimated_diameter/kilometers/estimated_diameter_max" identifier.
     * @param isDangerous          Boolean value indicating whether the astroid or orbital body is a potential impact threat.
     *                             Fetched using the "near_earth_objects/is_potentially_hazardous_asteroid" identifier.
     * @param closestDateTimestamp Unix timestamp representing the date of closest approach. Note that this can be used to directly construct the closestApproachDate member variable, as the Date class provides a constructor taking a timestamp as a parameter.
     *                             Fetched using the "near_earth_objects/close_approach_data/epoch_date_close_approach" identifier.
     * @param missDistance         Distance in kilometers at which the asteroid or orbital body will pass by the Earth on the date of it's closest approach.
     *                             Fetched using the "near_earth_objects/close_approach_data/miss_distance/kilometers" identifier.
     * @param orbitingBody         Planet or other orbital body which this NEO orbits.
     *                             Fetched using the "near_earth_objects/close_approach_data/orbiting_body" identifier.
     * @throws ParseException if the data cannot correctly be retrieved.
     */
    public NearEarthObject(int referenceID, String name, double absoluteMagnitude, double minDiameter, double maxDiameter, boolean isDangerous, long closestDateTimestamp, double missDistance, String orbitingBody) throws ParseException {
        this.referenceID = referenceID;
        this.name = name;
        this.absoluteMagnitude = absoluteMagnitude;
        this.averageDiameter = (minDiameter + maxDiameter) / 2;
        this.isDangerous = isDangerous;
        this.closestApproachDate = new Date(closestDateTimestamp);
        this.missDistance = missDistance;
        this.orbitingBody = orbitingBody;
    }

    /**
     * Gets the int reference ID variable
     */
    public int getReferenceID() {
        return referenceID;
    }

    /**
     * Gets the String name variable
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the double absoluteMagnitude variable
     */
    public double getAbsoluteMagnitude() {
        return absoluteMagnitude;
    }

    /**
     * Gets the double average variable
     */
    public double getAverageDiameter() {
        return averageDiameter;
    }

    /**
     * Gets the boolean isDangerous variable
     */
    public boolean getIsDangerous() {
        return isDangerous;
    }

    /**
     * Gets the close approaching date variable (Date class)
     */
    public Date getClosestApproachDate() {
        return closestApproachDate;
    }

    /**
     * Gets the miss distance member variable
     */
    public double getMissDistance() {
        return missDistance;
    }

    /**
     * Gets the String orbiting body variable
     */
    public String getOrbitingBody() {
        return orbitingBody;
    }

    /**
     * Setter Method for referenceID
     *
     * @param referenceID Int variable
     */
    public void setReferenceID(int referenceID) {
        this.referenceID = referenceID;
    }

    /**
     * Setter method for name
     *
     * @param name String variable
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method for the absolute magnitude
     *
     * @param absoluteMagnitude double variable
     */
    public void setAbsoluteMagnitude(double absoluteMagnitude) {
        this.absoluteMagnitude = absoluteMagnitude;
    }

    /**
     * Setter method for the average diameter
     *
     * @param averageDiameter double variable
     */
    public void setAverageDiameter(double averageDiameter) {
        this.averageDiameter = averageDiameter;
    }

    /**
     * Setter method for isDangerous
     *
     * @param isDangerous boolean variable
     */
    public void setDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    /**
     * Setter method for closestApproachDate
     *
     * @param closestApproachDate Date class object
     */
    public void setClosestApproachDate(Date closestApproachDate) {
        this.closestApproachDate = closestApproachDate;
    }

    /**
     * Setter method for missDistance
     *
     * @param missDistance double variable
     */
    public void setMissDistance(double missDistance) {
        this.missDistance = missDistance;
    }

    /**
     * Setter method for orbitingBody
     *
     * @param orbitingBody String variable
     */
    public void setOrbitingBody(String orbitingBody) {
        this.orbitingBody = orbitingBody;
    }

    /**
     * Custom toString() method that returns a simple formatted string of all member variables.
     *
     * @return String consisting for member variables.
     */
    public String toString() {
        return getReferenceID() + " " + getName() + " " + getAbsoluteMagnitude() + " " + getAverageDiameter() + " " + getIsDangerous() + " " + getClosestApproachDate() + " " + getMissDistance() + " " + getOrbitingBody();
    }
}

