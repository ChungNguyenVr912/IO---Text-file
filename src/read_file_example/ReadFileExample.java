package read_file_example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void readFileText(String file){
        try {
            File file1 = new File(file);
            if (!file1.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file1));
//            Scanner scanner = new Scanner(file1);
            String line;
            int sum = 0;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            System.out.println("Sum is: " + sum);
        }catch (Exception e){
            System.err.println("File not found or invalid content!");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        readFileText("src/read_file_example/number.txt");
    }
}
