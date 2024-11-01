package br.edu.unisep.conceitos.view;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // vamos criar uma calculadora no estilo hp
        // o usuario vai informar varios numeros até um valor em branco
        // apos isso vai informar a operacao e sera exibido o resultado.
        // crio a lista para armazenar os numeros digitados
        List<Double> numeros = new ArrayList<>();
        // variavel que vai armazenar cada numero digitado
        String input;

        // agora crio um laco para repetir enquanto a variavel nao for vazia
        do {
            // chama a mensagem para o usuario informar um numero e faz um
            // trim
            input = JOptionPane.showInputDialog("Digite o numero").trim();
            // verifica se o numero digitado nao eh vazio
            if (!input.equals("")) {
                try {
                    // grava em uma variavel o valor digitado ja convertido
                    Double n = Double.parseDouble(input);
                    // add o numero na lista
                    numeros.add(n);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,
                            "Erro no numero digitado " + e.getMessage());
                }
            }
        } while (!input.equals(""));

        String operacao = JOptionPane.showInputDialog("Digite o operador").trim();
        switch (operacao) {
            case "+":
                Double total = 0.0;
                for (Double numero : numeros) {
                    total += numero;
                }
                JOptionPane.showMessageDialog(null,
                        "O total da soma é: " + total);
                break;
            case "-":
                total = 0.0;
                for (Double numero : numeros) {
                    total -= numero;
                }
                JOptionPane.showMessageDialog(null,
                        "O total da subtracao é: " + total);
                break;
            case "*":
                total = 1.0;
                for (Double numero : numeros) {
                    total *= numero;
                }
                JOptionPane.showMessageDialog(null,
                        "O total da multiplicacao é: " + total);
                break;
            case "/":
                total = 1.0;
                for (Double numero : numeros) {
                    total /= numero;
                }
                JOptionPane.showMessageDialog(null,
                        "O total da divisao é: " + total);
                break;
            default:
                /// se digitou algo errado
                JOptionPane.showMessageDialog(null,
                    "Operacao invalida!");
                break;
        }
    }
}
