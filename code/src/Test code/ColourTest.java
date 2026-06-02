package Test code;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColourTest {

    @Test
    public void testGetLuckyColour_ValidLifePath() {
        assertEquals("Yellow", Colour.getLuckyColour(3));
    }

    @Test
    public void testGetLuckyColour_ValidMasterLifePath() {
        assertEquals("White", Colour.getLuckyColour(22));
    }
}