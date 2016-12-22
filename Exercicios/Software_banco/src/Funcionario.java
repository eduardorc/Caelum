public class Funcionario {
	String nome, rg, dpt, dataEntrada;
	double salario;

	public static void main (String[] args){
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		f1.nome = "Eduardo"; f1.dataEntrada = "01/12/2016"; f1.rg = "44581202"; f1.dpt = "TI";
		f1.salario = 1500.00;
		f1.mostra();
		f2.nome = "Laíssa"; f2.dataEntrada = "10/12/2016"; f2.rg = "44581205"; f2.dpt = "Direito";
		f2.salario = 1800.00;
		f2.mostra();

	}
		
	void recebeAumento (double valor){
		this.salario += valor;
	}
	
	double calculaGanhoAnual (){
		return this.salario*12;
	}
	
	void mostra (){
		System.out.println("O funcionário:\nNome: "+this.nome+"\nRG: "+this.rg+"\nDepartamento: "+this.dpt+"\nData de entrada: "+this.dataEntrada);
		System.out.println("\nSalário: R$"+this.salario);
	}
	
}
// Continuar a partir do capítulo 5