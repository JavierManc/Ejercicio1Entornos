import java.util.*;

public class Principal {
	
	static int [] crear() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Cuantos numeros introduces");
		int x=teclado.nextInt();
		int [] calcular=new int[x];
		
		
		for(int c=0;c<calcular.length;c++) {
			System.out.println("Introduce el valor "+(c+1));
			calcular[c]=teclado.nextInt();
	}
		return calcular;
	}
	
	static int hacerSuma(int[]x) {
		int resultado = 0;
		for(int c=0;c<x.length;c++) {
			resultado=resultado+x[c];
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 System.out.println("dasdas");
		 String calculo=teclado.next();
		
		
		
		switch (calculo) {
		
		case "suma":
			System.out.println(hacerSuma(crear()));
			break;
			
		case "resta":
			System.out.println(hacerResta(crear()));
			break;
			
			break;
			
		case "multiplicacion":
			System.out.println(hacerMultiplicacion(crear()));
			break;
			
			break;
			
		case "division":
			System.out.println(hacerDivision(crear()));
			break;
			
			break;
		}

	}
}
