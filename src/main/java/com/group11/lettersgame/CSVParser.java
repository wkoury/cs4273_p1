
package com.group11.lettersgame;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class CSVParser {

    private String fileName;
    private ArrayList<Letter> letters;

    public CSVParser(String fileName) {
        this.fileName = fileName;
        letters = new ArrayList<Letter>();
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
            // Skip the headers
            bufferedReader.readLine();
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
        Letter ret = letters.get(randomIndex);
        ret.setIndex(randomIndex);
        return ret;
    }

    public ArrayList<Letter> getAlphabet() {
        return letters;
    }

}
