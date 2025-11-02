package BibFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BibFile {
	
	public void lsCommand(String path) {
		
		System.out.println("");
		
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		if(listOfFiles != null) {
		 
			for (int i = 0; i < listOfFiles.length; i++) {
				
				if (listOfFiles[i].isFile()) {
					System.out.println("Arquivo " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) {
					System.out.println("Diretório " + listOfFiles[i].getName());
				}
			}
		}
		
		System.out.println("");
		
	}
	
	public void mkdirCommand(String path) {
		
		File directory = new File(path);
		if (!directory.exists()){
		    directory.mkdirs();
		    System.out.println("Diretório criado com sucesso.");
		} else
			System.out.println("Diretório já existe. Crie outro diferente.");
		
	}
	
	public void mvCommand(String source, String target) {
		
        Path sourcePath = Paths.get(source);
        Path targetPath = Paths.get(target); 

        try {
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo movido com sucesso de " + sourcePath + " para " + targetPath);
        } catch (IOException e) {
            System.err.println("Houve um erro ao mover o arquivo: " + e.getMessage());
        }
		
	}
	
	public void cpCommand(String source, String target) {
		
        Path sourcePath = Paths.get(source); // Path to the source file
        Path targetPath = Paths.get(target); // Path to the target file

        try {
            // Create a dummy source file for demonstration
            //Files.writeString(sourcePath, "This is the content of the source file.");

            // Copy the file, replacing the target if it already exists
            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo copiado com sucesso de " + sourcePath + " para " + targetPath);

        } catch (IOException e) {
            System.err.println("Houve um erro ao copiar o arquivo: " + e.getMessage());
        }
		
	}
	
	public void rmCommand(String path) {
		
        Path filePath = Paths.get(path); 

        try {
            if (Files.deleteIfExists(filePath)) {
                System.out.println("Arquivo deletado com sucesso.");
            } else {
                System.out.println("Arquivo não existe ou não pode ser deletado.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao deletar arquivo: " + e.getMessage());
        }
		
	}
	
	public void touchCommand(String filePath) {
		
		File file = new File(filePath);
		
		try {
			if(file.createNewFile())
				System.out.println("Arquivo criado com sucesso!");
			else
				System.out.println("Arquivo já existe ou não pode ser criado!");
		} catch(IOException e) {
			System.out.println("Um erro ocorreu: " + e.getMessage());
		}
		
		
	}
	
	public void lessCommand(String filePath) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath));) {
			
			String linha;
			while((linha = br.readLine()) != null) {
				
				System.out.println(linha);
				
			}
			
			
		} catch(IOException e) {
			System.out.println("Um erro ocorreu: " + e.getMessage());
		}
		
	}

}
