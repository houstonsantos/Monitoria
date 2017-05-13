package com.monitoria.atv_02_4p;

public class MinhasMotos {

	public static void main(String[] args) {
		
		RepositorioMoto rm = new RepositorioMoto();
		
		Fabricante f1 = new Fabricante("000.000.000/0000-01", "HONDA");
		Fabricante f2 = new Fabricante("000.000.000/0000-02", "YAMAHA");
		
		Moto m1 = new Moto("0000000001", f1);
		m1.setCor("Vermelha");
		
		Moto m2 = new Moto("0000000002", f2);
		m2.setCor("Azul");
		
		Moto m3 = new Moto("0000000003", f1);
		m3.setCor("Amarela");
		
		Moto m4 = new Moto("0000000004", f2);
		m4.setCor("Verde");
		
		Moto m5 = new Moto("0000000005", f1);
		m5.setCor("Preta");

		rm.setItem(m1);
		rm.setItem(m2);
		rm.setItem(m3);
		rm.setItem(m4);
		rm.setItem(m5);
		
		rm.listItem();
	}

}
