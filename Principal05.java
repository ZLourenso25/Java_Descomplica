//Aula sobre incremento e decremento ou ++ e --

public class Principal05 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = 6;
		num2 = 6;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		num1++;
		++num2;
		
		System.out.println(num1++); //Quando temos o ++ depois em uma expressão ele so ocorre na proxima linha de instrução.
		System.out.println(++num2); //Quando temos o ++ antes ele é executado antes do comando fazendo assim o incrementeo antes.
		System.out.println();

		System.out.println(num1--); //Quando utilizamos o -- e igual ao ++
		System.out.println(--num2); //Mesma regra do ++
		System.out.println();
		
	}

}
