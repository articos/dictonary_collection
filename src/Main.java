import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String,String> csdeDictonary = new HashMap<String,String>();
        Map<String,String> deenDictonary = new HashMap<String,String>();
        Map<String,String> encsDictonary = new HashMap<String,String>();

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\resources\\cs_de.properties"));
             BufferedReader br2 = new BufferedReader(new FileReader("D:\\resources\\de_en.properties"));
             BufferedReader br3 = new BufferedReader(new FileReader("D:\\resources\\en_cs.properties"))) {

            String csdeLine = br.readLine();
            while (br.readLine() != null) {
                String[] splitted = csdeLine.split("=");
                csdeDictonary.put(splitted[0],splitted[1]);
                csdeLine = br.readLine();
            }
            String deenLine = br2.readLine();
            while (br2.readLine() != null) {
                String[] splitted = deenLine.split("=");
                deenDictonary.put(splitted[0],splitted[1]);
                deenLine = br2.readLine();
            }
            String encsLine = br3.readLine();
            while (br3.readLine() != null) {
                String[] splitted = encsLine.split("=");
                encsDictonary.put(splitted[0],splitted[1]);
                encsLine = br3.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
