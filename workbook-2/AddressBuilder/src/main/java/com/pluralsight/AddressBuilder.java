import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();

        // Prompt user for billing address
        System.out.println("Enter billing address details:");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        billingAddress.append("Billing Address: ").append(fullName).append("\n");

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        billingAddress.append(billingStreet).append(", ");

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        billingAddress.append(billingCity).append(", ");

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        billingAddress.append(billingState).append(" ");

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();
        billingAddress.append(billingZip);

        // Prompt user for shipping address
        System.out.println("\nEnter shipping address details:");
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        shippingAddress.append("Shipping Address: ").append(shippingStreet).append(", ");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        shippingAddress.append(shippingCity).append(", ");

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        shippingAddress.append(shippingState).append(" ");

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();
        shippingAddress.append(shippingZip);

        // Display the customer information
        System.out.println("\nCustomer Information:");
        System.out.println(billingAddress.toString());
        System.out.println(shippingAddress.toString());

        scanner.close();
    }
}
