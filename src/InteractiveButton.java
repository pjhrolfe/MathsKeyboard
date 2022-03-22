import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InteractiveButton implements ActionListener {
    private Button button;
    private String buttonContent;

    public InteractiveButton(String buttonLabel, String buttonContent) {
        this.button = new Button(buttonLabel);
        this.buttonContent = buttonContent;
        button.addActionListener(this);
    }

    public Button getButton() {
        return button;
    }

    public void setButton(String buttonLabel) {
        button.setLabel(buttonLabel);
    }

    public String getButtonContent() {
        return buttonContent;
    }

    public void setButtonContent(String buttonContent) {
        this.buttonContent = buttonContent;
    }

    public void actionPerformed(ActionEvent e) {
        MathsKeyboard.copyToClipboard(buttonContent);
    }
}