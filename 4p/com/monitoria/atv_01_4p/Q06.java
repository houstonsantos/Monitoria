package com.monitoria.atv_01_4p;
import javax.swing.JOptionPane;

/**
 * 
 * @author Houston Santos
 * Escreva um código onde informe 4 notas e faça a média ponderada com pesos 5, 4, 3 e 2.
 */

public class Q06 {

	public static void main(String[] args) {
		
		String[] nota = new String[4];
		float[] Nota = new float[4];
								
		for (int i = 0; i <= 3; i++) {
			nota[i] = JOptionPane.showInputDialog("Digite sua nota de número " + (i+1));
			
			for (int j = 0; j <= i; j++) {
				Nota[i] = Float.parseFloat(nota[j]);
			}
		}
		JOptionPane.showMessageDialog(null, ((Nota[0] * 5) + (Nota[1] * 4) + (Nota[2] * 3) + (Nota[3] * 2)) / (5 + 4 + 3 + 2));
	}
}

