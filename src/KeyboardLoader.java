import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class KeyboardLoader {
    public static final String symbolListLocation = "symbols.txt";

    public static HashMap<String, String> loadSymbols() {
        try {
            FileReader fileReader = new FileReader(symbolListLocation);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            boolean endOfFile = false;
            HashMap symbols = new HashMap();

            while (!endOfFile) {
                String line = bufferedReader.readLine();

                if (line != null) {
                    String[] splitLine = line.split(",");
                    symbols.put(splitLine[0], splitLine[1]);
                } else {
                    endOfFile = true;
                }
            }

            return symbols;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
