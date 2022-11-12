package PrimeiroDiaSintaxeVariaveisFluxo;

public class TesteCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 19;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos, pode beber uma cervejinha");
		} else {
			if (idade >= 16) {
				System.out.println("Mas com essa idade pode tomar um quentão");
			} else {
				System.out.println("Ops. parece que vai ficar no suquinho ein!!");
			}

		}

	}

}
