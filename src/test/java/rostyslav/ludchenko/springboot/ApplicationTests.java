package rostyslav.ludchenko.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rostyslav.ludchenko.springboot.util.FileReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ApplicationTests {
    private static final String PATH = "test_reviews.txt";

    @Autowired
    private FileReader fileReader;

    @Test
    public void ReadFromFileTest() {
        assertEquals(10, fileReader.readFile(PATH).length());
    }
}
