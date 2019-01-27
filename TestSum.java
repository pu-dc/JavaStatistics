import java.io.*;
import java.util.*;

public class TestSum {
    protected Integer frequency[] = new Integer[100];
    protected Integer result;
    public TestSum(Integer[] newFrequency) {
        this.frequency = newFrequency;
        calculation();
    }
    
    public Integer getResult() {
        return result;
    }
    @Override
    public String toString() {
        String str = "";
        str += getResult();
        return str;
    }
    public static void main(String[] args) {
        Integer inputFrequency[] = new Integer[100];
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
        System.out.println(inputFrequency[0]);
        System.out.println(new TestSum(inputFrequency));
    }

    private void calculation() {
        result = frequency[0] * 2;
    }
}