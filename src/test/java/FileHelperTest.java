import com.scottejames.aoc2017.util.FileHelper;
import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FileHelperTest {
    @Test
    public void TestLoadFile() {
        FileHelper fh = new FileHelper("testData.txt");
        Assert.checkNonNull(fh, "FileHelper is not null");
        List<String> data = fh.getFileAsList();
        Assert.check(data.size() == 3, "Returned 3 items from file");
        assertEquals(data.get(0), "TestOne", "Check first string matches");
        assertEquals(data.get(1), "TestTwo", "Check first string matches");
        assertNotEquals(data.get(2), "TestOne", "Check first string matches");

    }
}
