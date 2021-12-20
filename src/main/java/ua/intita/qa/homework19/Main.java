package ua.intita.qa.homework19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println(file.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
        System.out.println(file.canWrite() ? "Файл/каталог доступен для редактирования."
                : "Файл/каталог не доступен для редактирования.");
        System.out.println(file.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
        System.out.println((file.isDirectory() ? "Каталог." : "Не каталог."));
        System.out.println(file.isFile() ? "Файл." : "Не файл.");
        System.out.println(file.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
        System.out.println("Дата последнего редактирования: " + file.lastModified());
        System.out.println("Размер: " + file.length() + " байт.");
    }
}
