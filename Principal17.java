//Utilizaqndo e aprendendo sobre o String
import java.util.Scanner;

public class Principal17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome = "Jose Lourenço"; //String uma cadeia de caracteres 
		String nome1 = "Professor";
				
				System.out.println("Aluno " + nome);
				System.out.println("Digite o nome do professor: ");
				nome1 = teclado.next();
				
				System.out.println("Prazer professor " + nome1);
								
	}

}
