import java.util.Scanner;
import java.util.Random;

public class Caixa {
	
	public static void main (String[] args){
		String nome;
		double valorInicial;
		
		Scanner leia = new Scanner(System.in);
		
		//Gerando um valor alet�rio de 4 d�gitos para a conta
		Random numero = new Random();
		int numConta = numero.nextInt(9999) + 1;
		
		//Obter os dados do cliente
		System.out.println ("--- Iniciando o Registro de um novo Cliente ---");
		System.out.println ("Digite o nome do cliente: ");
		nome = leia.nextLine();
		System.out.println("\nQual o valor inicial da conta em reais? R$");
		valorInicial = leia.nextDouble();
		
		System.out.println ("\nConta Criada em nome de "+nome+" com o valor inicial de R$"+valorInicial+" sendo o n�mero da conta "+numConta);

		//Iniciando as opera��es poss�veis
		Conta minhaConta = new Conta();
		minhaConta.carregaMenu(nome, valorInicial, numConta);
		leia.close();  //Fecha o m�todo de leitura, pois sem isso estava dando erro.
	}

}
