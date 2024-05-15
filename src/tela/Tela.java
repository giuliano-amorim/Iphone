package tela;

import java.util.Scanner;

import usuario.Usuario;

public class Tela {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        System.out.println("Opções:");
        System.out.println("1. Abrir Ipod");
        System.out.println("2. Abrir telefone");
        System.out.println("3. Abrir navegador");
        Scanner terminal = new Scanner(System.in);
        int option = terminal.nextInt();
        switch (option) {
            case 1:
                usuario.selecionarMusica();
                usuario.tocar();
                usuario.pausar();
                break;
            case 2:
                usuario.atender();
                usuario.ligar();
                usuario.iniciarCorreioVoz();
                break;
            case 3:
                usuario.exibirPagina();
                usuario.atualizarPagina();
                usuario.adicionarNovaAba();
                break;
                
            default:
                System.out.println("Protetor de Tela");
        }terminal.close();
    }
}
