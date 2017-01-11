import java.util.Scanner;

public class Conta {
	
	Scanner leia = new Scanner (System.in);
	int escolha, saques = 0, numConta;
	double dinheiro;
	String nome;
	
	public void carregaMenu(String nome, double dinheiro, int conta){
		System.out.println ("\ninicializando caixa eletr�nico...\n");
		this.dinheiro = dinheiro; this.nome = nome; this.numConta = conta;
		do{
            exibeMenu();
            escolha = leia.nextInt();
            escolheOpcao(escolha);
        }while(escolha!=4);

	}
	
	public void exibeMenu(){
		System.out.println ("\t--- MENU ---");
		System.out.println("\n1 - EXTRATO\n2 - SACAR\n3 - DEPOSITAR\n4 - FINALIZAR OPERA��O");
		System.out.println("\nEntre com a op��o desejada: ");
	}
	
	public void escolheOpcao(int escolha){
		switch (escolha){
			case 1:
				extrato();
				break;
			case 2:
				System.out.println("\nDigite o valor a ser sacado:");
				double saca = leia.nextDouble();
				sacar (saca);				
				break;
			case 3:
				System.out.println("\nDigite o valor a ser depositado:");
				double deposita = leia.nextDouble();
				deposita (deposita);
				break;
			case 4: 
				System.out.println("Muito obrigado por usar o nosso Caixa");
				break;
			default :
				System.out.println("\n---- OP��O INCORRETA ----\n");
			
		}
	}

	public void extrato(){
		System.out.println("\nUsu�rio: "+this.nome+"\nN�mero da conta: "+this.numConta+"\nSaldo atual: R$"+this.dinheiro);
		System.out.println("Saques realizados at� agora: "+this.saques);
		
	}
	
	public void sacar(double valor){
		if (valor > this.dinheiro || valor < 0){
			System.out.println("\nSaldo insuficiente ou valor inadequado\n");
		}
		else{
			dinheiro -= valor;
			System.out.println("\nValor atual R$"+dinheiro);
		}
		saques++;
	}
	
	public void deposita(double valor){
		if (valor < 0){
			System.out.println("\nN�o � poss�vel depositar valores negativos.\n");
		}
		else{
			dinheiro += valor;
			System.out.println("\nValor atual R$"+dinheiro);
		}
	}
}
