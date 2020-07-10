package rostyslav.ludchenko.springboot;

import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import util.FileReader;

public class FileReaderTests {
    private static final String PATH = "D:\\reviews\\Reviews.csv";
    private FileReader fileReader = new FileReader();

    @Test
    public void ReadFromFileTest() throws IOException {
        Assertions.assertThatCode(() -> fileReader.readFileByString(PATH))
                .doesNotThrowAnyException();
    }
}
