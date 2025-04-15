/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_28;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int i, j;
        int somat = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha " + i + " e coluna " + j + ": "));
                somat += A[i][j];
            }
        }

        int coluna0 = 0;
        for (i = 0; i < 3; i++) {
            coluna0 += A[i][0];
        }
        JOptionPane.showMessageDialog(null, "Soma da primeira coluna: " + coluna0);

        int coluna2 = 0;
        for (i = 0; i < 3; i++) {
            coluna2 += A[i][1];
        }
        int coluna3 = 0;
        for (i = 0; i < 3; i++) {
            coluna3 += A[i][2];
        }

        JOptionPane.showMessageDialog(null,
                "A soma dos elementos de cada coluna:\n"
                + "1ª coluna: " + coluna0 + "\n"
                + "2ª coluna: " + coluna2 + "\n"
                + "3ª coluna: " + coluna3);

        int linha1 = 1;
        for (j = 0; j < 3; j++) {
            linha1 *= A[1][j];
        }
        JOptionPane.showMessageDialog(null, "O produto dos elementos da primeira linha é: " + linha1);

        JOptionPane.showMessageDialog(null, "A soma de todos os elementos é: " + somat);

        int med;
        med = somat / 9;
        JOptionPane.showMessageDialog(null, "A média dos elementos da matriz é: " + med);

        String elementoma = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] > med) {
                    elementoma += "A[" + i + "][" + j + "] = " + A[i][j] + "\n";
                }
            }
        }
        if (elementoma.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Média dos elementos: " + med + "\n\n"
                    + "Não há elementos maiores que a média");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Média dos elementos: " + med + "\n\n"
                    + "Elementos maiores que a média:\n"
                    + elementoma);
        }

        String elementome = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] < med) {
                    elementome += "A[" + i + "][" + j + "] = " + A[i][j] + "\n";
                }
            }
        }
        if (elementome.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Média dos elementos: " + med + "\n\n"
                    + "Não há elementos menores que a média:\n"
                    + elementome);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Média dos elementos: " + med + "\n\n"
                    + "Elementos menores que a média:\n"
                    + elementome);
        }

        int maiorvalor = Integer.MIN_VALUE;
        String valorma = "";

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] > maiorvalor) {
                    maiorvalor = A[i][j];
                    valorma = "A[" + i + "][" + j + "] = " + A[i][j] + "\n";
                }
            }
        }

        JOptionPane.showMessageDialog(null, "O maior valor da matriz é: " + valorma);

        int menorvalor = Integer.MAX_VALUE;
        String valorme = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] < menorvalor) {
                    menorvalor = A[i][j];
                    valorme = "A[" + i + "][" + j + "] = " + A[i][j] + "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "O menor valor da matriz é: " + valorme);

        int diagonalp = 0;
        for (i = 0; i < 3; i++) {
            diagonalp += A[i][i];
        }
        JOptionPane.showMessageDialog(null, "Diagonal princípal é: " + diagonalp);

        int diagonals = 0;
        for (i = 0, j = 2; i > 3; i++, j--) {
            diagonals += A[i][j];
        }
        JOptionPane.showMessageDialog(null, "Diagonal secindaria é: " + diagonals);
    }
}
