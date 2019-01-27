import java.io.*;
import java.util.*;

public class Main extends MainSpace {
    protected Integer[] inputValue = new Integer[100];
    protected Integer[] inputFrequency = new Integer[100];

    public Main() throws FileNotFoundException {
        dataFrequency();
        dataValue();
        dataOut();
    }
    public Integer[] newValue() {
        return inputValue;
    }
    public Integer[] newFrequency() {
        return inputFrequency;
    }
    public String getResult() {
        Sum sum = new Sum(newFrequency());
        DataMaxMin dmm = new DataMaxMin(newValue(), newFrequency());
        Quartil qrt = new Quartil(newValue(), newFrequency(), sum.result());
        String str =
        "\n" +
        "\t\t\t\t---POIN STATISTIC---\n\n" +
        "Sum \t\t\t: " + sum + "\n" +
        "Average \t\t: " + new Average(newValue(), newFrequency()) + "\n" +
        "Median \t\t\t: " + new Median(dmm.getValueMax(), dmm.getValueMin(), dmm.getFrequencyMax(), dmm.getFrequencyMin()) + "\n" +
        "Quartil \t\t: " + qrt + "\n" +
        "Range \t\t\t: " + new Range(dmm.getValueMax(), dmm.getValueMin(), dmm.getFrequencyMax(), dmm.getFrequencyMin()) + "\n" +
        "Range Quartil \t: " + new RangeQuartil(qrt.getQuartil1(), qrt.getQuartil3())
        ;
        return str;
    }
    
    @Override
    public String toString() {
        return " [ O K ] : data_final.txt";
    }
    
    public static void main(String[] args) throws FileNotFoundException {
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
    private void dataOut() throws FileNotFoundException {
		File file = new File("data_final.txt");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println(getResult());
    }
}