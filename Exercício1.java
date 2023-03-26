import java.util.Scanner;
public class revisao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nomes[] = new String[3];
        double contas[][] = new double[4][4];
        int valor;
        double num;

        System.out.println("Digite o primeiro nome:");
        nomes[0] = scan.nextLine();
        System.out.println("Digite o segundo nome:");
        nomes[1] = scan.nextLine();
        System.out.println("Digite o terceiro nome:");
        nomes[2] = scan.nextLine();

        showNames(nomes);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um valor inteiro de opção:");
            valor = scan.nextInt();
            checkNumber(valor, nomes);
        }

        System.out.println();

        for (int g = 0; g < 4; g++) {
            for (int h = 0; h < 4; h++) {
                if (g == 0 && h == 0) {
                    contas[g][h] = 0;
                }

                else if (g == 0) {
                    System.out.println("Digite o " + h + "º valor");
                    num = scan.nextDouble();
                    contas[g][h] = num;
                }

                else if (h == 0) {
                    contas[g][h] = contas[h][g];
                }

                else if (g == h) {
                    contas[g][h] = contas[0][h] * contas[0][h];
                }

                else {
                    contas[g][h] = contas[0][g] - contas[0][h];
                }
            }
        }

        printValues(contas);

        scan.close();
    }

        private static void printValues(double[][] contas) {
            System.out.println();
            for (int i = 0; i < 4; i ++) {
                for (int j = 0; j < 4; j++ ) {
                    System.out.print(contas[i][j] + " " );                              
                }
                System.out.println();
            }
        }

        private static void checkNumber(int valor, String[] nomes) {
            if (valor == 1) {
                System.out.println(nomes[0]);
            }

            else if (valor >= 2 && valor <= 10) {
                System.out.println(nomes[1]);
            }

            else if (valor > 10) {
                System.out.println(nomes[2]);
            }

            else {
                System.out.println("Opção inválida!");
            }
        }


        private static void showNames(String[] nomes) {
            System.out.println();
            System.out.println("Nomes digitados:");
            for (int i = 0; i < 3; i++) {
                System.out.print(nomes[i] + " ");
            }
            System.out.println();
            System.out.println();
        }
}
