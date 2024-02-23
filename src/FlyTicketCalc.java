import java.util.Scanner;
public class FlyTicketCalc {
    public static void main(String[] args) {

        double km, price, total, ppKm = 0.10;
        int age, input;
        boolean oneWay;

        //define scanner
        Scanner doa = new Scanner(System.in);

        //get value from user
        System.out.print("Please enter distance as a km: ");
        km = doa.nextDouble();

        System.out.print("Please enter your age: ");
        age = doa.nextInt();

        System.out.println("Please choose your ticket type:\n 1- One Way \n 2- Two Way ");
        input = doa.nextInt();
        oneWay = input == 1;

        // Calculate
        if(km>0 && (age>=0 && age<150 )){
            if(age<12){ //0-11 years 50% discount
                price = ((km*ppKm)-(km*ppKm)*0.5);
                total = oneWay ? price : ((price-(price*0.2))*2); //One-way without discount or discount if two-way
                System.out.println(total+" ₺");
                System.out.println("0-12 age discount applied.");
                if (!(oneWay)) {
                    System.out.println("An additional 20% discount was applied (for round trip journeys)!");
                }}else if (age>12 && age<=24) { //10% discount for ages 13-24
                price = ((km*ppKm)-(km*ppKm)*0.1);
                total = oneWay ? price : ((price-(price*0.2))*2); //One-way without discount or discount if two-way
                System.out.println(total+" ₺");
                System.out.println("A discount was applied for ages 13-24..");
                if (!(oneWay)) {
                    System.out.println("An additional 20% discount was applied (for round trip journeys)!");
                }} else if (age>=65) { //30% discount for those over 65 years of age
                price = ((km*ppKm)-(km*ppKm)*0.3);
                total = oneWay ? price : ((price-(price*0.2))*2); //One-way without discount or discount if two-way
                System.out.println(total+" ₺");
                System.out.println("Discount applied to people over 65 years of age.");
                if (!(oneWay)) {
                    System.out.println("An additional 20% discount was applied (for round trip journeys)!");
                }} else {
                price = (km*ppKm);
                total = oneWay ? price : (price*2); //One-way without discount or discount if two-way
                System.out.println(total+" ₺");
                System.out.println("No discount was applied.");
                if (!(oneWay)) {
                    System.out.println("An additional 20% discount was applied (for round trip journeys)!");
                }}
        }else {
            System.out.println("Sorry, that's invalid input! Please try again...");
        }
        System.out.println("Thank you for choosing us! We wish you a pleasant journey.");
    }
}
