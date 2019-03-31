import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaginatorTest {



    @Test
    public void pagiator() {
        Paginator page = new Paginator(3);
        String SMS = "ala ma kota";
        String [] expected = {"ala", " ma", " ko", "ta"};
        assertEquals(expected, page.paginate(SMS));
    }

    @Test
    public void pagiatorShortTekst() {
        Paginator page = new Paginator(160);
        String SMS = "ala ma kota";
        String [] expected = {"ala ma kota"};
        assertEquals(expected, page.paginate(SMS));
    }
}
