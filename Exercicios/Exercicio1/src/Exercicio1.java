import java.util.Scanner;

public class Exercicio1 {
	
	static Scanner ler = new Scanner(System.in);
	public static void main (String[] args){
		System.out.println("-- Sistema Reservado para o cadastro e atualiza��o de funcion�rios --");
		System.out.printf("\nDeseja realizar o cadastro de um novo funcion�rio [sim/n�o]: ");
		String decisao = ler.next();
		if (decisao.equals("sim")){
			Funcionario F1 = new Funcionario();
			F1.criafuncionario();
		}
	}
}

