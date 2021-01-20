package suma;

public class Suma {

	static int hacerSuma(int[]x) {
		int resultado = 0;
		for(int c=0;c<x.length;c++) {
			resultado=resultado+x[c];
		}
		return resultado;
	}
}
