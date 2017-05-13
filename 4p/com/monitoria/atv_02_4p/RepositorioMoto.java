package com.monitoria.atv_02_4p;
//import java.util.ArrayList;

public class RepositorioMoto {
	
	Moto[] moto = new Moto[5];
	private int indice = 0;
		
	/*
	ArrayList<Moto> moto = new ArrayList<Moto>();
		
	public void setItem(Moto moto) {
		this.moto.add(moto);
	}
	*/
	
	public void setItem(Moto moto) {
		this.moto[indice] = moto;
		indice++;
	}
	
	public void listItem() {
		for (int i = 0; i < moto.length; i++) {
			//System.out.println(moto[i]);
			System.out.println("Moto " + (i+1) + " Cor: " + moto[i].getCor() + " Fabricante: " + moto[i].getFabricante().getNome());
		}
	}

}
