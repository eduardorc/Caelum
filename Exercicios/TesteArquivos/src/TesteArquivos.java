import java.io.*;
import java.util.Scanner;

public class TesteArquivos {

	public static void main (String[] args) throws IOException{
		Scanner leitura = new Scanner (System.in);
		System.out.println ("\tSOFTWARE PARA TESTAR ARQUIVOS");
		System.out.printf ("\n1 - char.txt\n2 - texto.txt\nDigite o número correspondente ao arquivo:");
		int decisao = leitura.nextInt();
		if (decisao == 1)
			leiaChar();
		else
			if (decisao == 2)
				leiaTexto();
			else
				System.out.println ("Escolha Inadequada");
		
		leitura.close();
	}
	
	
	static void leiaChar() throws IOException{
		FileInputStream entrada = new FileInputStream ("char.txt");
		InputStreamReader entradaFormatada = new InputStreamReader (entrada);
		int c = entradaFormatada.read();
		System.out.println((char)c);
		entrada.close();
	}
	
	
	static void leiaTexto() throws IOException{
		FileInputStream entrada = new FileInputStream ("texto.txt");
		InputStreamReader entradaFormatada = new InputStreamReader (entrada);
		BufferedReader entradaString = new BufferedReader (entradaFormatada);
		
		String linha = entradaString.readLine();
		
		while (linha != null){
			System.out.println (linha);
			linha = entradaString.readLine();
		}
		
		entrada.close();
		
	}
	
}
