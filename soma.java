package ti2;
import java.util.*;

class soma {
	public static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		//Declaracao de variaveis
		int num1, num2, soma;
		
		//Leituras
		System.out.println("Digite um numero");
		num1= sc.nextInt();
		System.out.println("Digite outro numero");
		num2= sc.nextInt();
		
		//Somar
		soma= num1 + num2;
		
		//mostrar na tela 
		System.out.println("Soma:"+soma);
	}

}
