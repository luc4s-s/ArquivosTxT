package arquivos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		//Lista de pessoas
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Lucas gomes");
		pessoa1.setEmail("lucas@gmail.com");
		pessoa1.setIdade(22);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("maria");
		pessoa2.setEmail("maria@gmail.com");
		pessoa2.setIdade(30);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("jao");
		pessoa3.setEmail("jao@gmail.com");
		pessoa3.setIdade(80);
		
		//Essa lista pode vim de um banco de dados ou qualquer outra fonte de dados 
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		File arquivo = new File("C:\\Users\\PC\\Downloads\\ESTUDOS\\WORKSPACE\\ArquivosTxT\\src\\arquivos\\arquivo.txt");
		
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		/** estanciando o objeto que escreve no arquivo **/
		FileWriter escreve_no_arquivo = new FileWriter(arquivo);
		
//		escreve_no_arquivo.write("meu texto no arquivo");
//		escreve_no_arquivo.write("eu sou muito bom em java");
		
		//escrevendo 10 linha 
//		for (int i = 1; i <=10; i++) {
//			escreve_no_arquivo.write("texto da minha linha "+i+ "\n");
//		}
		
		/** varendo a lista e escrevendo os nomes */
		for (Pessoa p : pessoas) {
			escreve_no_arquivo.write(p.getNome() + "; " + p.getEmail() + "; " + p.getIdade() + "\n");
		}
		
		escreve_no_arquivo.flush();
		escreve_no_arquivo.close();
	}

}
