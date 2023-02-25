//Cadastrar 3 alunos e calcular sua media
import java.util.Scanner;

public class Principal18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		String matricula, nome, situação, turma;
		double teste, prova, media;
		
		System.out.println("Digite a turma: ");
		turma = teclado.next();
				
		for(int i=0; i<3;i++) {
			
			System.out.println("Digite a matricula: ");
			matricula = teclado.next();
			
			System.out.println("Digite o nome: ");
			nome = teclado.next();
			
			System.out.println("Digite o teste: ");
			teste = teclado.nextDouble();
			
			System.out.println("Digite a prova: ");
			prova = teclado.nextDouble();
			
			media = (teste + prova)/2;
				
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome : " + nome);
		System.out.println("Média: " + media);
					
		if(media >= 6) {
			
			System.out.println("aprovado");
		}
		else 
			if(media >= 5) {
			
			System.out.println("Recuperação");
		}
			else {
				System.out.println("Reprovado");
			}
		}
	}

}
