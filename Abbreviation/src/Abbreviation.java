import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviation {

    private static Pattern pattern = Pattern.compile("[а-яА-Яё]+");
    private static ArrayList<String> conjunctions = new ArrayList<>(Arrays.asList("и", "или"));

    /**
     * Creates an abbreviation from a source string.
     *
     * Supports Russian language only.
     * @param string source string
     * @return an abbreviation
     */
    public static String abbreviation(String string) {
        Matcher matcher = pattern.matcher(string);
        StringBuilder abbreviation = new StringBuilder();
        while (matcher.find()) {
            if (!conjunctions.contains(matcher.group()))
                abbreviation.append(matcher.group().charAt(0));
        }
        return abbreviation.toString().toUpperCase();
    }

}
