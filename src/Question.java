public class Question {

    private String texto;
    private String categoria;
    private Answer[] respuestas;

    public Question(String texto, String categoria, Answer[] respuestas) {
        this.texto = texto;
        this.categoria = categoria;
        this.respuestas = respuestas;
    }

    public String getTexto() {
        return texto;
    }

    public String getCategoria() {
        return categoria;
    }

    public Answer[] getRespuestas() {
        return respuestas;
    }

}