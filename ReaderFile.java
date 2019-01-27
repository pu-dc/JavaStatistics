import java.io.*;
import java.util.*;

class ReaderFile {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("data.in"));
            int largest = file.nextInt();

            while(file.hasNextInt()) {
                int number = file.nextInt();

                if(number > largest) {
                    largest = number;
                }

                System.out.println(number);
            }

            file.close();

            System.out.println("The biggest number in the file is: " + largest);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}