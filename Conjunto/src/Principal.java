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
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 System.out.println("¿Qué cálculo quiéres hacer?");
		 String calculo=teclado.next();
		
		
		
		switch (calculo) {
		
		case "suma":
			System.out.println("La suma de esos valores es: "+hacerSuma(crear()));
			break;
			
		case "resta":
			System.out.println("La resta de esos valores es: "+hacerResta(crear()));
			break;
			
			break;
			
		case "multiplicacion":
			System.out.println("La multiplicación de esos valores es: "+hacerMultiplicacion(crear()));
			break;
			
			break;
			
		case "division":
			System.out.println("La división de esos valores es: "+hacerDivision(crear()));
			break;
		default:
			System.out.println("Cálculo no encontrado");
			break;
		}

	}
}
