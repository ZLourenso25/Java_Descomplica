import java.util.Scanner;

public class Principal04 {

	public static void main(String[] args) {

		int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = teclado.nextInt();
		
		System.out.println("A divisão do numero por 2 o seu Quociente inteiro é: ");
		System.out.println(valor/2);
		System.out.println("O resto da divisão por 2 é ");
		System.out.println(valor%2);
					
	}

}
