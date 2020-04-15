import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cleanPhoneNumber {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your phone number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readerNumber = reader.readLine();

        System.out.println("Your number is: " + readerNumber);
        System.out.println("Number for data-base: " + readerNumber.replaceAll("[^0-9]", ""));



    }
}
