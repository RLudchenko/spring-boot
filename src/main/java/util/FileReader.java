package util;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    private static final String PATH = "D:\\reviews\\Reviews.csv";

    public void main(String[] args) throws IOException {
        readFileByString(PATH);
    }

    public void readFileByString(String path) throws IOException {
        Files.lines(Paths.get(path)).forEach(System.out::println);
    }
}
