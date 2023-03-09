import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 10; // length of the password
        System.out.println(generatePassword(length));
    }

    static char[] generatePassword(int length) {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");

        // A strong password has Capital letters, lower-case letters,
        // numeric value/s and symbols. So we are using all of
        // them to generate our password
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = capitalChars + smallChars +
                numbers + symbols;

        // Using random method
        Random randomMethod = new Random();

        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] =
                    values.charAt(randomMethod.nextInt(values.length()));
        }
        return password;
    }
}

