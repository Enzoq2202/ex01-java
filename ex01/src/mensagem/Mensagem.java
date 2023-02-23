package mensagem;
import usuario.Usuario;


public class Mensagem {
    private String conteudo;
    private String data;
    private Usuario remetente;
    private Usuario destinatario;

    public Mensagem(String conteudo, String data, Usuario remetente, Usuario destinatario) {
        this.conteudo = conteudo;
        this.data = data;
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public Usuario getRemetente() {
        return remetente;
    }
    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }
    public Usuario getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    
}
