package pfinal;

public class Laplace_7 {

	String evaluaExpresion_cosh (String cadena) {
		
		String resultado = "";
		String base = "";
		
		// verificamos si contigo cosh 
		
		if (cadena.contains ( "cosh" )){
			base = "cosh";
		}
		if (base.equals("")) {
			return "";
		}
		
		// Convertimos nuestro numeros a un entero
		
		int indice = cadena.indexOf(base);
		String a = cadena.substring(0, indice);
		String b = cadena.substring(indice+base.length(),cadena.length());
		
		// verificamos si son numeros 
		
		double aDouble = 1;
		int nin = 1;
		
		if (!a.equals("")) {
			try {
				aDouble = Double.parseDouble(a);
			}catch (Exception e) {
				return "";
			}
		}

		if (b.equals("")) {
			return "";
		}

		else {
			try {
				nin = Integer.parseInt(b);
			}catch (Exception e) {
				return "";
			}
		}
		
		if (aDouble > 0) {
			System.out.print("+");
		}
		
		resultado =  nin+("S")+ "/(S^2-"+(nin*nin)+")";
		System.out.print(resultado);
		
		return resultado;
	}
}
