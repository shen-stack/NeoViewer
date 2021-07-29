/**
 * Student Name: Shenphen Yeshi
 * SBU ID: 113814349
 * Recitation 3
 */

import java.util.Comparator;

public class MissDistanceComparator implements Comparator<NearEarthObject> {
    /**
     * MissDistanceComparator would compare them based on the values of their MissDistance member variables.
     *
     * @param leftSide  NEO object leftSide
     * @param rightSide NEO object rightSide
     * @return An int value 0,-1,1
     */
    public int compare(NearEarthObject leftSide, NearEarthObject rightSide) {
        if (leftSide.getMissDistance() == rightSide.getMissDistance()) {
            return 0;
        }
        if (leftSide.getMissDistance() < rightSide.getMissDistance()) {
            return -1;
        }
        if (leftSide.getMissDistance() > rightSide.getMissDistance()) {
            return 1;
        }
        return -1;
    }
}