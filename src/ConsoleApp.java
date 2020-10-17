import java.util.Scanner;

public class ConsoleApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String regex = "-?\\d+(\\.\\d+)?";

        System.out.println("Enter first parameter: ");
        String parameterA = scanner.next();
        while (!parameterA.matches(regex)){
            System.out.println("Enter first parameter: ");
            parameterA = scanner.next();
        }
        System.out.println("First Parameter is : "+ parameterA);

        System.out.println("Enter Second parameter: ");
        String parameterB = scanner.next();
        while (!parameterB.matches(regex)){
            System.out.println("Enter Second parameter: ");
            parameterB = scanner.next();
        }
        System.out.println("Second Parameter is : "+ parameterB);

        System.out.println("Enter Generator A factor: ");
        String generatorFactorA = scanner.next();
        while (!generatorFactorA.matches(regex)){
            System.out.println("Enter Generator A factor: ");
            generatorFactorA = scanner.next();
        }
        System.out.println("Generator A factor is : "+ generatorFactorA);

        System.out.println("Enter Generator B factor: ");
        String generatorFactorB = scanner.next();
        while (!generatorFactorB.matches(regex)){
            System.out.println("Enter Generator B factor: ");
            generatorFactorB = scanner.next();
        }
        System.out.println("Generator B factor is : "+ generatorFactorB);

        System.out.println("Enter Divisor: ");
        String divisor = scanner.next();
        while (!divisor.matches(regex)){
            System.out.println("Enter Divisor: ");
            divisor = scanner.next();
        }
        System.out.println("Divisor is : "+ divisor);

        System.out.println("Enter Number of comparisons: ");
        String numberOfComparisons = scanner.next();
        while (!numberOfComparisons.matches(regex)){
            System.out.println("Enter Number of comparisons: ");
            numberOfComparisons = scanner.next();
        }
        System.out.println("Number of comparison is : "+ numberOfComparisons);

        System.out.println("With parameters "+ parameterA +" and "+ parameterB +" the result is "
          + Generator.generator(Long.parseLong(parameterA), Long.parseLong(parameterB),
          Long.parseLong(generatorFactorA), Long.parseLong(generatorFactorB), Long.parseLong(divisor), Long.parseLong(numberOfComparisons)));
    }
}
