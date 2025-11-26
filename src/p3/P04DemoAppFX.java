package p3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class P04DemoAppFX extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX funciona correctamente");
        Button button = new Button("Click aquí");
        button.setOnAction(e -> label.setText("¡Botón presionado!"));

        VBox root = new VBox(20, label, button);
        root.setStyle("-fx-padding: 40px; -fx-alignment: center;");

        Scene scene = new Scene(root, 400, 200);
        stage.setTitle("Demo Simple JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
