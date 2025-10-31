import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXMain2 extends Application {

    public void start(Stage primaryStage) {
        // remove code from here
        Color color = Color.web("#205d83ff");
        color = Color.rgb(255, 255, 20, 1.0);
        color = Color.AQUAMARINE;

        // create simple linear gradient
        LinearGradient gradient1 = new LinearGradient(0, 0, 1, 0, true,
        CycleMethod.NO_CYCLE, new Stop[] {
        new Stop(0, Color.DODGERBLUE),
        new Stop(1, Color.BLACK)
        });

        Button btn = new Button("Calcular");
        // btn.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 0%,
        // DODGERBLUE, BLACK);");
        Rectangle rect = new Rectangle(20, 20, 100, 150); // x, y, width, height
        rect.setFill(color);
        // rect.setFill(gradient1);
        rect.setStroke(Color.BLACK);// border color
        Circle circle = new Circle(50, 50, 30); // centerX, centerY, radius
        circle.setFill(gradient1);
        Polygon polygon1 = new Polygon(new double[] {
                80.0, 10.0,
                80.0, 80.0,
                10.0, 80.0
        });

        Group root = new Group(); // for absolute positioning

        HBox rootHBox = new HBox();
        rootHBox.getChildren().addAll(rect, circle, polygon1);
        rootHBox.setSpacing(10);
        rootHBox.setLayoutX(50);
        rootHBox.setLayoutY(100);

        root.getChildren().addAll(rootHBox, btn);

        Scene scene = new Scene(root, 300, 250, Color.LIGHTGRAY);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        // to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }

}
