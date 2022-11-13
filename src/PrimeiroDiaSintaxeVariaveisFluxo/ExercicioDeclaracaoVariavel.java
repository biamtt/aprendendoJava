package PrimeiroDiaSintaxeVariaveisFluxo;

//Código original do exercicio

//public class ExercicioDeclaracaoVariavel {
//	public static void main(String[] args) {
		
//		boolean foiPromovido = true;
//		
//		if (foiPromovido) {
//			double salario = 4200.0;
//		} else {
//			double salario = 3800.0;
//		}
		
//		System.out.println(salario);
//	}

//}

//Código solução do exercicio
//a variavel salário estava declarada duas vezes e apenas dentro do bloco if/else. Corrigi declarando ela antes de iniciar a condição.

public class ExercicioDeclaracaoVariavel {
	public static void main(String[] args) {
		
		boolean foiPromovido = false;
		
		double salario;
		
		if (foiPromovido) {
			salario = 4200.0;
		} else {
			salario = 3800.0;
		}
		
		System.out.println(salario);
	}

}
