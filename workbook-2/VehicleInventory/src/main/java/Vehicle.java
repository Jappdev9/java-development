import java.util.Scanner;

class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId +
                ", Make/Model: " + makeModel +
                ", Color: " + color +
                ", Odometer Reading: " + odometerReading +
                ", Price: " + price;
    }
}

public class VehicleInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];
        int vehicleCount = 6;

        // Preload the array with vehicles
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Add a vehicle");
            System.out.println("6 - Quit");

            System.out.print("Enter your command: ");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    listAllVehicles(vehicles, vehicleCount);
                    break;
                case 2:
                    searchByMakeModel(vehicles, vehicleCount);
                    break;
                case 3:
                    addVehicle(vehicles, vehicleCount);
                    vehicleCount++;
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    public static void listAllVehicles(Vehicle[] vehicles, int count) {
        for (int i = 0; i < count; i++) {
            if (vehicles[i] != null) {
                System.out.println(vehicles[i]);
            }
        }
    }

    public static void searchByMakeModel(Vehicle[] vehicles, int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter make/model to search: ");
        String makeModel = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if (vehicles[i] != null && vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                System.out.println(vehicles[i]);
            }
        }
    }

    public static void addVehicle(Vehicle[] vehicles, int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle ID: ");
        long vehicleId = scanner.nextLong();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.print("Enter odometer reading: ");
        int odometerReading = scanner.nextInt();
        System.out.print("Enter price: ");
        float price = scanner.nextFloat();

        vehicles[count] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        System.out.println("Vehicle added successfully.");
    }
}
