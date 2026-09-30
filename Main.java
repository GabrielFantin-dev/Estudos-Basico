import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean rodando = true;
		
		while(rodando) {
		System.out.println("Bem vindo a nossa Escola!");
		System.out.println("Poderia nos dizer o nome do aluno?");
		String aluno = teclado.nextLine();
		System.out.println("Qual a primeira nota dele?");
		double nota1 = teclado.nextDouble();
		System.out.println("Qual a segunda nota dele?");
		double nota2 = teclado.nextDouble();
		System.out.println("Qual a terceira nota dele?");
		double nota3 = teclado.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println(media);
		
		if(media >= 70) {
			System.out.println(aluno + " Aprovado Com uma boa media " + media);
		}
		else if (media >= 50) {
			System.out.println(aluno + " Aprovado Com a media " + media);
				}else if (media <= 49) {
			System.out.println(aluno + " reprovado Com a media " + media);
			}
		rodando = false;
		}
	}
}