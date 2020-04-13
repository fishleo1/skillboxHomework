import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    //indexOf(), lastIndexOf(), substring() и trim()
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++){
            int c = i;
            System.out.println(i + " :" + c);
        }
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String salaryOne = text.substring(15, 19);
        String salaryTwo = text.substring(56, 61);
        int salaryOne1 = Integer.parseInt(salaryOne);
        int salaryTwo1 = Integer.parseInt(salaryTwo);
        int result = salaryOne1 + salaryTwo1;
        System.out.println(result);
    }
}