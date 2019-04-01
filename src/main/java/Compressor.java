
import java.util.Arrays;
import java.util.stream.Collectors;

public class Compressor implements CompressorInterface {

    public Compressor() {
    }

    @Override
    public String compress(String normalSMS) {

        if (normalSMS != null) {
            return Arrays.stream(normalSMS.split(" ")).map(
                    word -> word.length() > 0 ?
                            word.substring(0, 1).toUpperCase() +
                            word.substring(1).toLowerCase() : word)
                    .collect(Collectors.joining(""));
        } return "";
    }

    @Override
    public String uncompress(String compressSMS) {

        if (compressSMS != null) {
            return Arrays.stream(compressSMS.split("(?=\\p{Lu})")).map(
                    String::toLowerCase)
                    .collect(Collectors.joining(" "));
        } return "";
    }
}
