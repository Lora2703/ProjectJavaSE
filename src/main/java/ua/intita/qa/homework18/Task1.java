package ua.intita.qa.homework18;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        String inpFileName = "data/skillet_those_nights-namobilu.com.mp3";
        String outFileName = "data/music.mp3";

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inpFileName));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outFileName))) {

            byte[] bytes = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(bytes);
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
