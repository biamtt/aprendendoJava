package PrimeiroDiaSintaxeVariaveisFluxo;

public class TesteBooleano {
	public static void main(String[] args) {
		int paisesConhecidos = 2;
		boolean maisDeUmContinente = true;
		
		if (paisesConhecidos == 1 && maisDeUmContinente == false) {
			System.out.println("Vamos organizar o caixinha pra viagens!");
		} else {
			if (paisesConhecidos >= 2 && maisDeUmContinente) {
				System.out.println("Tá indo bem");
			}
		} 
	}
}