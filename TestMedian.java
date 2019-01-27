import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class TestMedian {
    protected Integer[] value = new Integer[100];
    protected Integer[] frequency = new Integer[100];
    protected int result = 0;

    public TestMedian(Integer[] newValue, Integer[] newFrequency) {
        this.value = newValue;
        this.frequency = newFrequency;
        calculator();
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
        Integer[] inputValue        = new Integer[100];
        Integer[] inputFrequency    = new Integer[100];
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
        
        TestMedian tm = new TestMedian(inputValue, inputFrequency);
        

        System.out.println(tm);
        System.out.println(inputFrequency.length);
    
    }
    private void calculator() {
        int getMax, getMin;
        Integer[] filter = new Integer[frequency.length];
        int no = 0;
        for(int i = 0; i < frequency.length;i++) {
            filter[no] = value[i]; 
            no++;
        }
        getMax = Collections.max(Arrays.asList(filter));
        getMin = Collections.min(Arrays.asList(filter));
        result = (getMax + getMin) / 2;
    }

}