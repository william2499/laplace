package pfinal;

public class operacion2 {

	 String evaluaExpresion2 (String cadena){
		 
	        //(a)t^n
	        String resultado="";
	        String base="";
	        //reviso que tenga la base de la expresion 2
	        if (cadena.contains("t^"))
	            base="t^";
	        else if (cadena.contains("t"))
	            base="t";
	        if (base.equals(""))
	            return "";
	        
	        int indexBase=cadena.indexOf(base);
	        String a=cadena.substring(0, indexBase);
	        //System.out.println("a: "+a);
	        String n=cadena.substring(indexBase+base.length(),cadena.length());
	        //System.out.println("n: "+n);
	        
	        
	        //verifica que sean valores numericos
	        double aDouble=1;
	        int nInt=1;
	        if (!a.equals("")){
	            try {
	                aDouble=Double.parseDouble(a);
	            } catch (Exception e) {
	                return "";
	            }
	        }
	        if (n.equals("")){
	            if (base.equals("t^")){
	                return "";////si la base es t^ se espera exponente
	            }
	        }else{
	            try {
	                nInt=Integer.parseInt(n);
	                if (nInt<0)
	                    return "";
	            } catch (Exception e) {
	                return "";
	            }
	        } 
	        
	        if (aDouble > 0) {
	        	System.out.print("+");
	        }
	        
	        resultado=factorial(nInt)+"/(S^"+(nInt+1)+")";
	        if (aDouble!=1){
	            resultado=aDouble+"("+resultado+")";
	        }
	        System.out.print(resultado);
	        return resultado;
	        
	    }
	    
	    //Funcion recursiva para el calculo de Factorial
	    
	    public static int factorial (int numero) {
	        if (numero==0)
	            return 1;
	        else
	            return numero * factorial(numero-1);
	        
	    }
}
