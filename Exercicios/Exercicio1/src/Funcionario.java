import java.util.Scanner;

public class Funcionario {

	String nome, rg, departamento, dataentrada;
	Double salario;

	Scanner ler = new Scanner(System.in);
	public void criafuncionario(){
		System.out.println("\nDigite o Nome, RG, departamento que ir� trabalhar, data de entra (dd/mm/aa) e o sal�rio do funcion�rio:");
		this.nome = ler.next(); 
		this.rg = ler.next(); 
		this.departamento = ler.next(); 
		this.dataentrada = ler.next(); 
		this.salario = ler.nextDouble();
		System.out.println("\nO Funcion�rio cadastro chama-se "+this.nome+", seu RG � "+this.rg+", trabalhar� no departamento "
		+this.departamento+" sendo sua data de entrada "+this.dataentrada+" e o sal�rio a receber ser� de R$"+this.salario);
	}
	
	public void recebeaumento (double aumento){
		this.salario += aumento;
		System.out.println("Sal�rio passa a ser de R$"+this.salario);
	}
	
	public double calculaganhoanual (){
		return this.salario*12;
	}
	
}


