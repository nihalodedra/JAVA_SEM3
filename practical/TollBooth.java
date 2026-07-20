import java.util.Scanner;

class Vehicle {

    String number;
    String type;

    Vehicle(String number, String type) {
        this.number = number;
        this.type = type;
    }
}

public class TollBooth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int bike = 0;
        int car = 0;
        int truck = 0;

        while (true) {
            System.out.println("25AIML039");
            System.out.print("Enter vehicle number (or done): ");
            String number = sc.next();

            if (number.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter vehicle type (bike/car/truck): ");
            String type = sc.next().toLowerCase();

            Vehicle v = new Vehicle(number, type);

            switch (v.type) {

                case "bike":
                    total += 20;
                    bike++;
                    break;

                case "car":
                    total += 50;
                    car++;
                    break;

                case "truck":
                    total += 150;
                    truck++;
                    break;

                default:
                    System.out.println("Invalid vehicle type");
            }
        }

        System.out.println("Total Toll: " + total);

        if (bike >= car && bike >= truck) {
            System.out.println("Most frequent: bike");
        } else if (car >= bike && car >= truck) {
            System.out.println("Most frequent: car");
        } else {
            System.out.println("Most frequent: truck");
        }
        sc.close();
    }
}

