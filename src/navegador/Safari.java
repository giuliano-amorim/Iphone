package navegador;

public class Safari implements Browser{
    public void exibirPagina(){
        System.out.println("Aperte o icone do Safari. PAGINA EXIBIDA!");
    }

    public void atualizarPagina(){
        System.out.println("Aperte o icone de atualizar página. PAGINA ATUALIZADA!");
    }

    public void adicionarNovaAba(){
        System.out.println("Aperte o icone + no navegador. ABA ADICIONADA");
    }
}
