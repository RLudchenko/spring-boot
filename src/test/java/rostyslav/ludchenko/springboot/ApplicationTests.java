package rostyslav.ludchenko.springboot;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rostyslav.ludchenko.springboot.util.FileReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {
    private static final String PATH = "test_reviews.txt";

    @Autowired
    private FileReader fileReader;

    @Test
    public void ReadFromFileTest() throws IOException {
        assertEquals(10, fileReader.readFile(PATH).length());
    }

    @Test
    void contextLoads() {
    }
}
