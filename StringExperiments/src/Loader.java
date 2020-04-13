
public class Loader
{
    public static void main(String[] args)
    {
        for (char i = 'a'; i <= 'z'; i++){
            int c = i;
            System.out.println(i + " :" + c);
        }
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);
    }
}