package PrimeiroDiaSintaxeVariaveisFluxo;

public class TesteCondicional2 {
	public static void main(String[] args) {
		System.out.println("Vamos testar booleanos condicionais");
		int paisesVisitados = 3;
		int continentesVisitados = 1;
		
		if (paisesVisitados <= 2 && continentesVisitados == 1) {
			System.out.println("Viajar precisa estar no seu próximo objetivo!!");
		} else {
			if (paisesVisitados >= 3 && continentesVisitados == 1) {
				System.out.println("Agora precisa conhecer novos continentes!!");
			} else {
				if (paisesVisitados >= 3 && continentesVisitados > 2) {
					System.out.println("Já pensou quantas culturas novas você conheceu?");
				}
			}
		}	
	}
}