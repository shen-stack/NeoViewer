/**
 * Student Name: Shenphen Yeshi
 * SBU ID: 113814349
 * Recitation 3
 */

import java.util.Scanner;

/**
 * NeoViewer allows a user to view datasets obtained from the NASA NeoW API.
 */
public class NeoViewer {
    private static int pageNum;
    private static NeoDatabase NeoData;
    private static ReferenceIDComparator sortId;
    private static DiameterComparator sortDiameter;
    private static MissDistanceComparator sortDistance;
    private static ApproachDateComparator sortDate;

    /**
     * The main method runs a menu driven application which creates a NeoDatabase instance and then prompts the user for a menu command selecting the operation.
     * The required information is then requested from the user based on the selected operation.
     * @throws Exception If user tries to sort or print a page without adding one or an invalid page number.
     */
    public static void main(String[] args) {
        NeoData = new NeoDatabase();
        Scanner stdin = new Scanner(System.in);
        char input;
        char input2;
        String URL;
        sortId = new ReferenceIDComparator();
        sortDiameter = new DiameterComparator();
        sortDistance = new MissDistanceComparator();
        sortDate = new ApproachDateComparator();
        System.out.println("Welcome to NEO viewer!");
        do {

            System.out.println("\nOption Menu:\n" + "A) Add a page to the database\n" + "S) Sort the database \n" + "P) Print the database as a table.\n" + "Q) Quit");
            System.out.println("Select a menu option: ");
            input = stdin.next().charAt(0);
            if (input == 'A') {
                try {
                    System.out.println("Enter the page to load: ");
                    pageNum = stdin.nextInt();
                    URL = NeoData.buildQueryURL(pageNum);
                    NeoData.addAll(URL);
                    System.out.println("Page loaded successfully!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + "\nTry Again.");
                }
            }
            if (input == 'P') {
                try {
                    NeoData.printTable();
                } catch (Exception e) {
                    System.out.println("\nYou must add a valid page. Try Again.");
                }
            }
            if (input == 'S') {
                System.out.println("\nR) Sort by referenceID\n" + "D) Sort by diameter\n" + "A) Sort by approach date\n" + "M) Sort by miss distance");
                input2 = stdin.next().charAt(0);
                try {
                    if (input2 == 'R') {
                        NeoData.sort(sortId);
                        NeoData.printTable();
                    }
                    if (input2 == 'D') {
                        NeoData.sort(sortDiameter);
                        NeoData.printTable();
                    }
                    if (input2 == 'A') {
                        NeoData.sort(sortDate);
                        NeoData.printTable();
                    }
                    if (input2 == 'M') {
                        NeoData.sort(sortDistance);
                        NeoData.printTable();
                    }
                } catch (NullPointerException e) {
                    System.out.println("You must add a valid page. Try again.");
                }
            }
        } while (input != 'Q');
        System.out.println("Program terminating normally...");
    }
}
