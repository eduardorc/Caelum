package eduardo.banco;

import eduardo.banco.funcionarios.*;

public class Software_banco {
	
	public static void main (String[] args){
		Empresa Eduardo = new Empresa("Eduardo","12345");
		
		for (int i=0; i<10; i++){
			Funcionario f = new Funcionario();
			f.setSalario(1000 + i *100);
			f.num = i+1;
			Eduardo.adiciona(f);
		}
		System.out.println("Método imprime");
		Eduardo.imprime();
		
		System.out.println("\nUsando o método imprime de cada funcionário:");
		for (int i=0; i<Eduardo.empregados.length ; i++){
			Eduardo.empregados[i].mostra();
		}
		
		Funcionario f7 = new Funcionario();
        Funcionario f11 = new Funcionario();
        f7.num = 7;
        f11.num = 11;
        System.out.println("\nContém o funcionario 7? : " + Eduardo.contem(f7));
        System.out.println("Contém o funcionario 11? : " + Eduardo.contem(f11));
        
        //Criando um array de 11 elementos
        Funcionario[] empregados2 = new Funcionario[11];
        
        //Copiando os elementos dos array anterior para o novo array
        for(int i=0 ; i < Eduardo.empregados.length ; i++){
            empregados2[i] = Eduardo.empregados[i];
        }
        
        //Adicionando o empregado 11
        empregados2[10] = f11;

        //checando de novo
        System.out.println("\nContém o funcionario 11? : " + Eduardo.contem(f11));
        
        //Mostrando os empregados
        System.out.println("\nUsando o método 'mostra', de cada funcionário:");
        for(int i=0 ; i < empregados2.length ; i++){
            empregados2[i].mostra();
        }
			
		
		
		
		//CONTINUAR A PARTIR DO 3 PÁGINA 72 PDF
	
		
		
		

	}

}
