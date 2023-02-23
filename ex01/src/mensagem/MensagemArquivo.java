package mensagem;
import usuario.Usuario;
import mensagem.*;

public class MensagemArquivo extends Mensagem {
    private String enderecoArquivo;
    private String conteudoArquivo;
    
    
    public MensagemArquivo(String conteudo, Usuario remetente, Usuario destinatario, String data, String enderecoArquivo,
            String conteudoArquivo) {
        super(conteudo, data, remetente, destinatario);
        this.enderecoArquivo = enderecoArquivo;
        this.conteudoArquivo = conteudoArquivo;
    }


    public String getEnderecoArquivo() {
        return enderecoArquivo;
    }
    public void setEnderecoArquivo(String enderecoArquivo) {
        this.enderecoArquivo = enderecoArquivo;
    }
    public String getConteudoArquivo() {
        return conteudoArquivo;
    }
    public void setConteudoArquivo(String conteudoArquivo) {
        this.conteudoArquivo = conteudoArquivo;
    }
    
    

}

