package aula6;

public class Boletim {
    String aluno;

    public String verificaAlunoAprovado(String aluno, Integer mediaGeral, Double frequencia) {
        if(frequencia <70){
            return ("Aluno Reprovado");
        }
        if (mediaGeral >= 7) {
            return ("O aluno" +aluno+ "Aprovado!");
        } else if (mediaGeral >= 5 ) {
            return ("O aluno" +aluno+"Recuperação");
        } else {
            return ("O aluno" +aluno+"Reprovado!");
        }
    }
}
