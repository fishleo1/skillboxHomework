public class Main
{
    public static void main(String[] args){
        Container container = new Container();
        container.count += 7843;
        sumDigits(34567);
        System.out.println(sum);
    }
    public static int sum = 0;

    public static int sumDigits(Integer number){
        //@TODO: write code here
        String numToString = Integer.toString(number);
        for (int i = 0; i < numToString.length(); i++){
            sum = sum + Integer.parseInt(numToString.charAt(i) + "");
        }

        return sum;
    }
}
