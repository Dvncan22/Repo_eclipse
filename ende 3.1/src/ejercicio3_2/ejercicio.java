package ejercicio3_2;

import java.util.Scanner;

public class ejercicio {
	

	
	public static void KW(int consumo) {
		
		
	}
	public static void main(String[] args) {
		double factura,con = 0;
		int ant = 0;
		boolean bono;
		String bono_;
		Scanner t= new Scanner(System.in);
		System.out.println("Introduce el consumo: ");
		con=t.nextDouble();
		System.out.println("Introduce antigüedad");
		ant=t.nextInt();
			t.nextLine();
		System.out.println("¿Tienes bono?");
		bono_=t.next();
		
		if(bono_.equals("Si"))
			bono=true;
		else
			bono=false;
	}

	
	public static double calcularFactura(double consum,int antig,boolean bono) {
		double totalF = 0;
		if(!bono) {
			if(consum<100) {
				totalF=consum*0.2575;
			}
			if(consum>100 && consum<250) {
				totalF=consum*0.2050;
			}	
			if(consum>250) {
				totalF=consum*0.1955;
			}
			if(antig > 10)
				totalF*=0.95;
			if(antig > 5)
				totalF*=0.98;
		}
		return totalF;
	}
}
