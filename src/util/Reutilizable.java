package util;

public class Reutilizable {
	
	public int calcularSuma(int numero1, int numero2){
		return numero1*numero2;
	}

	public double obtenerDescuento(int cantidad, double importe){
		double descuento;
		if (cantidad >= 45){
			descuento= importe* 0.115;
		}else if (cantidad >=30 && cantidad <45){
			descuento = importe * 0.09;
		}else if (cantidad>=15 && cantidad <30){
			descuento = importe * 0.065;
		}else {
			descuento = importe * 0.04;
		}
		return descuento;
	}
	
	
	

}
