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
            	System.out.print("Digite o caminho da pasta\nExemplo: /home/lucasrod/Documentos/viagem\n");
            	String path = scan.nextLine();
            	String caminho = scan.nextLine();
            	fileHandling.lsCommand(caminho);
            	break;
            	
            case 2:
            	System.out.println("\nVocê escolheu Mostrar Materiais\n");
            	break;
            	
            case 3:
            	System.out.println("\nVocê escolheu Cadastrar Cliente\n");            	
            	break;
            
            case 4:
            	System.out.println("\nVocê escolheu Cadastrar Cliente VIP\n");
            	break;
            	
            case 5:
            	System.out.println("\nVocê escolheu Efetuar Venda\n");
            	break;
            	
            case 6:
            	System.out.println("");
            	break;
            	
            case 7:
            	System.out.println("");
            	break;
            	
            case 8:
            	System.out.println("");
            	break;
            } 
                        	
            
        } while (!choice.equals(0));
		
		System.out.print("\nObrigado pela preferência :)");
		
		scan.close();		

	}
	
	public static void Menu() {
		System.out.print(  "**************************************************************\n");
		System.out.println("**** 1  - ls - Listar Conteúdo de um Diretório              ****");
		System.out.println("**** 2  - cd - Muda o Diretório de Trabalho                 ****");
		System.out.println("**** 3  - mkdir - Cria Novos Diretórios                     ****");
		System.out.println("**** 4  - cp - Copia Arquivos ou Diretórios                 ****");
		System.out.println("**** 5  - mv - Move ou renomeia arquivos ou diretórios      ****");
		System.out.println("**** 6  - rm - Remove arquivos                              ****");
		System.out.println("**** 7  - touch - Cria arquivos vazios                      ****");
		System.out.println("**** 8  - pwd - Exibe o nome do diretório atual             ****");
		System.out.println("**** 0  - Sair                                              ****");
		System.out.print(  "****************************************************************");
    	System.out.print("\nDigite uma opção: ");
	}

}
