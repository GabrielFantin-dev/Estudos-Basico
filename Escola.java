package escola;
import java.util.Scanner;

public class Escola {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bem Vindo!");
		System.out.println("Qual o nome do aluno");
		String aluno = teclado.nextLine();
		
		System.out.println("Qual a primeira nota?");
		double num1 = teclado.nextDouble();
		
		System.out.println("Qual a segunda nota?");
		double num2 = teclado.nextDouble();
		
		System.out.println("Qual a terceira nota?");
		double num3 = teclado.nextDouble();
		
		System.out.println("Qual o quarto numero?");
		double num4 = teclado.nextDouble();
		
		double media = (num1 + num2 + num3 + num4) / 4;
		System.out.println("A media do " + aluno +  media);
		
		if (media >= 50) {
			System.out.println("Aluno aprovado");
		}else {
			System.out.println("Aluno reprovado");
		}
		
	}
}