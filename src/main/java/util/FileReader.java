package util;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    private static final String PATH = "D:\\reviews\\Reviews.csv";

    public static void main(String[] args) throws IOException {
        readFileByString(PATH);
    }

    public static void readFileByString(String path) throws IOException {
        Files.lines(Paths.get(path)).forEach(System.out::println);
    }
}
