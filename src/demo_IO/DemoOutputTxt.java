package demo_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoOutputTxt {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/demo_IO/demo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < 3; i++) {
                bufferedWriter.write("\nDemo file output " + i);
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
