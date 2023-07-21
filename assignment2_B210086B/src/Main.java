import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<tour> tours = new ArrayList<>();
        price overseasNormalPrice = new normalPrice(4297, 4097, 3897, 500);
        price overseasPeakPrice = new peakPrice(5097, 4897, 4697, 500);
        price domesticNormalPrice = new normalPrice(1647, 1447, 1247, 500);
        price domesticPeakPrice = new peakPrice(2447, 2247, 2047, 500);

        tour overseasTour = new overseasTour(6, overseasPeakPrice, overseasNormalPrice, "Korea", "Seoul", true, true);
        tour domesticTour = new domesticTour(3, domesticPeakPrice, domesticNormalPrice,"Sabah", true, false);

        tours.add(overseasTour);
        tours.add(domesticTour);


        // -- Constructor -- //
        int tourSelection = 0;
        int priceSelection = 0;

        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        System.out.println("\n -------- Travel Agency System  -------- ");
        System.out.println("\n -------- Welcome! ε٩(๑> ₃ <)۶з -------- ");


        // -- Tour Validation -- //
        while(!validInput){
            try{
                System.out.print("\n Please select the tour you want (1: Overseas, 2: Domestic): ");
                tourSelection = sc.nextInt();
                while(tourSelection < 1 || tourSelection > 2){
                    System.out.println("\n Please enter a valid integer (1 or 2): ");
                    tourSelection = sc.nextInt();
                }validInput = true;
            }catch (Exception e){
                System.out.println("\n Invalid input! Please enter a valid integer. ");
                // Clear the keyboard input
                sc.nextLine();
            }
        }

        validInput = false;


        // -- Price Validation -- //
        while(!validInput){
            try{
                System.out.print("\n Please select the price information (3: Normal, 4: Peak): ");
                priceSelection = sc.nextInt();
                while(priceSelection < 3 || priceSelection > 4){
                    System.out.println("\n Please enter a valid integer (3 or 4): ");
                    priceSelection = sc.nextInt();
                }validInput = true;
            }catch (Exception e){
                System.out.println("\n Invalid input! Please enter a valid integer. ");
                // Clear the keyboard input
                sc.nextLine();
            }
        }

        validInput = false;

        System.out.println("\n---------------------------------------------------- ");
        System.out.println("\n Please wait 5 second to check tour information ‣··♪ ");
        System.out.println("\n---------------------------------------------------- ");


        //--------------Make the main thread sleep------------------//
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread Error");
            System.exit(0);
        }


        // -- Overseas Tour -- //
        if(tourSelection == 1 && priceSelection == 3){
            System.out.println(overseasTour.toString());
            System.out.println(overseasNormalPrice);
        }else if(tourSelection == 1 && priceSelection == 4){
            System.out.println(overseasTour.toString());
            System.out.println(overseasPeakPrice);
        }


        // -- Domestic Tour -- //
        if(tourSelection == 2 && priceSelection == 3){
            System.out.println(domesticTour.toString());
            System.out.println(domesticNormalPrice);
        }else if(tourSelection == 2 && priceSelection == 4){
            System.out.println(domesticTour.toString());
            System.out.println(domesticPeakPrice);
        }

        System.out.println("\n---------------------------------------- ");
    }
}