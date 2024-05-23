package com.pluralsight;

public class DealershipFileManager {
    class DealershipFileManager {
        // Methods
        public Dealership getDealership() {
            // Read inventory.csv file and create Dealership object
            return null; // Placeholder
        }

        public void saveDealership(Dealership dealership) {
            // Save Dealership object back to inventory.csv file
            // Implementation not provided
        }
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }

    private void display() {
        // Display menu and process user input
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getPrice());
        }
    }

    private void processAllVehiclesRequest() {
        List<Vehicle> allVehicles = this.dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }

    // Implement other process methods similarly
}
