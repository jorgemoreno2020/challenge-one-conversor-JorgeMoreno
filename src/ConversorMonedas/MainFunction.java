package ConversorMonedas;

import javax.swing.JOptionPane;

public class MainFunction {
	
	convertirOtrasAPesos pesos= new convertirOtrasAPesos();
	convertirPesosAOtras monedas= new convertirPesosAOtras();
	
	 public void ConvertirMonedas(double cantidad) {
	    	String opcion = (JOptionPane.showInputDialog(null, 
	    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
	    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
	    			{"Pesos a Dólar", "Pesos a Euro", "Pesos a Libras","Pesos a Yuan","Pesos a Won Coreano",
	    					"Dólar a Pesos", "Euro a Pesos", "Libras a Pesos","Yuan a Pesos","Won Coreano a Pesos"}, 
	    			"Seleccion")).toString();
	        switch(opcion) {
	        case "Pesos a Dólar":
	        	monedas.convertirPesosADolares(cantidad);
	        	break;
	        case "Pesos a Euro":
	        	monedas.convertirPesosAEuros(cantidad);
	        	break;
	        case "Pesos a Libras":
	        	monedas.convertirPesosALibrasEsterlinas(cantidad);
	        	break;
	        case "Pesos a Yuan":
	        	monedas.convertirPesosAYuan(cantidad);
	        	break;
	        case "Pesos a Won Coreano":
	        	monedas.convertirPesosAWon(cantidad);
	        	break;    	    	                          
	        case "Dólar a Pesos":
	        	pesos.convertirDolaresAPesos(cantidad);
	        	break;
	        case "Euro a Pesos":
	        	pesos.convertirEurosAPesos(cantidad);
	        	break;
	        case "Libras a Pesos":
	        	pesos.convertirLibrasEsterlinasAPesos(cantidad);
	        	break;
	        case "Yuan a Pesos":
	        	pesos.convertirYuanAPesos(cantidad);
	        	break;
	        case "Won Coreano a Pesos":
	            pesos.convertirWonAPesos(cantidad);
	            break;
	        }      
	    }
	
}
