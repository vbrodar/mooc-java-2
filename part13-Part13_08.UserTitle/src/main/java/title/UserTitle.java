package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;
import java.util.Scanner;

public class UserTitle extends Application {

    public void start(Stage window) {
        Parameters params = getParameters();
        String userTitle = params.getNamed().get("userTitle");

        window.setTitle(userTitle);
        window.show();
    }
}
