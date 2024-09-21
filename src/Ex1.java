import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    static String fileName = "./src/regular.txt";
    public static void main(String[] args) throws IOException {
        regExPractice();
    }
    public static void regExPractice() throws IOException {
        //String regexPattern = "[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}";
        //String regexPattern = "\\d{2}\\.\\d{2}\\.\\d{4}";
        //String regexPattern = "x\\s\\^\\sy";          // x ^ y
        //String regexPattern = "x\\\\y";                 //  x\y
        //String regexPattern = "fooa*bar";
        //String regexPattern = "fooa+bar";
        //String regexPattern = "fooa?bar";
        //String regexPattern = "foo.*bar";
        //String regexPattern = "([A-Z][a-z]*)\\s([A-Z][a-z]*)";
       // String regexPattern = "foo(ax){4}bar";
        //String regexPattern = "foo[ax]{4}bar";
        String regexPattern = "foo(ax)?bar";
        Pattern p = Pattern.compile(regexPattern);

        List<String> strings = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
        for (String line : strings) {
            if (!line.isEmpty()) {
                Matcher matcher = p.matcher(line);
                if (matcher.find()) {
                    //System.out.println("User firstname is: "+matcher.group(1));
                    //System.out.println("User lastname is: "+matcher.group(2));
                    System.out.println(line);
                }
            }
        }

    }
}
