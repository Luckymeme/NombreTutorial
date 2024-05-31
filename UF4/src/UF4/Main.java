package UF4;

public class Main {
	public static void main(String[] args) {
		String cadena = "Hola ";
		int veces = 3;

		String resultado = repetirCadena(cadena, veces);
		System.out.println("Resultado: " + resultado);
	}

	public static String repetirCadena(String cadena, int veces) {
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < veces; i++) {
			resultado.append(cadena);
		}
		return resultado.toString();
	}

}
