package dad.holamundo.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundo {

	public static void main(String[] args) {
		
		// CREAMOS LA ETIQUETA PARA MOSTRAR EL SALUDO
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setBounds(20, 20, 120, 50);
		
		// CREAMOS EL BOTÓN PARA SALUDAR
		Button saludarButton= new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.addActionListener(e -> onSaludarButtonAction(e));
		
		// PANEL (CONTENEDOR) QUE CONTIENE LA ETIQUETA Y EL BOTÓN
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		// VENTANA
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo en AWT");
		frame.setSize(320, 200);
		frame.setLocationRelativeTo(null); // centrar la ventana en pantalla
		frame.setResizable(false);
		frame.add(rootPanel);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();// cerrar la ventana 
			}
		});
		frame.setVisible(true);
		
	}
	
	protected static void onSaludarButtonAction(ActionEvent e) {
		System.out.println("Hola");
		
	}
}
