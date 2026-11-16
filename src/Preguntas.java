public class Preguntas {

    int preguntas;



    public Preguntas(int preguntas) {
        if (this.preguntas < 5) {
            System.out.println("Valor de preguntas no valido");
        }
    }
}
