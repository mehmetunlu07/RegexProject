import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    static String fileName = "./src/log.txt";
    public static void main(String[] args) throws IOException {
        regExPractice();
    }
    public static void regExPractice() throws IOException {
        /** Write a regex for IPv4 in a given log
        It should be formed with 4 groups
        each group must be lower than 256
        between the groups, there should be a dot. **/

       String regexPattern = "([0-9]{1,3}\\.){3}[0-9]{1,3}";

        byte[]fileBytes=Files.readAllBytes(Paths.get(fileName));
        String fileContent=new String(fileBytes, Charset.defaultCharset());

        Pattern p = Pattern.compile(regexPattern);
        Matcher matcher=p.matcher(fileContent);

        while(matcher.find()){
            String match=matcher.group();
            System.out.println(match);
       }

    }
}
