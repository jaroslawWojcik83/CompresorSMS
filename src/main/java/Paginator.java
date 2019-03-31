import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class Paginator {

    private int maxLenght;

    public Paginator(int lenght) {
        maxLenght = lenght;
    }

    String [] paginate(String input) {

        Iterable<String> chunks = Splitter.fixedLength(maxLenght).split(input);
        return Lists.newArrayList(chunks).toArray(new String[0]);

    }

}
