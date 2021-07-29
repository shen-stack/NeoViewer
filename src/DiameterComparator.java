/**
 * Student Name: Shenphen Yeshi
 * SBU ID: 113814349
 * Recitation 3
 */

import java.util.Comparator;

public class DiameterComparator implements Comparator<NearEarthObject> {
    /**
     * DiameterComparator would compare them based on the values of their averageDiameter member variables.
     *
     * @param leftSide  NEO object leftSide
     * @param rightSide NEO object rightSide
     * @return An int value 0,-1,1
     */
    public int compare(NearEarthObject leftSide, NearEarthObject rightSide) {
        if (leftSide.getAverageDiameter() == rightSide.getAverageDiameter()) {
            return 0;
        }
        if (leftSide.getAverageDiameter() < rightSide.getAverageDiameter()) {
            return -1;
        }
        if (leftSide.getAverageDiameter() > rightSide.getAverageDiameter()) {
            return 1;
        }
        return 1;
    }
}
