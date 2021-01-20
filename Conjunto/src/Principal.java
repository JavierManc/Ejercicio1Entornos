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
		
		 System.out.println("dasdas");
		 String calculo=teclado.next();
		
		
		
		switch (calculo) {
		
		case "suma":
			
			break;
			
		case "resta":
			
			
			break;
			
		case "multiplicacion":
		
			
			break;
			
		case "division":
			
			
			break;
		}

	}
}
