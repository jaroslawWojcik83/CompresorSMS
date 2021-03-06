import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompressorTest {

    private Compressor compressor;

    @Before
    public void setUp() throws  Exception {
        compressor = new Compressor();
    }

    @Test
    public void compress() {
        String SMS = "ala ma kota";
        String expected = "AlaMaKota";
        assertEquals(expected, compressor.compress(SMS));
    }

    @Test
    public void uncompress() {
        String SMS = "AlaMaKotaŻet";
        String expected = "ala ma kota żet";
        assertEquals(expected, compressor.uncompress(SMS));
    }

    @Test
    public void smsIsNullCompresSMS() {
        String SMS = null;
        String expected = "";
        assertEquals(expected, compressor.compress(SMS));
    }

    @Test
    public void smsIsNullUncompresSMS() {
        String SMS = null;
        String expected = "";
        assertEquals(expected, compressor.uncompress(SMS));
    }

    @Test
    public void smsIsEmptyCompresSMS() {
        String SMS = "";
        String expected = "";
        assertEquals(expected, compressor.compress(SMS));
    }

    @Test
    public void smsIsEmptyUncompresSMS() {
        String SMS = "";
        String expected = "";
        assertEquals(expected, compressor.uncompress(SMS));
    }


    @Test
    public void smsIsMixCaseCompresSMS() {
        String SMS = "AlA Ma koTA";
        String expected = "AlaMaKota";
        assertEquals(expected, compressor.compress(SMS));
    }

    @Test
    public void smsIsMixCaseUncompresSMS() {
        String SMS = "AlaMaKoTA";
        String expected = "ala ma ko t a";
        assertEquals(expected, compressor.uncompress(SMS));
    }


}


