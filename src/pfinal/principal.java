package pfinal;

import javax.swing.JOptionPane;



public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int tipoExpresion=0;
	        String resultado="";
	        String seg = "";
	        String op;
	       
	        
	        do {
	        	
	        	String fun="";
	    		int a=0;;
	    		int b;
	    		int cont = 1;
	    		int cont2 = 0;
	    		fun = JOptionPane.showInputDialog("Introduzca la ecuacion de Laplace");
	    		for (int i=0; i<fun.length(); i++) {
	    			if (fun.charAt(i)==' '){
	    				cont += 1;
	    			}
	    		}
	    		String [] mt = new String [cont];
	    		for (int i=0; i<fun.length(); i++) {
	    			if (fun.charAt(i)==' '){
	    				b = i;
	    				mt[cont2]= fun.substring(a,b);
	    				a = b+1;
	    				cont2 += 1;
	    			}
	    		}
	    		mt[cont2]= fun.substring(a,fun.length());
	    		for (int i = 0;  i<mt.length; i++) {
	        		if (mt[i].contains("t^") ) {
	           		operacion2 ob = new operacion2();
	           		ob.evaluaExpresion2 (mt[i]);
	        		}
	           
	        	if (mt[i].contains("e^")) {
	   				Laplace_3 obb = new Laplace_3();
	   				obb.evaluaExpresión3(mt[i]);
	        	}
	           
	        	if (mt[i].contains ( "senh" )){
	        	   Laplace_6 obje = new Laplace_6();
	   			 	obje.evaluaexpresion_senh(mt[i]);
	        	}
	           
	           if (mt[i].contains ( "cosh" )){
	        	   	Laplace_7 obj =  new  Laplace_7 ();
	           		obj.evaluaExpresion_cosh(mt[i]);
	   		   } 
	           
	           if (mt[i].contains("xsen")) {
	        	   Laplace_8 obj = new Laplace_8();
	        	   obj.evaluacionExresion_cambi(mt[i]);
	           }
	           
	           if (mt[i].contains("xcos")) {
	        	   Laplace_9 obj = new Laplace_9();
	        	   obj.evaluacionExresion_cambi(mt[i]);
	           }
	           
	           if (mt[i].contains ( "sen" )){
	           		Laplace_4 obe = new  Laplace_4();
	           		obe.evaluaExpresion4(mt[i]);  //valor no absoluto
	   		   }
	           
	           if (mt[i].contains ( "cos" )){
	   			Laplace_5 obee = new Laplace_5 ();
	           obee.evaluaExpresion5(mt[i]);
	   		} else {
	   			operacion o =  new operacion ();
	           o.evaluaExpresion1 (mt[i]);
	   		}
	    
	       }
	       seg = JOptionPane.showInputDialog ("¿Desea continuar? si/no");
	        } while(seg.equals("si"));
	    }
	

}
