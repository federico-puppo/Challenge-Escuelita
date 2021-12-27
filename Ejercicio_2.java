package Ejercicios;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int [][] ejemplo = {{1,2,3},{2,3,4},{4,5,6}};
		System.out.println(difDeSuma(ejemplo));
	}
	public static int difDeSuma(int [][] entrada) {
		int diagonalA = 0;
		int diagonalB = 0;
		for (int i = 0; i <= entrada.length-1; i++) {
			int j = entrada[i].length-1-i;
		    diagonalA += entrada[i][i];
		    diagonalB += entrada[i][j];
		}
		return diagonalA-diagonalB;		
	}

}
