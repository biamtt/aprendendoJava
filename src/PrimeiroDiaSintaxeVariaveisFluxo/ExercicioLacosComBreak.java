//Após assistir as aulas de aninhamento de laços de repetição e sobre o comando break, Fernando decidiu criar um código como forma de treinamento que imprime na tela o seguinte:
//1
//12
//123
//1234
//12345
//
//Para isso, ele criou o seguinte código:
//
//public class ProgramaComBreak {
//    public static void main(String args[]) {
//        for(int linha = 0; linha < 5; linha++) {
//            for (int coluna = 0; coluna < 5; coluna++) {
//                if ( ??? ) {
//                    break;
//                }
//                System.out.print( ??? );
//            }
//            System.out.println();
//        }
//    }
//}
//
//No entanto, ele está em dúvida sobre como deve preencher os espaços com ???. Resolva o código para que imprima o resultado esperado.


package PrimeiroDiaSintaxeVariaveisFluxo;

public class ExercicioLacosComBreak {

	public static void main(String[] args) {
		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				if(coluna > linha) {
					break;
				}
				System.out.print(coluna + 1);
			}
			System.out.println();
		}
	}
}