import mensagem.Mensagem;
import mensagem.MensagemArquivo;
import mensagem.MensagemTexto;
import usuario.Usuario;




public class App {
    public static void main(String[] args) throws Exception {
        Usuario u1 = new Usuario("Barreta", "barreta@barreta.barreta.com", "29/02/2004");
        Usuario u2 = new Usuario("Érgio", "ergio@ergio.ergio.com", "28/02/2004");
        
        Mensagem mensagem = new MensagemTexto("Mensagem de texto", u1, u2, "29/02/2004", "Vai curintia");
        MensagemTexto mensagem2 = new MensagemTexto("Mensagem de texto", u1, u2, "29/02/2004", "Palmeiras não tem mundial");
        MensagemArquivo mensagem3 = new MensagemArquivo("Mensagem de arquivo", u1, u2, "29/02/2004", "C:\\Users\\barreta\\Desktop\\teste.txt", "Conteudo do arquivo");
        
        System.out.println(mensagem.getConteudo());
        System.out.println(mensagem.getRemetente().getNome());
        System.out.println(mensagem.getDestinatario().getNome());
        System.out.println(mensagem.getData());
        System.out.println(((MensagemTexto) mensagem).getMensagem());
        System.out.println(mensagem2.getMensagem());
        System.out.println(mensagem3.getEnderecoArquivo());
        System.out.println(mensagem3.getConteudoArquivo());


    }
}
