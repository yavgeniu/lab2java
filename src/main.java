import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        int StartLine = Integer.parseInt(args[0]);
        int countLines = Integer.parseInt(args[1]);

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(args[2]), StandardCharsets.UTF_8))) {
            String line;
            int i = 1, j = countLines;
            while ((line = reader.readLine()) != null) {
                i++;


                if (i > StartLine && j > 0) {
                    j--;
                    System.out.println(line);
                }

            }
        } catch (IOException e) {

        }
    }
}