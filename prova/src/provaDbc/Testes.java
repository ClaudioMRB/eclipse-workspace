package provaDbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Testes {

	public static void main(String[] args) {

		//criando variavel String
		String path = "C:\\Users\\claud\\OneDrive\\Área de Trabalho\\voltar pendriver\\in.txt";
		//criar variavel filereader
		FileReader fr = null;
		//criar bufferedreader
		BufferedReader br = null;
		
		//criar bloco try para tentar abrir o arquivo
		try {
			//estabelecendo uma string, nume sequencia de leitura a partir do arquivo que esta no caminho path
			fr = new FileReader(path);
			//o bufferedreader é instanciado a partir do filereader, é uma abstração
			br = new BufferedReader(fr);
			//criar variavel string line
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			try {
				if(br != null) {
				br.close();
			}
			if(fr != null) {
				fr.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	}
}


