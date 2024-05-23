package com.pluralsight;

class UserInterface {
    private Dealership dealership;

    public UserInterface() {
        init();
    }

    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
    }

    public void display() {
        // Display menu and handle user input
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getYear() + " " + vehicle.getMake() + " " + vehicle.getModel());
        }
    }

    public void processGetByPriceRequest() {
        // Process request to get vehicles by price range
    }

    public void processGetByMakeModelRequest() {
        // Process request to get vehicles by make and model
    }

    public void processGetByYearRequest() {
        // Process request to get vehicles by year range
    }

    public void processGetByColorRequest() {
        // Process request to get vehicles by color
    }

    public void processGetByMileageRequest() {
        // Process request to get vehicles by mileage range
    }

    public void processGetByVehicleTypeRequest() {
        // Process request to get vehicles by type
    }

    public void processGetAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    public void processAddVehicleRequest() {
        // Process request to add a vehicle
    }

    public void processRemoveVehicleRequest() {
        // Process request to remove a vehicle
    }
}
