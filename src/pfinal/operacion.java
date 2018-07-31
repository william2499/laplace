package pfinal;

import javax.swing.JOptionPane;

public class operacion {

	String evaluaExpresion1(String cadena){
		
		String resultado="";
		String operador = "+";
		char s = cadena.charAt(0);
		
		if (s == '-') {
			operador = "-";
			
		}
		
        try {
            double valor=Double.parseDouble(cadena);
            System.out.print(operador);
    		if (valor < 0) {
    			valor *= (-1);
    		}
    		resultado=valor+"/S";
            System.out.print(resultado);
        } catch (Exception e) {
            System.out.print(" ");
        }
        return resultado;
		
	}
}
