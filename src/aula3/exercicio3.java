import javax.swing.*;

public class exercicio3 {
    public static void main(String[] args) {
        Integer inteiro = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(inteiro);

            Integer inteiro2 = Integer.parseInt(JOptionPane.
                    showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
            System.out.println(inteiro2);

            int soma =  inteiro + inteiro2;

        JOptionPane.showMessageDialog(null,"A soma dos numeros é igual a:"+(soma), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
       }
      }
