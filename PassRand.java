import java.util.Random;
import java.util.Scanner;

public class PassRand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Do you want to include uppercase letters? (y/n): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Do you want to include numbers? (y/n): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("y");

        System.out.print("Do you want to include special characters? (y/n): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("y");

        String password = generatePassword(length, includeUppercase, includeNumbers, includeSpecialChars);

        System.out.println("Generated password: " + password);
    }

    public static String generatePassword(int length, boolean includeUppercase, boolean includeNumbers, boolean includeSpecialChars) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        if (includeUppercase) {
            chars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (includeNumbers) {
            chars += "0123456789";
        }
        if (includeSpecialChars) {
            chars += "!@#$%^&*()_+-={}:<>?";
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        return password.toString();
    }
}