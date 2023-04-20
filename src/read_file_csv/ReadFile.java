package read_file_csv;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    public static void main(String[] args) {
        String fileUrl = "src/read_file_csv/country.csv";
        ArrayList<String> countryList = new ArrayList<>();
        try {
            File inputFile = new File(fileUrl);
            if (!inputFile.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null){
                countryList.add(line.split(",")[2]) ;
            }
            reader.close();
            countryList.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
