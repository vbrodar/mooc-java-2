package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class ButtonAndTextFieldApplication extends Application {

    public void start(Stage window) {
        Button buttonComponent = new Button("This is button");
        TextField textField = new TextField("This is a text field");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(textField);

        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
