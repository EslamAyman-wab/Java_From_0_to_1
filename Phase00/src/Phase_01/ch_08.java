package Phase_01;

import java.util.Scanner;

public class ch_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isAdminFound = false;
        System.out.println("=== Admin Search Tool ===");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter username " + i + ": ");
            String username = scanner.next();

            if (username.equalsIgnoreCase("Admin")) {
                isAdminFound = true;
                System.out.println("Admin profile found! Closing search...");
                break;
            }
        }
        if (!isAdminFound) {
            System.out.println("Search finished. Admin not found.");
        }
        scanner.close();
    }


}
