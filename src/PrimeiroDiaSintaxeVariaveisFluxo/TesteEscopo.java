package PrimeiroDiaSintaxeVariaveisFluxo;

public class TesteEscopo {
	public static void main (String[] args) {
		System.out.println("Praticando escopo de variáveis");
		int idade = 20;
		int quantidadeDePessoas = 2;
		boolean acompanhado;
		
		if (quantidadeDePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
					
		System.out.println("Está acompanhado = " + acompanhado); {
			
			if (idade >= 18 && acompanhado) {
				System.out.println("Seja bem-vindo!");
			} else {
				System.out.println("Lamentamos, mas você ainda não pode entrar!");
			}
		}
	}

}

//variável vive enquanto estiver dentro do bloco que foi declarada