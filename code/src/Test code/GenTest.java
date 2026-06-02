package Test code;

import org.junit.Test;
import static org.junit.Assert.*;

public class GenTest {

    @Test
    public void testGetGeneration_SilentGeneration() {
        assertEquals("Silent Generation", Gen.getGeneration(1940));
    }

    @Test
    public void testGetGeneration_BabyBoomers() {
        assertEquals("Baby Boomers", Gen.getGeneration(1957));
    }

    @Test
    public void testGetGeneration_GenerationX() {
        assertEquals("Generation X", Gen.getGeneration(1972));
    }

    @Test
    public void testGetGeneration_Millenials() {
        assertEquals("Millenials", Gen.getGeneration(1991));
    }

    @Test
    public void testGetGeneration_GenerationZ() {
        assertEquals("Generation Z", Gen.getGeneration(2004));
    }

    @Test
    public void testGetGeneration_GenerationAlpha() {
        assertEquals("Generation Alpha", Gen.getGeneration(2013));
    }
}
