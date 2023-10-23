package adapterPattern;
import java.util.*;

public class SaksakanSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        printHeader();
        while(true){
            System.out.println("Select a device to Plug In: ");
            System.out.println("1: Laptop Charger");
            System.out.println("2: Refrigerator");
            System.out.println("3: Smartphone Charger");
            System.out.println("4: Exit");
            System.out.print("Enter your preferred Appliance: ");
            int userChoice = sc.nextInt();
            if(userChoice==4){
                printFooter();
                break;
            }
            switch(userChoice) {
                case 1:
                    Laptop laptop = new Laptop();
                    PowerOutlet lappyChord = new LaptopAdapter(laptop);
                    System.out.println(lappyChord.plugIn());
                    break;
                case 2:
                    Refrigerator ref = new Refrigerator();
                    PowerOutlet refChord = new RefrigeratorAdapter(ref);
                    System.out.println(refChord.plugIn());
                    break;
                case 3:
                    SmartphoneCharger phone = new SmartphoneCharger();
                    PowerOutlet phoneChord = new SmartphoneAdapter(phone);
                    System.out.println(phoneChord.plugIn());
                    break;
                default:
                    System.out.println("Invalid Choice. Please enter [0-4]");
            }
        }
    }
    private static void printHeader() {
        System.out.println("[]--  Welcome to your Smart Home's Power Outlet!!  --[]");
        System.out.println("[]--  Where you can remotely plug in your devices  --[]");
    }

    private static void printFooter() {
        System.out.println("\n[]---------Program Exit---------[]");
        System.out.println("[]--by Emmanuel Zaki Dasalla--[]");
        System.out.println("[]----------3-BSCS-2----------[]");
    }
}
