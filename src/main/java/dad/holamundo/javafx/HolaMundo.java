package dad.holamundo.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// CREAMOS LA ETIQUETA PARA MOSTRAR EL SALUDO
			Label saludoLabel = new Label();
			saludoLabel.setText("Aquí saldrá el saludo");
			saludoLabel.setLayoutX(20);
			saludoLabel.setLayoutY(20);
		
		
		// CREAMOS EL BOTÓN PARA SALUDAR
				Button saludarButton= new Button();
				saludarButton.setLabel("Saludar");
				saludarButton.setLayoutX(20); // coordenada x del botón
				saludarButton.setLayoutY(80); // coordenada y del botón
				saludarButton.setTooltip(new Tooltip("Cuando me pulses te saludo")); // establecemos un tooltip para el botón de saludar
				saludarButton.setOnAction(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!"));
	
		// creamos el panel
				Pane rootPanel = new Pane();
				rootPanel.getChildren().addAll(saludoLabel, saludarButton); // añadimos los componentes al panel
				
		// creamos la escena
				Scene escena = new Scene(rootPanel, 320, 200);
				
		// en este caso el Stage no lo creamos nosotros, nos lo da JavaFX
				primaryStage.setTitle("Hola Mundo con JavaFX"); // ponemos título a la ventana
				primaryStage.setScene(escena); // ponemos la escena
				primaryStage.setResizable(false); // hacer que la ventana no sea redimensionable
				primaryStage.show(); // mostramos la escena		
				
				
				
				
				
				
				
				
	}			
				
		public static void main(String[] args) {
		launch(args);
	}

}
