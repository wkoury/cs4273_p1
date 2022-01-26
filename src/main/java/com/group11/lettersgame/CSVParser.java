
package com.group11.lettersgame;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class CSVParser {

    String fileName;
    ArrayList<Letter> letters;

    CSVParser(String fileName) {
        this.fileName = fileName;
        getLetters();
    }

    private void getLetters() {

        String addressName = "src/main/java/com/group11/lettersgame/data/" + fileName;
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

    public Letter getRandomLetter() {
        int upperBound = letters.size();
        Random random = new Random();
        int randomIndex = random.nextInt(upperBound);
        return letters.get(randomIndex);
    }

    public ArrayList<Letter> getAlphabet() {
        return letters;
    }



}
