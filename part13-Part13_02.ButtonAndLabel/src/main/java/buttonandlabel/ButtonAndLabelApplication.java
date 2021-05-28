package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public void start(Stage window) {
        Button buttonComponent = new Button("This is a button");
        Label labelComponent = new Label("This is a label");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(labelComponent);
        componentGroup.getChildren().add(buttonComponent);

        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
