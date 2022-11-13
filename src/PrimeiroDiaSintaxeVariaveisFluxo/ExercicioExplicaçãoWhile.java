//Clarice, amiga de Fernando, percebeu que ele está com dificuldade na implementação de um loop feito com while. 
//Seu objetivo é imprimir no console os números de 1 a 10. No entanto, o código não compilava. Vejamos seu código:

//package projeto;
//public class Programa {
//    public static void main(String[] args) {
//        while (contador <= 10) {
//            int contador = 1;            
//            System.out.println(contador);
//            contador++;
//        }
//    }
//}

//Se você estivesse com Clarice agora, como explicaria o problema do código para ele?

//O código não compila foi declarada a variavel contador com seu valor apenas após o while.
//Se removermos desses bloco e colocar antes do while, ou seja, dentro do bloco de main, o código vai funcionar conforme o esperado.

package PrimeiroDiaSintaxeVariaveisFluxo;

public class ExercicioExplicaçãoWhile {
	public static void main(String[] args) {
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
	}
}