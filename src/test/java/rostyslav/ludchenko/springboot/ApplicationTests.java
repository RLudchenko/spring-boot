package rostyslav.ludchenko.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import rostyslav.ludchenko.springboot.util.FileReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ApplicationTests {
    private static final String PATH = "test_reviews.txt";
    private final FileReader fileReader = Mockito.mock(FileReader.class);

    @Test
    public void ReadFromFileTest() {
        Mockito.when(fileReader.readFile(Mockito.anyString())).thenReturn(PATH);
        assertEquals(16, fileReader.readFile(PATH).length());
    }

    @Test(expected = AssertionError.class)
    public void fileDoesntExistTest() {
        Assert.fail(fileReader.readFile("d"));
    }
}
