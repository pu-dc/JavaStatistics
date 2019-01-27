import java.io.*;
public class CalculatorF {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data_frequency.in");
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        System.setOut(ps);
        
        Integer listA = 100;
        Integer listB = 0;
        
        int rd = 0;
        for (Integer i = listA; i > listB; i--) {
            if (i > 75 && i <= (100)) {
                rd = (int)(Math.random() * 10000 + 1);
            }
            if (i > 50 && i <= (75)) {
                rd = (int)(Math.random() * 1000 + 1);
            }
            if (i > 25 && i <= (50)) {
                rd = (int)(Math.random() * 100 + 1);
            }
            if (i > 0 && i <= (25)) {
                rd = (int)(Math.random() * 10 + 1);
            }

            if (i == (listB + 1)) {
                System.out.print(rd);
            } else {
                System.out.println(rd);
            }
        }
    }
}