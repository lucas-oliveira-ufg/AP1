package main;

import java.util.Scanner;
import BibFile.BibFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BibFile fileHandling = new BibFile();
		Integer choice = null;
        Scanner scan = new Scanner(System.in);

        do {
    		Menu();
        	choice = scan.nextInt();
			switch (choice) {
            
            case 1:
            	System.out.print("Digite o caminho da pasta\nExemplo: /home/lucasrod/Downloads\n");
            	String path = scan.nextLine();
            	String caminho = scan.nextLine();
            	fileHandling.lsCommand(caminho);
            	break;
            	
            case 2:
            	System.out.println("Digite o caminho e nome do novo diretório\nExemplo: /home/lucasrod/<nome_novo_diretorio>");
            	path = scan.nextLine();
            	caminho = scan.nextLine();
            	fileHandling.mkdirCommand(caminho);
            	break;
            	
            case 3:
            	System.out.println("Digite o caminho e o nome do arquivo a ser movido\nExemplo: /home/lucasrod/<arquivo_a_ser_movido.txt>");
            	path = scan.nextLine();
            	String toMove = scan.nextLine();
            	System.out.println("");
            	System.out.println("Digite o caminho de destino e o nome do arquivo\nExemplo: /home/lucasrod/Documentos/<arquivo_a_ser_movido.txt>");
            	String target = scan.nextLine();
            	fileHandling.mvCommand(toMove, target);            	
            	break;
            
            case 4:
            	System.out.println("Digite o caminho e o nome do arquivo a ser copiado\nExemplo: /home/lucasrod/<arquivo_a_ser_copiado.txt>");
            	path = scan.nextLine();
            	toMove = scan.nextLine();
            	System.out.println("");
            	System.out.println("Digite o caminho de destino e o nome do novo arquivo\nExemplo: /home/lucasrod/Documentos/<nova_copia.txt>");
            	target = scan.nextLine();
            	fileHandling.cpCommand(toMove, target);
            	break;
            	
            case 5:
            	System.out.println("Digite o caminho e o nome do arquivo a ser deletado\nExemplo: /home/lucasrod/<arquivo_a_ser_deletado.txt>");
            	path = scan.nextLine();
            	String toDelete = scan.nextLine();
            	fileHandling.rmCommand(toDelete);
            	break;
            	
            case 6:
            	System.out.println("Digite o caminho e o nome do arquivo a ser criado\nExemplo: /home/lucasrod/Documentos/arquivo.txt");
            	path = scan.nextLine();
            	String toCreate = scan.nextLine();
            	fileHandling.touchCommand(toCreate);
            	break;
            	
            case 7:
            	String diretorioAtual = System.getProperty("user.dir");
            	System.out.println("Diretório atual: " + diretorioAtual);
            	break;
            	
            case 8:
            	System.out.println("Digite o caminho e o nome do arquivo a ser apresentado\nExemplo: /home/lucasrod/Documentos/arquivo.txt");
            	path = scan.nextLine();
            	String toShow = scan.nextLine();
            	fileHandling.lessCommand(toShow);
            	break;
            } 
                        	
            
        } while (!choice.equals(0));
		
		System.out.print("\nObrigado pela preferência :)");
		
		scan.close();		

	}
	
	public static void Menu() {
		System.out.print(  "*************************************************************************\n");
		System.out.println("**** 1  - ls - Listar Conteúdo de um Diretório                       ****");
		System.out.println("**** 2  - mkdir - Cria Novos Diretórios                              ****");
		System.out.println("**** 3  - mv - Move arquivos ou diretórios                           ****");
		System.out.println("**** 4  - cp - Copia Arquivos ou Diretórios                          ****");
		System.out.println("**** 5  - rm - Remove arquivos                                       ****");
		System.out.println("**** 6  - touch - Cria arquivos vazios                               ****");
		System.out.println("**** 7  - pwd - Exibe o nome do diretório atual                      ****");
		System.out.println("**** 8  - less - Apresenta o conteúdo de um arquivo de texto ou log  ****");
		System.out.println("**** 0  - Sair                                                       ****");
		System.out.print(  "*************************************************************************");
    	System.out.print("\nDigite uma opção: ");
	}

}
