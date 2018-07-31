package pfinal;

public class Laplace_8 {
	
	String evaluacionExresion_cambi (String cadena) {
		
		String resultado = "";
		String base = "";
		String base1 = "";
		String op [];
		String part1;
		String part2;
		String signo ="+";
		// e^a*cosbt
		
		op = cadena.split("x");
		part1 = op[0];
		part2 = op[1];
		
		if (part1.contains("e^")) {
			base = "e^";
		}	
		else if (part1.contains("e")) {
			base = "e";
		}
		/*if (part1.equals("")) {
			return "";
		}*/
		if (cadena.contains("-")) {
			signo = "+";
		}
		
		int indicebase = part1.indexOf(base);
		String a=part1.substring(0, indicebase);
        String n=part1.substring(indicebase+base.length(),part1.length());
		
        // verifica que sean valores numericos
        
        double  aDouble = 1;
        double nin = 1;
        
        if (!a.equals("")) {
        	try {
        		aDouble = Double.parseDouble(a);
        	} catch (Exception e) {
        		return "";
        	}
        }
        
        if (n.equals("")) {
        	if (base.equals("e^")) {
        		return "";
        	} 	
        }
        else  {
        	try {
        		nin = Double.parseDouble(n);
        		
        	} catch (Exception e) {
        		return "";
        	}
        }
        if (nin > 0) {
        	signo = "-";
        }
        if (nin<0) {
        	nin *= (-1);
        }
        
        if (aDouble > 0) {
        	System.out.print("+");
        }
        
        // parte # 2 
        
        if (part2.contains ( "sen" )){
			base1 = "sen";
		}
		if (base1.equals("")) {
			return "";
		}
		
		int indice1 = part2.indexOf(base1);
		String a1 = part2.substring(0, indice1);
		String b2 = part2.substring(indice1+base1.length(),part2.length());
		
		// verificamos si son numeros 
		
		double aDouble1 = 1;
		int nin1 = 1;
		
		if (!a1.equals("")) {
			try {
				aDouble1 = Double.parseDouble(a1);
			}catch (Exception e) {
				return "";
			}
		}
		
		if (b2.equals("")) {
			return "";
		}
		
		else {
			try {
				nin1 = Integer.parseInt(b2);
			}catch (Exception e) {
				return "";
			}
		}
        
        resultado = nin1 + "/" + "(S"+ signo + nin + ")^2+" + nin1*nin1;
        System.out.print(resultado);
		return resultado;
	}
}
