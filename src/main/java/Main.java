
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static int _min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int _max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int _sum(int[] numbers) {
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int _mult(int[] numbers) {
        int mult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            mult *= numbers[i];
        }
        return mult;
    }

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            String[] numbersAsString = line.split(" ");
            int[] numbers = new int[numbersAsString.length];
            for (int i = 0; i < numbersAsString.length; i++) {
                try {
                    numbers[i] = Integer.parseInt(numbersAsString[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Big number error " + e.getMessage());
                    System.exit(0);
                }
            }
            bufferedReader.close();
            fileReader.close();
            System.out.println(_min(numbers));
            System.out.println(_max(numbers));
            System.out.println(_sum(numbers));
            System.out.println(_mult(numbers));
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            System.exit(0);
        }
    }
}
