package Ejercicios;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int[] entrada = {3,7,9,3,21};
		System.out.println(sumar(entrada));
	}
	public static int sumar(int[] entrada){
		int suma = -1;
		if (entrada.length>0) {
			suma = 0;
			for (int i = 0; i < entrada.length; i++) {
				suma += entrada[i];
			}				
		}
		return suma;
	}	
}
