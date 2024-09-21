import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    static String fileName = "./src/regular.txt";
    public static void main(String[] args) throws IOException {
        regExPractice();
    }
    public static void regExPractice() throws IOException {
      // Write a regex for any zip code like 'NY 12345'

        //String regexPattern = "^[A-Z]{2}\\s[0-9]{5}$";

        // create a regex pattern to find $21.44 and
        // print "You have 21 dollars and 44 cents"

        String regexPattern = "^\\$([0-9]+)\\.([0-9]{2})$";    // group icin paranthesis kullandik

        Pattern p = Pattern.compile(regexPattern);

        List<String> strings = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
        for (String line : strings) {
            if (!line.isEmpty()) {
                Matcher matcher = p.matcher(line);
                if (matcher.find()) {
                    System.out.println(line);
                    System.out.println("You have "+matcher.group(1)+ " and "+matcher.group(2)+" cents.");

                }
            }
        }

    }
}
