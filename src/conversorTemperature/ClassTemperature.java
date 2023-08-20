package conversorTemperature;

import javax.swing.JOptionPane;

public class ClassTemperature {

	conversorTemperatura temperatura = new conversorTemperatura();
	
	public void ConvertirTemperatura(double valor) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
    			new Object[] {"Grados Celcius a Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Celcius",
    					"Grados Kelvin a Celcius","Grados Kelvin a Farenheit"}, "Seleccion")).toString();
    	
        switch(opcion) {
        case "Grados Celcius a Farenheit":
        	temperatura.Celcius_Farenheit(valor);
        	break;
        case "Grados Celcius a Kelvin":
            temperatura.Celcius_Kelvin(valor);
            break;
        case "Grados Farenheit a Celcius":
           temperatura.Farenheit_Celcius(valor);
           break;
        case "Grados Kelvin a Celcius":
           temperatura.Kelvin_Celcius(valor);
           break;
        case "Grados Kelvin a Farenheit":
        	temperatura.Kelvin_Farenheit(valor);
        	break;
        }
	}
	
}
