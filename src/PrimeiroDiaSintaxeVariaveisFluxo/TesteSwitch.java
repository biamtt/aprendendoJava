package PrimeiroDiaSintaxeVariaveisFluxo;

public class TesteSwitch {
	public static void main(String[] args) {
		System.out.println("Aprendendo a usar switch, break e default.");
		
		String ordemMes = "Dezembro";
		
		switch (ordemMes) {
		case "Janeiro":
			System.out.println(ordemMes + " é o primeiro mês do ano.");
			break;
		case "Fevereiro":
			System.out.println(ordemMes + " é o segundo mês do ano.");
			break;
		case "Março":
			System.out.println(ordemMes + " é o terceiro mês do ano.");
			break;
		case "Abril":
			System.out.println(ordemMes + " é o quarto mês do ano.");
			break;
		case "Maio":
			System.out.println(ordemMes + " é o quinto mês do ano.");
			break;
		case "Junho":
			System.out.println(ordemMes + " é o sexto mês do ano.");
			break;
		case "Julho":
			System.out.println(ordemMes + " é o sétimo mês do ano.");
			break;
		case "Agosto":
			System.out.println(ordemMes + " é o oitavo mês do ano.");
			break;
		case "Setembro":
			System.out.println(ordemMes + " é o nono mês do ano.");
			break;
		case "Outubro":
			System.out.println(ordemMes + " é o décimo mês do ano.");
			break;
		case "Novembro":
			System.out.println(ordemMes + " é o décimo primeiro mês do ano");
			break;
		case "Dezembro":
			System.out.println(ordemMes + " é o décimo segundo mês do ano.");
			break;
		default:
			System.out.println("Mês inválido");
			break;
		}
	}

}
