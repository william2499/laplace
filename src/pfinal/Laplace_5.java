package pfinal;

public class Laplace_5 {

	String evaluaExpresion5 (String cadena) {
		
		String resultado = "";
		String base = "";
		
		// verificamos si contigo cos  
		
		if (cadena.contains ( "cos" )){
			base = "cos";
		}
		if (cadena.contains("cosh")) {
			return "";
		}
		if (base.equals("")) {
			return "";
		}
		
		int indice = cadena.indexOf(base);
		String a = cadena.substring(0, indice);
		//System.out.println("a= "+a);
		String b = cadena.substring(indice+base.length(),cadena.length());
		//System.out.println("b= "+b);
		
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
		// podriamos borrar
		if (b.equals("")) {
			return "";
		}
		//hasta aqui 
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
		
		resultado =  nin+("s") + "/(s^2-"+(nin*nin)+")";
		System.out.print(resultado);
		
		return resultado;
	}
}
