package mensagem;
import usuario.Usuario;
import mensagem.*;


public class MensagemTexto extends Mensagem{
    private String mensagem;


    public MensagemTexto(String conteudo, Usuario remetente, Usuario destinatario, String data, String mensagem) {
        super(conteudo, data, remetente, destinatario);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


}
