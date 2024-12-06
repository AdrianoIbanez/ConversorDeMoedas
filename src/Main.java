import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("********************************************");
        System.out.println("Seja bem-vindo ao Conversor de Moedas!");
        System.out.println("********************************************\n");

        Menu menu = new Menu();
        menu.menuMoedas();

        Scanner leitura = new Scanner(System.in);
        API api = new API();

        Referencias referencias = new Referencias();

        boolean opcValida = false;
        while (!opcValida){
            int opc1 = leitura.nextInt();
            if (opc1 >=1 && opc1 <=6){
                switch (opc1){
                    case 1:
                        referencias.setConversaoDe("ARS");
                        break;

                    case 2:
                        referencias.setConversaoDe("BOB");
                        break;

                    case 3:
                        referencias.setConversaoDe("BRL");
                        break;

                    case 4:
                        referencias.setConversaoDe("CLP");
                        break;

                    case 5:
                        referencias.setConversaoDe("COP");
                        break;

                    case 6:
                        referencias.setConversaoDe("USD");
                        break;

                    default:
                        System.out.println("Escolha entre 1 a 6");
                        break;
                }
                opcValida = true;
            } else {
                System.out.println("Opção invalida! Digite um número de 1 a 6!");
            }
        }
        System.out.println("Moeda selecionada: " + referencias.getConversaoDe());
        System.out.println("Escolha para qual moeda será convertida");
        menu.menuMoedas();

        opcValida = false;

        while (!opcValida){
            int opc2 = leitura.nextInt();
            if (opc2 >=1 && opc2 <=6){
                switch (opc2){
                    case 1:
                        referencias.setConversaoDe("ARS");
                        break;

                    case 2:
                        referencias.setConversaoDe("BOB");
                        break;

                    case 3:
                        referencias.setConversaoDe("BRL");
                        break;

                    case 4:
                        referencias.setConversaoDe("CLP");
                        break;

                    case 5:
                        referencias.setConversaoDe("COP");
                        break;

                    case 6:
                        referencias.setConversaoDe("USD");
                        break;

                    default:
                        System.out.println("Escolha entre 1 a 6");
                        break;
                }
                opcValida = true;
            } else {
                System.out.println("Opção invalida! Digite um número de 1 a 6!");
            }
        }

        System.out.println("A moeda sera convertida de " + referencias.getConversaoDe() + " para "
            + referencias.getConversaoPara());

        System.out.println("Digite o valor" + referencias.getConversaoDe() + " para "
                + referencias.getConversaoPara());

        boolean valorValido = false;
        while (!valorValido){
            try {
                String valor = leitura.next().replace(',', '.');
                referencias.setValor(Double.parseDouble(valor));
                valorValido = true;
            } catch (NumberFormatException e){
                System.out.println("Digite um valor válido");
                valorValido = false;
            }
        }

        API.Moeda(referencias);
        }
    }