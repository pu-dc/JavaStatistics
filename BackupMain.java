import java.io.*;
import java.util.*;

public class Main {
    private Integer[] inputValue, inputFrequency = new Integer[100];

    public Main() {
        dataFrequency();
        dataValue();
    }
    public Integer[] newValue() {
        return inputValue;
    }
    public Integer[] newFrequency() {
        return inputFrequency;
    }
    
    @Override
    public String toString() {
        Sum sum = new Sum(newFrequency());
        String str =
        "\n" +
        " ---SBMPTN 2019 STATISTIC---\n\n" +
        "Sum \t\t: " + sum + "\n" +
        "Average \t: " + new Average(newValue(), newFrequency()) + "\n" +
        "Median \t\t: " + new Median(newValue(), newFrequency()) + "\n" +
        //"Quartil \t\t: " + new Quartil(newValue(), newFrequency(), sum.result()) + "\n" +
        "\n";
        return str;
    }
    public static void main(String[] args) {

        System.out.println(new Main());

    }

    private void dataFrequency() {
        try {
            Scanner sc = new Scanner(new File("data_frequency.in"));
            int i = 0;
            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                inputFrequency[i] = number;
                i++;
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("Error try scanner!");
        }
    }
    private void dataValue() {
        try {
            Scanner sc = new Scanner(new File("data_value.in"));
            int i = 0;
            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                inputValue[i] = number;
                i++;
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("Error try scanner!");
        }
    }
}