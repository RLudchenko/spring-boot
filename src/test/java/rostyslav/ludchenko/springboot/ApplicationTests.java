package rostyslav.ludchenko.springboot;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import rostyslav.ludchenko.springboot.util.FileReader;
import rostyslav.ludchenko.springboot.util.FileReaderImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ApplicationTests {
    private static final String PATH = "test_reviews.txt";

    private FileReader fileReader = new FileReaderImpl();

    @Test
    public void ReadFromFileTest() {
        assertEquals(10, fileReader.readFile(PATH).length());
    }

    @Test(expected = NullPointerException.class)
    public void fileDoesntExistTest() {
        fileReader.readFile("d");
    }
}
