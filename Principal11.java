//Usando o switch
public class Principal11 {

	public static void main(String[] args) {

		int numero = 4;
		
		switch(numero) {
		
		case 1:
			System.out.println("Você digitou 1");
			
			break; //ele para a continuidade de execução do comando
			
		case 2:
			System.out.println("Você digitou 2");
			break;
			
		case 3:
			System.out.println("Você digitou 3");
			break;
			
		default: //casos diferentes pode colocar este
			System.out.println("Você digitou um numero invalido");
			
		}
	}

}
