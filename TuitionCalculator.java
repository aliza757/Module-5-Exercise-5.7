import java.util.Scanner;

public class TuitionCalculator {
  public static void main(String[] args) {
    double annualIncrease = 0.05;
    double tuitionAfterOneYear = 0;
    double tuitionInTenYears = 0;
    double totalCost = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the current tuition: $");
    double currentTuition = scanner.nextDouble();

    tuitionAfterOneYear = currentTuition * (1 + annualIncrease);
    System.out.printf("Tuition after one year: $%.2f%n", tuitionAfterOneYear);

    tuitionInTenYears = currentTuition * Math.pow(1 + annualIncrease, 10);
    System.out.printf("Tuition in ten years: $%.2f%n", tuitionInTenYears);

    for (int i = 0; i < 4; i++) {
      totalCost += tuitionInTenYears * Math.pow(1 + annualIncrease, i);
    }
    System.out.printf("Total cost of four years' worth of tuition after the tenth year: $%.2f%n", totalCost);
  }
}