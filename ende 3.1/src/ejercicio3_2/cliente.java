package ejercicio3_2;

public class cliente {
	String abonado;
	boolean bonoSocial;
	double consumo;
	int antigŁedad;
	double totalFactura;

	public void ejercicio(String abonado, boolean bonoSocial, int consumo, int antigŁedad, int totalFactura) {
		this.abonado = abonado;
		this.bonoSocial = bonoSocial;
		this.consumo = consumo;
		this.antigŁedad = antigŁedad;
		this.totalFactura = totalFactura;
	}
	
	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(double totalFactura) {
		this.totalFactura = totalFactura;
	}

	public String getAbonado() {
		return abonado;
	}
	public void setAbonado(String abonado) {
		this.abonado = abonado;
	}
	public boolean isBonoSocial() {
		return bonoSocial;
	}
	public void setBonoSocial(boolean bonoSocial) {
		this.bonoSocial = bonoSocial;
	}
	
	public int getAntigŁedad() {
		return antigŁedad;
	}
	public void setAntigŁedad(int antigŁedad) {
		this.antigŁedad = antigŁedad;
	}
}
