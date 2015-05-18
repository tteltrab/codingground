import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HelloWorld{

     public static void main(String []args){
        String test = "1304150 1304151 1304152 1304153 1304154 1304155 1304156 1304157 1304158 1304159\r\n" +
                      "2222220 2222221 2222222 2222223 2222225 2222226 2222227 2222228 2222229\r\n" +
                      "123987\r\n" +
                      "5304150 5304151 5304152 5304153 5304154 5304155 5304156 5304157 5304158 5304159\r\n" + 
                      "7304150 7304153 71304156";

        Pattern p = Pattern.compile("^(?!((\\d{6})0 (?:\\2)1 (?:\\2)2 (?:\\2)3 (?:\\2)4 (?:\\2)5 (?:\\2)6 (?:\\2)7 (?:\\2)8 (?:\\2)9)).*$", Pattern.MULTILINE);
        Matcher m = p.matcher(test);
        
        while (m.find()) {
            System.out.println(new String(m.group()));
        }
     }
}
