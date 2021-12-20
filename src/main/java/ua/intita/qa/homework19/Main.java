package ua.intita.qa.homework19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Album> albums = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get("data/albums.csv"), UTF_8);

        for (String line: lines) {
            String[] album = line.split(",");
            albums.add(new Album(album[0], album[1], album[2], album[3],album[4]));
        }
        System.out.println(albums);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/album.dat"))){
            oos.writeObject(albums);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/album.dat"))) {
            List<Album> list = (List<Album>) ois.readObject();
            System.out.println(list);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("data/album.dat");
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Parent directory: " + file.getParent());
        System.out.println(file.exists() ? "File/directory exists" : "File/directory doesn't exist");
        System.out.println(file.canWrite() ? "File/directory is available for editing"
                : "File/directory is not available for editing");
        System.out.println(file.canRead() ? "ile/directory is available for reading" : "ile/directory is not available for editing");
        System.out.println((file.isDirectory() ? "Directory" : "Not a directory"));
        System.out.println(file.isFile() ? "File" : "Not a file");
        System.out.println(file.isAbsolute() ? "Absolute path" : "Not an absolute path");
        System.out.println("Date of the last editing: " + Instant.ofEpochMilli(file.lastModified())
                .atZone(ZoneId.systemDefault()).toLocalDateTime());
        System.out.println("Size: " + file.length() + " bytes");
    }
}
