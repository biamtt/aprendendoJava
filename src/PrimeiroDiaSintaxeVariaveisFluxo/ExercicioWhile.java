//Fernando decidiu praticar seu conhecimento sobre a estrutura de repetição while. Ele escreveu o seguinte programa:
//package projeto;
//public class Programa {
//    public static void main(String[] args) {
//        int contador = 1;
//        while(contador <= 10) {
//            System.out.println(contador);
//        }
//    }
//}
//Todavia, seu programa só imprime no console 1 infinitamente.
//Consegue enxergar o problema no código de Fernando?



package PrimeiroDiaSintaxeVariaveisFluxo;

public class ExercicioWhile {
	public static void main(String[] args) {
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador += 1;
		}
	}

}

//estava definida que a variável contador era 1 e não tinha mais nenhum comando para ela somar algum valor ao default.
//Incluindo o comando 'contador += 1', então era pego o valor default 1 e a cada execução, somava 1. Poderia ter escrito também contador++ porém iria imprimir até 11.