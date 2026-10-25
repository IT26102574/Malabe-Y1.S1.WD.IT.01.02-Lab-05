import java.util.Scanner;

public class IT26102574Lab5Q3 {
    public static void main(String[] args) {

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1: Check date range
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Invalid date! Dates must be between 1 and 31.");
            input.close();
            return;
        }

        // Validation 2: Check date order
        if (startDate >= endDate) {
            System.out.println("Invalid dates! Start date should be less than end date.");
            input.close();
            return;
        }

        int days = endDate - startDate;

        double total = days * ROOM_CHARGE;
        double discount = 0;

        if (days >= 3 && days <= 4) {
            discount = DISCOUNT_10;
        } else if (days >= 5) {
            discount = DISCOUNT_20;
        }

        double discountAmount = total * discount;
        double amountToPay = total - discountAmount;

        System.out.println("Number of days reserved: " + days);
        System.out.printf("Total amount before discount: Rs. %.2f%n", total);
        System.out.printf("Discount amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Total amount to be paid: Rs. %.2f%n", amountToPay);

        input.close();
    }
}