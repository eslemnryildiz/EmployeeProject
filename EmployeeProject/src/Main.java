import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the employees program.\n");

        String operations = "Operations: \n" +
                "1- Software developer operations.\n" +
                "2- Manager operations.\n" +
                "Press q to exit.";

        System.out.println(operations);

        while (true) {

            System.out.println("Please select operation.");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Exiting the program...");
                break;

            } else if (operation.equals("1")) {
                SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper("Eslem Nur", "YILDIZ", 159, "Java,C,C#");

                String operationsSoftware = "1- format.\n" +
                        "2- Show information.\n" +
                        "Press q to exit.";

                System.out.println(operationsSoftware);

                while (true) {
                    System.out.println("Please select operation.");
                    String operationSoftware = scanner.nextLine();

                    if (operationSoftware.equals("q")) {
                        System.out.println("Exiting the software developer operations...");
                        break;

                    } else if (operationSoftware.equals("1")) {
                        System.out.println("Operating system: ");
                        String OS = scanner.nextLine();
                        softwareDeveloper.formatting(OS);

                    } else if (operationSoftware.equals("2")) {
                        softwareDeveloper.showInformation();
                    } else {
                        System.out.println("Invalid developer operation.");
                    }
                }

            } else if (operation.equals("2")) {

                Manager manager = new Manager("Mehmet", "YILDIZ", 199, 100000);
                String operationsManager = "1- Give a raise.\n" +
                        "2- Show information.\n" +
                        "Press q to exit.";

                System.out.println(operationsManager);

                while (true) {
                    System.out.println("Please select operation.");
                    String operationManager = scanner.nextLine();

                    if (operationManager.equals("q")) {
                        System.out.println("Exiting the manager operations...");
                        break;

                    } else if (operationManager.equals("1")) {
                        System.out.println("How many dollars would you like the manager to raise?");
                        int raiseAmount = scanner.nextInt();
                        scanner.nextLine();
                        manager.raise(raiseAmount);

                    } else if (operationManager.equals("2")) {
                        manager.showInformation();

                    } else {
                        System.out.println("Invalid manager operation.");
                    }
                }
            } else {
                System.out.println("Invalid operation.");
            }
        }

    }
}
