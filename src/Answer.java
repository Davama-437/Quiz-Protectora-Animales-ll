public class Answer {

    private char letra;
    private String texto;
    private boolean respuesta;

    public Answer(char letra, String texto, boolean respuesta) {
        this.letra = letra;
        this.texto = texto;
        this.respuesta = respuesta;
    }

    public char getLetra() {
        return letra;
    }

    public String getTexto() {
        return texto;
    }

    public boolean getRespuesta() {
        return respuesta;
    }
}
