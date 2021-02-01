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
	public static int hacerMultiplicacion(int[] x) {
		int resultado = 1;
		for (int c = 0; c < x.length; c++) {
			resultado = resultado * x[c];
		}
		return resultado;
	}
	
	 public static int hacerDivision(int[]x) {
		int resultado=x[0] ;
		for (int c=1;c<x.length;c++) {
			resultado = resultado/x[c];
		}
		return resultado;
		
	}
	
	public static int hacerSuma(int[]x) {
		int resultado=0;
		
		for (int i = 0; i < x.length; i++) {
			
			resultado=resultado+x[i];
			
		}
		return resultado;
	}
	
	public static int haceResta(int[] j) {
		
		
		int resultado=j[0];
		
		for (int i = 1; i < j.length; i++) {
			
			resultado=resultado-j[i];
			
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 System.out.println("Â¿QuÃ© cÃ¡lculo quiÃ©res hacer?");
		 String calculo=teclado.next();
		
		
		
		switch (calculo) {
		
		case "suma":
			System.out.println("La suma de esos valores es: "+hacerSuma(crear()));
			break;
			
		case "resta":
			System.out.println("La resta de esos valores es: "+haceResta(crear()));
			break;
			
		case "multiplicacion":
			System.out.println("La multiplicaciÃ³n de esos valores es: "+hacerMultiplicacion(crear()));
			break;
			
		case "division":
			System.out.println("La divisiÃ³n de esos valores es: "+hacerDivision(crear()));
			break;
		default:
			System.out.println("CÃ¡lculo no encontrado");
			break;
		}

	}
}
