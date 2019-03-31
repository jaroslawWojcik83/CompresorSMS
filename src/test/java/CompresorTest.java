import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompresorTest {

    private Compresor compresor;

    @Before
    public void setUp() throws  Exception {
        compresor = new Compresor();
    }

    @Test
    public void compres() {
        String SMS = "ala ma kota";
        String expected = "AlaMaKota";
        assertEquals(expected, compresor.compres(SMS));
    }

    @Test
    public void uncompres() {
        String SMS = "AlaMaKotaŻet";
        String expected = "ala ma kota żet";
        assertEquals(expected, compresor.uncompres(SMS));
    }

    @Test
    public void smsIsNullCompresSMS() {
        String SMS = null;
        String expected = "";
        assertEquals(expected, compresor.compres(SMS));
    }

    @Test
    public void smsIsNullUncompresSMS() {
        String SMS = null;
        String expected = "";
        assertEquals(expected, compresor.uncompres(SMS));
    }

    @Test
    public void smsIsEmptyCompresSMS() {
        String SMS = "";
        String expected = "";
        assertEquals(expected, compresor.compres(SMS));
    }

    @Test
    public void smsIsEmptyUncompresSMS() {
        String SMS = "";
        String expected = "";
        assertEquals(expected, compresor.uncompres(SMS));
    }


    @Test
    public void smsIsMixCaseCompresSMS() {
        String SMS = "AlA Ma koTA";
        String expected = "AlaMaKota";
        assertEquals(expected, compresor.compres(SMS));
    }

    @Test
    public void smsIsMixCaseUncompresSMS() {
        String SMS = "AlaMaKoTA";
        String expected = "ala ma ko t a";
        assertEquals(expected, compresor.uncompres(SMS));
    }


}


