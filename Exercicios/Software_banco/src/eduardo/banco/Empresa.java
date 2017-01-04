package eduardo.banco;

import eduardo.banco.funcionarios.*;

public class Empresa {
	
	int numFuncionarios;
	String nome, cnpj;
	
	Funcionario[] empregados;
	
	public Empresa(String nome, String cnpj) {
		empregados = new Funcionario[10];
		numFuncionarios = 0;
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public void adiciona (Funcionario f){
		if (numFuncionarios < 10){
			empregados[numFuncionarios] = f;
			numFuncionarios++;
		}
	}
		
	public void imprime (){
		System.out.println ("Empresa "+ this.nome+" CNPJ "+this.cnpj);
		for (int count =0; count<numFuncionarios; count++){
			System.out.println ("Empregado de número "+(count + 1)+": "+empregados[count].getSalario());
		}
	}
	
	boolean contem (Funcionario f){
		for (Funcionario funcionario: empregados){
			if (funcionario.num == f.num){
				return true;
			}
		}
		return false;
	}
}


