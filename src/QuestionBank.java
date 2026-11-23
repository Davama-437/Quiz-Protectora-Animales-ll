public class QuestionBank {

    private static Question[] preguntas;

    public static void cargarPreguntas(){
       preguntas = new Question[100];
       Answer respuestaA = new Answer('A',"Central Processing Unit",true);
       Answer respuestaB = new Answer('B',"Computer Personal Unit",false);
       Answer respuestaC = new Answer('C',"Central Program Unit",false);
    }

    Answer[] respuestas = {respuestaA, respuestaB,respuestaC};

}
