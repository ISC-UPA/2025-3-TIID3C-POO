package p3;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TablaFX extends Application {
    private TextArea textArea;

    @Override
    public void start(Stage primaryStage) {
        // --- Etiqueta título ---
        Label lblTitulo = new Label("Tabla de Multiplicar");
        lblTitulo.setFont(new Font("Tahoma", 20));

        // --- Campo de entrada ---
        Label lblNumero = new Label("Número:");
        TextField textField = new TextField();
        textField.setPrefWidth(120);

        // Placeholder con estilo mejorado
        textField.setPromptText("Ingresa un número");
        textField.setStyle("-fx-prompt-text-fill: gray;");

        // --- Botón ---
        Button btnCalcular = new Button("Calcular");

        // --- Área de resultados ---
        textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setPrefHeight(200);

        // Para que el área de texto tenga scroll si es necesario
        ScrollPane scrollPane = new ScrollPane(textArea);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        // --- Layouts ---
        HBox inputBox = new HBox(10, lblNumero, textField, btnCalcular);
        VBox root = new VBox(15, lblTitulo, inputBox, scrollPane);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // --- Acción del botón ---
        btnCalcular.setOnAction(e -> calcularTabla(textField));

        // También calcular al presionar Enter en el campo de texto
        textField.setOnAction(e -> calcularTabla(textField));

        // --- Escena y Stage ---
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Tabla de Multiplicar - JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calcularTabla(TextField textField) {
        try {
            int x = Integer.parseInt(textField.getText().trim());
            StringBuilder sb = new StringBuilder("Tabla del número: " + x + "\n\n");
            for (int i = 1; i <= 10; i++) {
                sb.append(x).append(" x ").append(i).append(" = ").append(x * i).append("\n");
            }
            textArea.setText(sb.toString());
        } catch (NumberFormatException e) {
            textArea.setText("⚠️ Ingresa un número válido.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
