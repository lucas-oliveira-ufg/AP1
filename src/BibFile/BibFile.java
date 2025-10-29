package BibFile;

import java.io.File;

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

}
