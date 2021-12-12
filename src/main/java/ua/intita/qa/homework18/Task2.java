package ua.intita.qa.homework18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        String inpFileName = "data/text.txt";
        String outFileName = "data/out_text.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inpFileName));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFileName))) {

            List<String> strings = new ArrayList<>();
            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                strings.add(str);
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
