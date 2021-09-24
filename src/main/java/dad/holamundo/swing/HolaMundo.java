package dad.holamundo.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundo {

	public static void main(String[] args) {
		
		// CREAMOS LA ETIQUETA PARA MOSTRAR EL SALUDO
				JLabel saludoLabel = new JLabel();
				saludoLabel.setText("Aquí saldrá el saludo");
				saludoLabel.setBounds(20, 20, 120, 50);
				
		// CREAMOS EL BOTÓN PARA SALUDAR
				JButton saludarButton= new JButton();
				saludarButton.setText("Saludar");
				saludarButton.setBounds(20, 80, 120, 30);
				saludarButton.setToolTipText("Como me pulse te saludo");
				saludarButton.addActionListener(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!"));
				
		// PANEL (CONTENEDOR) QUE CONTIENE LA ETIQUETA
				JPanel rootPanel = new JPanel();
				rootPanel.setLayout(null);
				rootPanel.add(saludoLabel);
				rootPanel.add(saludarButton);
				
		// VENTANA
				JFrame frame = new JFrame();
				frame.setTitle("Hola Mundo con Swing");
				frame.setSize(320, 200);
				frame.setLocationRelativeTo(null); // centrar la ventana en pantalla
				frame.setResizable(false);
				frame.add(rootPanel);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				
				
	}	
	
}
