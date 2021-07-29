/**
 * Student Name: Shenphen Yeshi
 * SBU ID: 113814349
 * Recitation 3
 */

import java.util.Comparator;

public class ApproachDateComparator implements Comparator<NearEarthObject> {
    /**
     * ReferenceIDComparator would compare two NearEarthObjects based on the values of their referenceID member variables.
     *
     * @param leftSide  NEO object leftSide
     * @param rightSide NEO object rightSide
     * @return An int value 0,-1,1
     */
    public int compare(NearEarthObject leftSide, NearEarthObject rightSide) {
        return leftSide.getClosestApproachDate().compareTo(rightSide.getClosestApproachDate());
    }
}
