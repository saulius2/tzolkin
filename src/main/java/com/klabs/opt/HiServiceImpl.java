package com.klabs.opt;

public class HiServiceImpl implements HiService {

	private String prefijoSaludo;
	private String sufijoSaludo;

	public HiServiceImpl(String prefijoSaludo, String sufijoSaludo) {
		super();
		this.prefijoSaludo = prefijoSaludo;
		this.sufijoSaludo = sufijoSaludo;
	}

	public String hi(String nombre) {
		return prefijoSaludo + nombre + sufijoSaludo;
	}

}
