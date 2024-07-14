import model.Menu;
import model.Option;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Option opcao = new Option();
        System.out.println(menu.textMenu());

        try {

            do {
                System.out.println();
                opcao.setOptionSelected(scanner.nextInt());

                opcao.valueSelected(opcao.getOptionSelected());
            } while (opcao.getOptionSelected() != 7);

        } catch (InputMismatchException | IOException error) {

            System.err.println("A opção deve ser informada como um número inteiro! ");
            System.err.println("Erro: " + error);

        } catch (IllegalArgumentException error) {

            System.out.println();
            System.err.println("Informe sua key na respectiva classe!");
            System.err.println("Erro: " + error);
        }
    }
}

