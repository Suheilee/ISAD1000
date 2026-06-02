
    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;

import static org.junit.Assert.*;
    
    import java.io.ByteArrayOutputStream;
    import java.io.PrintStream;
    
    public class CompareTest {
    
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final PrintStream originalOut = System.out;
    
        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }
    
        @After
        public void restoreStreams() {
            System.setOut(originalOut);
        }
    
        @Test
        public void testCheckMasterNumber_MasterNumber() {
            Compare.checkMasterNumber(11);
            assertEquals("Your life path is a master number!\n", outContent.toString());
            outContent.reset(); // Clear the output stream
        }
    
        @Test
        public void testCheckMasterNumber_NotMasterNumber() {
            Compare.checkMasterNumber(4);
            assertEquals("Your life path is not a master number\n", outContent.toString());
            outContent.reset(); // Clear the output stream
        }
    
        @Test
        public void testCompareLifePaths_Equal() {
            Compare.compareLifePaths(5, 5);
            assertEquals("Congratulations! Your lifepaths are the same!\n", outContent.toString());
            outContent.reset(); // Clear the output stream
        }
    
        @Test
        public void testCompareLifePaths_NotEqual() {
            Compare.compareLifePaths(4, 6);
            assertEquals("Your life paths are not the same\n", outContent.toString());
            outContent.reset(); // Clear the output stream
        }
    }
    
