
package com.group11.lettersgame;
import java.io.*;
import java.util.ArrayList;

public class CSVParser {

    String fileName;
    ArrayList<Letter> letters;

    CSVParser(String fileName) {
        this.fileName = fileName;
        getLetters();
    }

    private void getLetters() {
        
        String addressName = "C:/src/main/data/" + fileName;
        try {
            File file = new File(addressName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                    Letter newLetter = new Letter(temp[0], temp[1]);
                    letters.add(newLetter);
                
            }
            bufferedReader.close();
        } catch(Exception e) {

        }
    }



}
