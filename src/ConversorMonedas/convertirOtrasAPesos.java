package ConversorMonedas;

import javax.swing.JOptionPane;

public class convertirOtrasAPesos {
	
	public void convertirDolaresAPesos(double cantidad) {
		double dolar= cantidad*4000;
		double Dolar = (double) Math.round(dolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Dolar+"Pesos Colombianos");
	}
	
	public void convertirEurosAPesos(double cantidad) {
		double euro= cantidad*4466;
		double Euro = (double) Math.round(euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Euro +"Pesos Colombianos");
	}
	
	public void convertirLibrasEsterlinasAPesos(double cantidad) {
		double esterlina= cantidad*5222;
		double Esterlina = (double) Math.round(esterlina *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Esterlina +"Pesos Colombianos");
	}
	
	public void convertirYuanAPesos(double cantidad) {
		double yuan= cantidad*28.20;
		double Yuan = (double) Math.round(yuan *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Yuan +"Pesos Colombianos");
	}
		
	public void convertirWonAPesos(double cantidad) {
		double won= cantidad*3.08;
		double Won = (double) Math.round(won *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Won +"Pesos Colombianos");
	}
	

}
