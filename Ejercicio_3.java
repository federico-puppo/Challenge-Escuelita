package Ejercicios;

public class Ejercicio_3 {

	public static void main(String[] args) {
		int entrada = 10;
		piramide(entrada);
	}
	public static void piramide(int entrada) {
		for (int i = 1; i <= entrada; i++) {
			String espacio = new String(new char[entrada-i]).replace("\0", " ");
			String caracter = new String(new char[i]).replace("\0", " #");			
			System.out.println(espacio+caracter);
		}
	}

}
