
public class Vetores {

	public static void main (String[] args){
		//Declarando um vetor de 10 posições
		int vet [] = new int[10];
		//Declarar um vetor variável dependendo de uma variável n
		int n=10;
		int vet1 [] = new int[n];
		for (int i = 0; i<10; i++){
			vet[i] = i;
			vet1[i] = i+1;
		}
		//Pode-se criar um array de referência. Ex: Conta MinhasContas[] = new Conta[10];
		
		//Percorrendo um Array
		//Javas antigos:
		for (int i = 0; i<10; i++){
			System.out.printf ("\nVetor Vet[%d] = "+vet[i], i);
		}
		//Java 5.0 adiante
		for (int i : vet1){
			System.out.printf ("\nVetor Vet1[%d] = "+vet1[i],i);
		}
		
		
		
	}
}
