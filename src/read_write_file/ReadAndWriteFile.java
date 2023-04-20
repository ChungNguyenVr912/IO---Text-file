package read_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        String inputUrl = "src/read_write_file/numbers.txt";
        File outputFile = new File("src/read_write_file/result.txt");
        try {
            ArrayList<Integer> arrayList = readFile(inputUrl);
            AtomicInteger max = new AtomicInteger(arrayList.get(0));
            arrayList.forEach(number ->
                    max.set(Math.max(max.get(), number))
            );
            String result = "Max value is: " + max;
            writeFile(outputFile, result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(File outputFile, String result) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        writer.write(result);
        writer.close();
    }

    private static ArrayList<Integer> readFile(String inputUrl) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputUrl));
        ArrayList<Integer> arrayList = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            arrayList.add(Integer.parseInt(line));
        }
        reader.close();
        return arrayList;
    }
}
