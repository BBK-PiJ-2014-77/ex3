import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by digibrose on 26/01/2015.
 */
public class MeanAverage {

    public static void main(String[] args){

        MeanAverage.launch();

    }

    private static void launch() {

        Scanner input = new Scanner(System.in);
        String number = null;
        int n = 0;
        List<Integer> numbers = new ArrayList<Integer>();

            for (int i = 1; i < 11; i++) {
                System.out.println("Give me a number");
                number = input.next();
                try {
                    n = Integer.parseInt(number);
                } catch (NumberFormatException ex){
                    System.out.println("This is not a number");
                    i--;
                }
                numbers.add(n);
            }

        int total = 0;

        for (int j = 0; j < numbers.size(); j++){

            total = total + numbers.get(j);

        }

        int av = total / numbers.size();

        System.out.println(av);

        }
    }






