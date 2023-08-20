package conversorTemperature;

import javax.swing.JOptionPane;

public class conversorTemperatura {
	
	public double redondeo(double valor) {
		double dato= (double)Math.round(valor*100d)/100;
		return dato;
	}
	
	public void Celcius_Farenheit(double valor) {
		double farenheit= valor*1.8+32;
		farenheit=redondeo(farenheit);
		JOptionPane.showMessageDialog(null, valor+ " Grados Celcius son: "+farenheit+ " Grados Farenheit" );		
	}
	
	public void Celcius_Kelvin(double valor) {
		double kelvin= valor+ 273.15;
		kelvin=redondeo(kelvin);
		JOptionPane.showMessageDialog(null, valor+ " Grados Celcius son: "+kelvin+ " Grados Kelvin" );		
	}
	
	public void Farenheit_Celcius(double valor) {
		double celcius= (valor-32)/1.8;
		celcius=redondeo(celcius);
		JOptionPane.showMessageDialog(null, valor+ " Grados Farenheit son: "+celcius+ " Grados Celcius" );		
	}
	
	public void Kelvin_Celcius(double valor) {
		double celcius= valor+ 273.15;
		celcius=redondeo(celcius);
		JOptionPane.showMessageDialog(null, valor+ " Grados Kelvin son: "+celcius+ " Grados Celcius" );		
	}
	
	public void Kelvin_Farenheit(double valor) {
		double kelvin= valor+ 273.15;
		kelvin=redondeo(kelvin);
		JOptionPane.showMessageDialog(null, valor+ " Grados Kelvin son: "+kelvin+ " Grados Farenheit" );		
	}
}
