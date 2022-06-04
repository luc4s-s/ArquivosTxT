package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxT {

	public static void main(String[] args) throws FileNotFoundException {
		
		//iniciando um arquivo e apontando o arquivo fisico e a entrada de dados
		FileInputStream entradaArquivo = 
				new FileInputStream(new File("C:\\Users\\PC\\git\\ArquivosTxT\\ArquivosTxT\\src\\arquivos\\arquivo.txt"));
	
		//scanner para ler os arquivos
		Scanner lerArquivo = new  Scanner(entradaArquivo, "UTF-8");
		
		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {//se estiver alguma linha em branco nao vai ler
			System.out.println(linha);
			}
			
		}
	
	}
}
