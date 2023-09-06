package aula6;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Aluno {
    Integer codigo;
    String nome;
    LocalDate dataNascimento;
    String telefone;
    String endereco;
    Map<String, List<Integer>> disciplinasNotas;

    List<Boolean> frequencia;

    String matricula;
    Character sexo;
    String RG;

    String localNascimento;

    public void imprimirDadosAlunos() {
        System.out.println("Codigo: " + codigo + " Nome: " + nome + "Data nascimento: " + dataNascimento);
    }

    public void calcularMediaPorMateria() {
        for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();

            System.out.println("Disciplina:" + nomeDisciplina);
            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            System.out.println("Média: " + (somaNotas / notas.size()));
        }
    }

    public Integer calcularMediaGeral() {
        Integer mediaGeral = 0;
        for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();

            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            mediaGeral += somaNotas / notas.size();
        }
        return (mediaGeral / disciplinasNotas.size());
    }

    public Double calculaFrequencia() {
        Integer presenca = 0;
        for (Boolean frequencia : frequencia) {
            if (frequencia.equals(true)) {
                presenca++;
            }
        }
        return (presenca.doubleValue() / frequencia.size()) * 100;
    }
}







        


