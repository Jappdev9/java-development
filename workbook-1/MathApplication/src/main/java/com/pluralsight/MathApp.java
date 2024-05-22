public class MathApp {
    public static void main(String[] args) {
        // Question 1
        double bobSalary = 50000;
        double garySalary = 60000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2
        double carPrice = 25000;
        double truckPrice = 30000;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);

        // Question 3
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius 7.25 is " + area);

        // Question 4
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        //Question 5
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        System.out.println("The points are (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");

        // Question 6
        double value = -3.8;
        double absoluteValue = Math.abs(value);
        System.out.println("The absolute value of " + value + " is " + absoluteValue);

        // Question 7
        double random = Math.random();
        System.out.println("A random number between 0 and 1 is " + random);

    }
}


