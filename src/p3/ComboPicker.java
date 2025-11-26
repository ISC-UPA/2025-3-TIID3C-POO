package p3;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboPicker extends Application {

    @Override
    public void start(Stage stage) {
        // Controles nativos de JavaFX 8
        Spinner<Integer> integerSpinner = new Spinner<>(0, 100, 50);
        ComboBox<String> itemCombo = new ComboBox<>();
        itemCombo.getItems().addAll("A", "B", "C", "D", "E");
        itemCombo.setValue("A");
        
        DatePicker datePicker = new DatePicker();
        TextField timeField = new TextField("12:00:00");
        TextField dateTimeField = new TextField("2025-11-26 12:00");
        TextField durationField = new TextField("PT2H30M");

        FlowPane flowPane = new FlowPane();
        flowPane.setPrefWidth(800);
        flowPane.setHgap(20);
        flowPane.setVgap(20);
        flowPane.setPadding(new Insets(20));
        flowPane.getChildren().add(wrap("Integer Spinner", integerSpinner));
        flowPane.getChildren().add(wrap("Item ComboBox", itemCombo));
        flowPane.getChildren().add(wrap("Date Picker", datePicker));
        flowPane.getChildren().add(wrap("Time Field", timeField));
        flowPane.getChildren().add(wrap("DateTime Field", dateTimeField));
        flowPane.getChildren().add(wrap("Duration Field", durationField));

        Scene scene = new Scene(flowPane);
        stage.setTitle("JavaFX 8 Demo");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.show();
    }

    private VBox wrap(String title, Control control) {
        Label titleLabel = new Label(title);
        titleLabel.setStyle("-fx-font-size: 16px;");
        VBox box = new VBox(10, titleLabel, control);
        box.setStyle("-fx-background-color: black, white; -fx-background-insets: 0, 1; -fx-padding: 10px;");
        // en cuanto seleccione el control ComboBox, mostrar su valor seleccionado
        if (control instanceof ComboBox) {
            ComboBox<?> comboBox = (ComboBox<?>) control;
            comboBox.setOnAction(e -> {
                Object selected = comboBox.getSelectionModel().getSelectedItem();
                System.out.println("ComboBox seleccionado: " + selected);
            });
        }
        // En cuanto selecione el DatePicker, mostrar su valor seleccionado
        if (control instanceof DatePicker) {
            DatePicker dp = (DatePicker) control;
            dp.setOnAction(e -> {
                Object selectedDate = dp.getValue();
                // Extraer el año del valor seleccionado
                int year = ((LocalDate) selectedDate).getYear();
                System.out.println("DatePicker seleccionado: " + selectedDate + ", Año: " + year);
            });
        }
        return box;

    }

    public static void main(String[] args) {
        launch();
    }
}