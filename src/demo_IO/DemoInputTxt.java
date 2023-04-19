package demo_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoInputTxt {
    public static void main(String[] args) {
        File file = new File("src/demo_IO/demo.txt");
        try {
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("/");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
//            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
