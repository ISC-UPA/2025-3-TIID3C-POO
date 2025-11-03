package p3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class P04JavaFXMain3 extends Application {

    public void start(Stage primaryStage) {

        AudioClip audio = new AudioClip(getClass().getResource("../vis/Note5.wav").toString());
        Image image1 = new Image(getClass().getResource("../vis/fan1.png").toString());
        Image image2 = new Image(getClass().getResource("../vis/fan2.png").toString());
        ImageView imageView = new ImageView(image1);
        // imageView.setFitWidth(50);
        // imageView.setPreserveRatio(true);
        // imageView.toFront();

        HBox rootHBox = new HBox();
        Label lbl = new Label("Hello, JavaFX!");
        rootHBox.getChildren().add(lbl);

        BorderPane root = new BorderPane(); // Group root = new Group();
        Label lbl2 = new Label("Hello, POO!");
        root.setTop(rootHBox);
        root.setCenter(imageView);

        audio.play();
        // cada vez que se hace click en la imagen, audio.play();

        imageView.setOnMousePressed(event -> System.out.println("Clicked at: " + event.getX() + ", " + event.getY()));

        imageView.setOnMouseClicked(event -> {
            audio.play();
            // formater a dos decimales
            lbl2.setText( // getX, getSceneX, getScreenX
                    "Clicked at: " + String.format("%.2f", event.getX()) + ", " + String.format("%.2f", event.getY()));
        });

        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                imageView.setImage(i % 2 == 0 ? image1 : image2);
            }
        }).start();

        root.setBottom(lbl2);
        Scene scene = new Scene(root, 300, 250, Color.rgb(50, 50, 50));
        primaryStage.setTitle("JavaFX Main 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
