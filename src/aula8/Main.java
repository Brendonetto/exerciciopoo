package aula8;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Bruno Kurzawe";

        Disciplina matematica = new Disciplina();
        matematica.adicionaNota(9);
        matematica.adicionaNota(7);

        Disciplina portugues = new Disciplina();
        portugues.adicionaNota(8);
        portugues.adicionaNota(8);

        aluno.disciplinas.add(matematica);
        aluno.disciplinas.add(portugues);

        Integer notaGeral = aluno.calcularMediaGeral();
        System.out.println("O aluno "+aluno.nome+ " tem média geral "+ notaGeral);


        Aluno bruno = new Aluno();
        bruno.nome= "Bruno";

        Frequencia aula01 = new Frequencia();
        aula01.dataAula  = LocalDate.of(2023,9,12);
        aula01.presenca= true;
        bruno.frequencias.add(aula01);
        System.out.println(bruno.frequencias);


        Filiacao filiacao = new Filiacao();
        filiacao.nomeMae= "Maria";
        filiacao.nomePai= "joao";
        bruno.filiacao = filiacao;

        Bolsa bolsa = new Bolsa();
        bolsa.DataInicial = LocalDate.of(2023,1,1);
        bolsa.DataFinal = LocalDate.of(2023,12,31);
        bolsa.descricao = "Prefeitura municipal de criciuma";
        bruno.bolsa = bolsa;


    }

}






