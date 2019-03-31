
import java.util.Arrays;
import java.util.stream.Collectors;

public class Compresor implements CompresorInterface {

    public Compresor() {
    }

    @Override
    public String compres(String normalSMS) {

        if (normalSMS != null) {
            return Arrays.stream(normalSMS.split(" ")).map(
                    word -> word.length() > 0 ?
                            word.substring(0, 1).toUpperCase() +
                            word.substring(1).toLowerCase() : word)
                    .collect(Collectors.joining(""))
                    ;
        } return "";
    }

    @Override
    public String uncompres(String compresSMS) {

        if (compresSMS != null) {
            return Arrays.stream(compresSMS.split("(?=\\p{Lu})")).map(
                    String::toLowerCase)
                    .collect(Collectors.joining(" "))
                    ;
        } return "";
    }
}
