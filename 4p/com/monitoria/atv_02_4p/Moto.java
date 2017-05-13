package com.monitoria.atv_02_4p;

public class Moto {
	
	private String chassis;
	private String cor;
	private Fabricante fabricante;
	private static final int QUANTIDADE_RODAS = 2;
	
	public Moto() {
		
	}

	public Moto(String chassis, Fabricante fabricante) {
		super();
		this.chassis = chassis;
		this.fabricante = fabricante;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getQuantidadeRodas() {
		return QUANTIDADE_RODAS;
	}
	
}
