package aula6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alunomain {
    public static void main(String[] args) {
        Map<String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();
        List<Boolean> frequenciasAlunos01 = new ArrayList<>();

        Aluno aluno01 = new Aluno();
        aluno01.codigo=1234;
        aluno01.nome= "Dr.Webber ";
        aluno01.dataNascimento = LocalDate.of(2000,12,28);
        aluno01.endereco = "Rua tal de tal ";
        aluno01.telefone = "48 991424677 ";
        aluno01.matricula = "f39403 ";


        frequenciasAlunos01.add(true);
        frequenciasAlunos01.add(true);
        frequenciasAlunos01.add(true);
        frequenciasAlunos01.add(false);
        frequenciasAlunos01.add(false);
        frequenciasAlunos01.add(true);
        frequenciasAlunos01.add(true);

        aluno01.frequencia = frequenciasAlunos01;




        notasMatematica.add(10);
        notasMatematica.add(9);
        notasPortugues.add(7);
        notasPortugues.add(6);
        disciplinas.put("Matematica", notasMatematica);
        disciplinas.put("Portugues",notasPortugues);
        aluno01.disciplinasNotas = disciplinas;
        aluno01.imprimirDadosAlunos();
        aluno01.calcularMediaPorMateria();
        aluno01.calcularMediaGeral();
        System.out.println("Aluno "+ aluno01.nome + "possui a média " + aluno01.calcularMediaGeral());


        Integer mediaGeralAluno= aluno01.calcularMediaGeral();

        Boletim boletim = new  Boletim();
            String  mensagemAprovacao = boletim.verificaAlunoAprovado(aluno01.nome, mediaGeralAluno, aluno01.calculaFrequencia());
        System.out.println(mensagemAprovacao);
    }

}
