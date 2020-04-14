import java.util.ArrayList;
import java.util.List;
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
        List<String> allSalarys = new ArrayList<>(2);
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        Pattern p = Pattern.compile("\\b\\d+\\b");
        Matcher m = p.matcher(text);

        while(m.find()){
            allSalarys.add(m.group());
        }
        System.out.println("Salary is: " + allSalarys.get(0) + " " + allSalarys.get(1) + " " + allSalarys.get(2));

        int first = Integer.parseInt(allSalarys.get(0));
        int sec = Integer.parseInt(allSalarys.get(1));
        int third = Integer.parseInt(allSalarys.get(2));

        int total = first + sec + third;
        System.out.println("Total salary is: " + total);





//        String salaryOne = text.substring(15, 19);
//        String salaryTwo = text.substring(56, 61);
//        int salaryOne1 = Integer.parseInt(salaryOne);
//        int salaryTwo1 = Integer.parseInt(salaryTwo);
//        int result = salaryOne1 + salaryTwo1;
//        System.out.println(result);
    }
}