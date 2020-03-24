import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void calculate(String[] args) throws IOException {

            /* Считывание кол-ва коробок и добавление этого значения в переменную
            Создание констант контейнера и грузовика
            Создание переменных в которые будут сохраняться значения счетчиков
            Создание цикла который повторяется, до того, пока не будет достигнуто значение кол-ва коробок
            Через операторы сравниения проводим проверку на остаток через деление с остатком (i % container ==0)
            1. Контейнер + грузовик
            2. Грузовик
            3. Контейнер
            */
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Total boxes: ");
        int boxes = Integer.parseInt(number.readLine());
        int container = 27;
        int track = 324;
        int i;
        int result1 = 1;
        int result2 = 1;

        System.out.println("Track 1");
        System.out.println("Container 1");
        for (i = 1; i <= boxes; i++){
            System.out.println("Box: " + i);

            if (i % container == 0 && i % track == 0){
                result1++;
                result2++;
                System.out.println("Track: " + result2 + ":");
                System.out.println("Container: " + result1 + ":");
            }else if (i % track == 0){
                result2++;
                System.out.println("Track: " + result2 + ":");
            }else if (i % container == 0){
                result1++;
                System.out.println("Container: " + result1 + ":");
            }
        }
    }
}
