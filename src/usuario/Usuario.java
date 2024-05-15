package usuario;

import navegador.Browser;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Usuario implements Browser, ReprodutorMusical, AparelhoTelefonico {
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba com usuario");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina com usuario");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina com usuario");
     }

    @Override
    public void ligar() {
        System.out.println("Ligando com usuario");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo com usuario");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz com usuario");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica com usuario");
     }

    @Override
    public void tocar() {
        System.out.println("Tocando musica com usuario");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica com usuario");
    }
}
