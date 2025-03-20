package JavaProject;
import java.util.Scanner;

class Ticket {
    String startPoint;
    String destinationPoint;
    String className;
    int passengers;
    int train;

    public void Ticket(String startPoint, String destinationPoint, String className, int passengers) {
        this.startPoint = startPoint;
        this.destinationPoint = destinationPoint;
        this.className = className;
        this.passengers = passengers;

        System.out.println(startPoint + ", " + destinationPoint + ", " + className + ", " + passengers);
        
    }

    public void train() {

    }
}

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Noat : ");
        System.out.println();

        System.out.println("Enter Starting point: ");
        String startPoint = sc.nextLine();
        System.out.println("Enter Destination point: ");
        String destinationPoint = sc.nextLine();
        System.out.println("Enter Class: ");
        String className = sc.nextLine();
        System.out.println("Enter No of Passengers: ");
        int passengers = sc.nextInt();

        Ticket one = new Ticket();
        one.Ticket(startPoint, destinationPoint, className, passengers);
    }
}
