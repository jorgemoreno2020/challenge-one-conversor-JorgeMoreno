package ConversorMonedas;

import javax.swing.JOptionPane;

public class convertirPesosAOtras {

	public void convertirPesosADolares(double cantidad) {
		double dolar= cantidad/4000;
		double Dolar= (double) Math.round(dolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Dolar+"Dolares");
	}
	
	public void convertirPesosAEuros(double cantidad) {
		double euro= cantidad/4466;
		double Euro= (double) Math.round(euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Euro+"Euros");
	}
	
	public void convertirPesosALibrasEsterlinas(double cantidad) {
		double esterlina= cantidad/5222;
		double Esterlina= (double) Math.round(esterlina *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Esterlina +"Libras Esterlinas");
	}
	
	public void convertirPesosAYuan(double cantidad) {
		double yuan= cantidad/28.20;
		double Yuan= (double) Math.round(yuan*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Yuan+"Yuanes");
	}
		
	public void convertirPesosAWon(double cantidad) {
		double won= cantidad/3.08;
		double Won= (double) Math.round(won *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ Won +"Wons");
	}
	
	
}
