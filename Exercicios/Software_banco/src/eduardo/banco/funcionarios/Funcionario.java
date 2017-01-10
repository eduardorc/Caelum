package eduardo.banco.funcionarios;


public class Funcionario {
	private double salario;
	public int num;
		
	public double setSalario(double salario){
		return this.salario = salario;
	}
	
	public double getSalario(){
		return this.salario;
	}
		
	
	public void mostra (){
		System.out.println("Empregado número "+num+": "+ getSalario());
	}
	
	
}


