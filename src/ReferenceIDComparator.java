/**
 * Student Name: Shenphen Yeshi
 * SBU ID: 113814349
 * Recitation 3
 */

import java.util.Comparator;

public class ReferenceIDComparator implements Comparator<NearEarthObject> {
    /**
     * ReferenceIDComparator would compare them based on the values of their ReferenceID member variables.
     *
     * @param leftSide  NEO object leftSide
     * @param rightSide NEO object rightSide
     * @return An int value 0,-1,1
     */
    public int compare(NearEarthObject leftSide, NearEarthObject rightSide) {
        if (leftSide.getReferenceID() == rightSide.getReferenceID()) {
            return 0;
        }
        if (leftSide.getReferenceID() < rightSide.getReferenceID()) {
            return -1;
        }
        if (leftSide.getReferenceID() > rightSide.getReferenceID()) {
            return 1;
        }
        return 1;
    }
}
