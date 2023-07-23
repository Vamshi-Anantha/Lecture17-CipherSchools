import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your First Name: ");
        String firstname = sc.nextLine();
        System.out.print("Please enter your Last Name: ");
        String lastname = sc.nextLine();
        System.out.print("Please enter your Profession: ");
        String profession = sc.nextLine();
        System.out.print("Please enter your address: ");
        String address = sc.nextLine();
        System.out.print("Please enter your house number: ");
        int number = Integer.parseInt(sc.nextLine());

        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Profession: " + profession);
        System.out.println("Address: " + address);
        System.out.println("House Number: " + number);
    }
}
