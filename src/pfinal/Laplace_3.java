package pfinal;

public class Laplace_3 {

		String evaluaExpresión3 (String cadena) {
		
		//(a)e^n(t)
		String resultado = "";
		String base = "";
		String signo = "+";
		//revisamoos que tenga la base e^n
		
		if (cadena.contains("e^")) {
			base = "e^";
		}	
		else if (cadena.contains("e")) {
			base = "e";
		}
		if (cadena.equals("")) {
			return "";
		}
		if (cadena.contains("-")) {
			signo = "+";
		}
		
		int indicebase = cadena.indexOf(base);
		String a=cadena.substring(0, indicebase);
        //System.out.println("a: "+a);
        String n=cadena.substring(indicebase+base.length(),cadena.length());
        //System.out.println("n: "+n);
		
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
        
        resultado = 1*aDouble + "/(S"+signo+(nin)+")";
  
        System.out.print(resultado);
        
		return resultado ;
	}
}
