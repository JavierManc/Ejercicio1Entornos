
public class Resta {

	
	
	public static int haceResta(int[] j) {
		
		
		int resultado=0;
		
		for (int i = 0; i < j.length; i++) {
			
			resultado=-(resultado-j[i]);
			
		}
		return resultado;
	}
	
	
	
	

}
