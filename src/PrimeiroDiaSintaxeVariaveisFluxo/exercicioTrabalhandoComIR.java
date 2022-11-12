package PrimeiroDiaSintaxeVariaveisFluxo;

public class exercicioTrabalhandoComIR {

	public static void main(String[] args) {
		double salario = 3600.0;
		if (salario < 2600.0) {
			System.out.println("A sua alíquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350,00");
		} else {
			if (salario < 3750.0) {
				System.out.println("A sua alíquota é de 22,5%");
				System.out.println("Você pode deduzir até R$ 636,00");
			}
		}
	}
}