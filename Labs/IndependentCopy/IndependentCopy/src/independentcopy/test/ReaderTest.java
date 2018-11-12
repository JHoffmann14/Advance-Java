package independentcopy.test;

import independentcopy.FileReader;

import static junit.framework.TestCase.assertEquals;

public class ReaderTest {
    @Test
    public void testReadln() {
        independentcopy.FileReader k = new independentcopy.FileReader();

        assertEquals("Out does not match input", 15, k.readln().split("\t").length);
    }
}
