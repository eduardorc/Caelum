package eduardo.banco.funcionarios;


public class Funcionario {
	//public String nome, rg, dpt, dataEntrada;
	public double salario;
	public int num;
		
	public double getSalario(){
		return this.salario;
	}
	
	public void mostra (){
		System.out.println("Empregado número "+num+": "+ getSalario());
	}
	
	
}


