package duke;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TodoWindow {

    @FXML
    private AnchorPane window;
    @FXML
    private TextField userInput;
    @FXML
    private Label errorName;

    private Parser parser;

    public void setParser(Parser p) {
        assert(p != null);
        this.parser = p;
    }

    @FXML
    private void submit() {
        String command = userInput.getText();
        if (command.trim().isEmpty()) {
            errorName.setText("Name required");
        } else {
            parser.parse("todo " + command);
            window.getScene().getWindow().hide();
        }
    }
}
