import java.time.LocalDateTime;

public class GameRecord {

    private String nombreUsuario;
    private LocalDateTime fechaHora;
    private int correctas;
    private int incorrectas;

    public GameRecord(String nombreUsuario, LocalDateTime fechaHora, int correctas, int incorrectas) {
        this.nombreUsuario = nombreUsuario;
        this.fechaHora = fechaHora;
        this.correctas = correctas;
        this.incorrectas = incorrectas;
    }
    public String getNombre() {
        return nombreUsuario;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    public int getCorrectas() {
        return correctas;
    }
    public int getIncorrectas() {
        return incorrectas;
    }
}
