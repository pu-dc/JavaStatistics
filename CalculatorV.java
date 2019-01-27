import java.io.*;
import java.util.Random;
public class Calculator {
    public String getResult() {
        String str = "";
        int listA = 100;
        for (int i = listA; i > 0; i--) {
            if (i == (listA + 1)) {
                str += i;
            } else {
                str += i + "\n";
            }
        }
        return str;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Calculator c = new Calculator();
        File file = new File("data_value   .in");
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        System.setOut(ps);
        System.out.printf("%s", c.getResult());
    }
}