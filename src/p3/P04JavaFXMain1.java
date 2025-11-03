package p3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class P04JavaFXMain1 extends Application {

    public void start(Stage primaryStage) {
        // remove code from here
        Color color = Color.web("#205d83ff");
              color = Color.rgb(255, 255, 20, 1.0); 
              color = Color.AQUAMARINE;
        Image image = new Image(getClass().getResourceAsStream("../vis/Duke.png"));              
        Button btn = new Button();
        Button btn2 = new Button("Button 2", new ImageView(image));
        btn2.setLayoutX(100);
        btn2.setLayoutY(150);
        btn.setText("Say 'HelloWorld'");
        btn.setText(btn.getText().toUpperCase());
        ImageView icon = new ImageView(image);
        //btn.setGraphic(icon);
        Text tooltip = new Text("HOLA");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }// end method handle
        });// end setOnAction
       
        
        btn.setOnAction(event -> {
            System.out.println("Hello World!");
            if (event.getSource() == btn) {
                btn.setStyle("-fx-background-color: #205d83ff;");
            }
            //btn.setOnMousePressed(e -> btn.setStyle("-fx-background-color: #00ff00;"));
            //btn.setOnMouseReleased(e -> btn.setStyle("-fx-background-color: #ff0000;"));
        });
        

        //StackPane root = new StackPane();
        //AnchorPane root = new AnchorPane();
        Group root = new Group(); // for absolute positioning
        
        HBox rootHBox = new HBox();
        rootHBox.getChildren().addAll(btn, tooltip);
        rootHBox.setSpacing(10);
        rootHBox.setLayoutX(50);
        rootHBox.setLayoutY(100);

        root.getChildren().addAll( icon, rootHBox, btn2);

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
