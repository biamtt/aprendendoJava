//Calcular o fatoria de 1 a 10
//Calculo de fatorial: fatorial de 4 = (1*2 = 2)(2*3 = 6)(6*4 = 24) = 24
//Ou seja, 'f = fator', 'n = numero sequencial' e 'r = resultado'
//Fatorial de 6 = (n * n = r) (r * n = r) (r * n = r ) ( r * n =  r ) ( r  * n =  f )
//				  (1 * 2 = 2) (2 * 3 = 6) (6 * 4 = 24) (24 * 5 = 120) (120 * 6 = 720)

package PrimeiroDiaSintaxeVariaveisFluxo;

public class ExercicioFatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		for(int i = 1; i < 11; i++) {
			fatorial *= i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}
}