import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, typeTrip;
        double km, ticketPrice = 100;


        System.out.print("Enter the KM : ");
        km = input.nextDouble();
        System.out.print("Enter your age : ");
        age = input.nextInt();
        System.out.print("Enter trip type : ");
        typeTrip = input.nextInt();
        if ((km <= 0) || (age < 0) || (typeTrip != 1 && typeTrip != 2)) {
            System.out.println("Please enter correct data.\n" +
                    "km will be greater than 0\n" +
                    "age will be greater than 0 and smaller 150\n" +
                    "trip type will be 1 or 2");
        } else {
            ticketPrice = km * 0.10;
            double roundTrip = ticketPrice * 2 * 0.8;
            if (age <= 12) {
                if (typeTrip == 1) {
                    ticketPrice *= 0.5;
                    System.out.println("for your age we applied 50% discount, your oneway ticket bill is :" + ticketPrice);
                } else {
                    ticketPrice = roundTrip*0.5;
                    System.out.println("for your age we applied 50% discount, your round ticket bill is :" + ticketPrice);
                }
            } else if (age > 12 && age <= 24) {
                ticketPrice *= 0.9;
                if (typeTrip == 1) {
                    System.out.println("for your age we applied 10% discount, your oneway ticket bill is: " + ticketPrice);
                } else {
                    ticketPrice = roundTrip;
                    System.out.println("for your age we applied 10% discount, your round ticket bill is : " + ticketPrice);
                }
            } else if (age > 65) {
                 ticketPrice *= 0.7;
                if (typeTrip == 1) {
                    System.out.println("for your age we applied 30% discount, your round ticket bill is : " + ticketPrice);
                } else {
                    ticketPrice = roundTrip*0.7;
                    System.out.println("for your age we applied 30% discount, your round ticket bill is : " + ticketPrice);
                }

            }else {
                if (typeTrip==1){
                    System.out.println("Your oneway ticket bill is : " +ticketPrice);
                }else {
                    System.out.println("Your round ticket bill is : " + roundTrip);
                }

            }
        }

    }
}