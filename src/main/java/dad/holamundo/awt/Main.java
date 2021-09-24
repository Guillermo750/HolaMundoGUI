package dad.holamundo.awt;

public class Main {

	public static void main(String[] args) {
		
		MiInterfaz mi1 = new MiInterfaz() {
			@Override
			public void saludar(String nombre, String apellidos) {
				System.out.println("Buenos días " + nombre);
			}
		};
		
		MiInterfaz mi2 = (n,a) -> System.out.println("Buenos días " + nombre);
		
		m1.saludar("Manolito");
		m2.saludar("Gafotas");

	}

}
