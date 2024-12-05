import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.menuMoedas();

        Scanner leitura = new Scanner(System.in);
        API api = new API();

        Referencias referencias = new Referencias();

        boolean opcValida = false;
        while (!opcValida){
            int opc1 = leitura.nextInt();
            if (opc1 >1 && opc1 <6){
                switch (opc1){
                    case 1:
                        referencias.setConvercaoDe("ARS");
                        break;

                    case 2:
                        referencias.setConvercaoDe("BOB");
                        break;

                    case 3:
                        referencias.setConvercaoDe("BRL");
                        break;

                    case 4:
                        referencias.setConvercaoDe("CLP");
                        break;

                    case 5:
                        referencias.setConvercaoDe("COP");
                        break;

                    case 6:
                        referencias.setConvercaoDe("USD");
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
        System.out.println("Moeda selecionada: " + referencias.getConvercaoDe());
        System.out.println("Escolha para qual moeda será convertida");
        menu.menuMoedas();

        opcValida = false;

        while (!opcValida){
            int opc2 = leitura.nextInt();
            if (opc2 >1 && opc2 <6){
                switch (opc2){
                    case 1:
                        referencias.setConvercaoDe("ARS");
                        break;

                    case 2:
                        referencias.setConvercaoDe("BOB");
                        break;

                    case 3:
                        referencias.setConvercaoDe("BRL");
                        break;

                    case 4:
                        referencias.setConvercaoDe("CLP");
                        break;

                    case 5:
                        referencias.setConvercaoDe("COP");
                        break;

                    case 6:
                        referencias.setConvercaoDe("USD");
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

        System.out.println();
            //menu inicial
          /*  System.out.println("********************************************");
            System.out.println("Seja bem-vindo ao Conversor de Moedas!");
            System.out.println("********************************************\n");
            System.out.println("Escolha a moeda a ser convertida: \n");
            System.out.println("1 - Real brasileiro >> Peso argentino ");
            System.out.println("2 - Peso argentino >> Real brasileiro");
            System.out.println("3 - Real Brasileiro >> Boliviano");
            System.out.println("4 - Boliviano >> Real Brasileiro");
            System.out.println("5 - Real brasileiro >> Peso chileno");
            System.out.println("6 - Peso chileno >> Real brasileiro");
            System.out.println("7 - Real brasileiro >> Peso colombiano");
            System.out.println("8 - Peso colombiano >> Real brasileiro");
            System.out.println("9 - Real brasileiro >> Dólar americano");
            System.out.println("0 - Dólar americano>> Real brasileiro");*/
        }
    }