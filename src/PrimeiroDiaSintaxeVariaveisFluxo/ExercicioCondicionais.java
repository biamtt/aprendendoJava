//O João gostaria de criar um programa sobre Imposto de Renda (IR) e verificou as regras de alíquota. Ele descobriu no site da receita:
//De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
//De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
//De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
//Agora ajude o João na implementação todas as regras usando condicionais e um salario de 3300

package PrimeiroDiaSintaxeVariaveisFluxo;

public class ExercicioCondicionais {
	public static void main(String[] args) {
		double salario = 2800.0;
		
		if (salario <= 1899.9) {
			System.out.println("Seu salário é de R$ " + salario + ", você está isento do IR.");
		} else {
			if (salario <= 2800.0) {
				System.out.println("Seu salário é de R$ " + salario + ", então sua alíquota de IR é de 7.5% e sua dedução de R$ 142,00.");
			} else {
				if (salario <= 3751.0) {
					System.out.println("Seu salário é de R$ " + salario + ", então sua alíquota de IR é de 15% e sua dedução de R$ 350,00.");
				} else {
					if (salario <= 4664.0) {
						System.out.println("Seu salário é de R$ " + salario + ", então sua alíquota de IR é de 22.5% e sua dedução de R$ 636,00.");
					}			  
				}
			}
		}
	}
}