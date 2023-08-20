package Main;

import ConversorMonedas.*;
import conversorTemperature.*;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	     MainFunction monedas = new MainFunction();
	     ClassTemperature temperatura = new ClassTemperature();
	     
	     
	        while(true) {
	        	
	        	String options = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", 
	        			JOptionPane.QUESTION_MESSAGE, null, 
	        			new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Seleccion")).toString();

	        	switch(options) {
	        	
	        	case "Conversor de Monedas":
	        		String entrada = JOptionPane.showInputDialog("Ingresa la cantidad de dinero a convertir: ");
	                if(ValidarDato(entrada)) {
	                    double valor = Double.parseDouble(entrada);
	                    monedas.ConvertirMonedas(valor);
	                     
	                    int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
	                    if (JOptionPane.OK_OPTION == respuesta){
	                     	System.out.println("Selecciona opción Afirmativa");
	                    }else{
	                       	JOptionPane.showMessageDialog(null, "Programa terminado");                         
	                    }

	                } else {
	                        JOptionPane.showMessageDialog(null, "Valor inválido");                
	                }
	                	break;
	        	

	        	case "Conversor de Temperatura":
	        	entrada = JOptionPane.showInputDialog("Ingresa el valor de la temperatura a convertir ");
	            if(ValidarDato(entrada)) {
	            	double valor = Double.parseDouble(entrada);
	                temperatura.ConvertirTemperatura(valor);

	                int respuesta = 0;
	                respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	                if((respuesta == 0) && (ValidarDato(entrada) == true)) { 
	                	}
	                else {
	                     JOptionPane.showMessageDialog(null, "Porgrama Finalizado");                     
	                 }

	             } else {
	                 JOptionPane.showMessageDialog(null, "Valor inválido");                
	             }
	             break;
	        }                
	    }
	               
	  }
	
	    public static boolean ValidarDato(String entrada) {
	        try {
	            double dato = Double.parseDouble(entrada);
	            if(dato >= 0 || dato < 0);
	                return true;
	            } catch (NumberFormatException e) {
	                return false;
	            }
	    }
		
		
	}

