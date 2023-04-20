package copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        String inputUrl = "src/copy_file_text/source.txt";
        String outputUrl = "src/copy_file_text/target.txt";
        try {
            File inputFile = new File(inputUrl);
            if (!inputFile.exists()) {
                throw new FileNotFoundException();
            }
            File targetFile = new File(outputUrl);
            try {
                if (targetFile.exists()) {
                    throw new FileNotFoundException();
                }
            } catch (FileNotFoundException e) {
                System.err.println("Target file already exist!");
                System.exit(1);
            }
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile));
            int characters = 0;
            int next;
            while((next = reader.read()) != -1){
                writer.write(next);
                characters++;
            }
            reader.close();
            writer.close();
            System.out.println("Read characters: " + characters);
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            System.exit(0);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
