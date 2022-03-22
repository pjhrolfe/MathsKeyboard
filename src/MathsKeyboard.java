//import java.awt.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MathsKeyboard {
    public static ArrayList<InteractiveButton> interactiveButtons = new ArrayList<InteractiveButton>();

    private static final GridLayout layout = new GridLayout(4, 6);
    private static HashMap<String, String> symbols;

    public static void main(String[] args) {
        symbols = KeyboardLoader.loadSymbols();

        Frame frame = new Frame("Maths Keyboard v0.1");

        for (Map.Entry<String, String> symbol : symbols.entrySet()) {
            InteractiveButton button = new InteractiveButton(symbol.getKey(), symbol.getValue());
            interactiveButtons.add(button);
        }

        for (InteractiveButton interactiveButton : interactiveButtons) {
            frame.add(interactiveButton.getButton());
        }

        frame.setSize(400,400);
        frame.setLayout(layout);
        frame.setVisible(true);
    }

    public static void copyToClipboard(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}
