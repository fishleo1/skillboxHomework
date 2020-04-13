import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class surname {
    public static void main(String[] args) throws IOException {
        //indexOf(), lastIndexOf(), substring() и trim()
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String allName = reader.readLine();
        System.out.println("Your name is: " + allName);

       String[] sentences = allName.split("\\s");
//       for(int i = 0; i < sentences.length; i++){
//           System.out.println(sentences[i]);
//       }
        System.out.println("Фамилия: " + sentences[0]);
        System.out.println("Имя: " + sentences[1]);
        System.out.println("Отчество: " + sentences[2]);
    }
}
