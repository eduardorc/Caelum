import java.util.Scanner;

public class Funcionario {

	String nome, rg, departamento, dataentrada;
	Double salario;

	Scanner ler = new Scanner(System.in);
	public void criafuncionario(){
		System.out.println("\nDigite o Nome, RG, departamento que irá trabalhar, data de entra (dd/mm/aa) e o salário do funcionário:");
		this.nome = ler.next(); 
		this.rg = ler.next(); 
		this.departamento = ler.next(); 
		this.dataentrada = ler.next(); 
		this.salario = ler.nextDouble();
		System.out.println("\nO Funcionário cadastro chama-se "+this.nome+", seu RG é "+this.rg+", trabalhará no departamento "
		+this.departamento+" sendo sua data de entrada "+this.dataentrada+" e o salário a receber será de R$"+this.salario);
	}
	
	public void recebeaumento (double aumento){
		this.salario += aumento;
		System.out.println("Salário passa a ser de R$"+this.salario);
	}
	
	public double calculaganhoanual (){
		return this.salario*12;
	}
	
}


