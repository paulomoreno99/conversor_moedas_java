package model;


import service.ApiExchange;
import model.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Option {
    Scanner scanner = new Scanner(System.in);
    ApiExchange apiExchange = new ApiExchange();
    Menu menu = new Menu();

    private int optionSelected;
    private double valorParaConverter;

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    public void valueSelected(int optionSelected) throws IOException {
        switch (optionSelected) {
            case 1:
                System.out.println("Real --> Dolar");
                System.out.print("Digite o valor que deseja converter: R$ ");
                var value = ApiExchange.currencyConverter("BRL", "USD");
                double valueConverted = Double.parseDouble(value.conversion_rate());
                double valueToConvert = scanner.nextDouble();
                System.out.println("Valor R$" + valueToConvert + " [BRL] + corresponde ao valor de $"
                        + (valueToConvert * valueConverted) + " [USD]");
                System.out.println(menu.textMenu());

                break;

            case 2:
                System.out.println("Dolar --> Real");
                System.out.print("Digite o valor que deseja converter: $ ");
                value = ApiExchange.currencyConverter("USD", "BRL");
                valueConverted = Double.parseDouble(value.conversion_rate());
                valueToConvert = scanner.nextDouble();
                System.out.println("Valor $ " + valueToConvert + " [USD] corresponde ao valor de R$ "
                        + (valueToConvert * valueConverted) + " [BRL]");
                System.out.println(menu.textMenu());

                break;

            case 3:
                System.out.println("Real --> Yuan China");
                System.out.print("Digite o valor que deseja converter: R$ ");
                value = ApiExchange.currencyConverter("BRL", "CNY");
                valueConverted = Double.parseDouble(value.conversion_rate());
                valueToConvert = scanner.nextDouble();
                System.out.println("Valor R$ " + valueToConvert + " [BRL] corresponde ao valor de $ "
                        + (valueToConvert * valueConverted) + " [CNY]");
                System.out.println(menu.textMenu());

                break;

            case 4:
                System.out.println("Yuan China --> Real");
                System.out.print("Digite o valor que deseja converter: $ ");
                value = ApiExchange.currencyConverter("CNY", "BRL");
                valueConverted = Double.parseDouble(value.conversion_rate());
                valueToConvert = scanner.nextDouble();
                System.out.println("Valor $ " + valueToConvert + " [CNY] corresponde ao valor de R$ "
                        + (valueToConvert * valueConverted) + " [BRL]");
                System.out.println(menu.textMenu());

                break;

            case 5:
                System.out.println("Real --> Peso Mexicano");
                System.out.print("Digite o valor que deseja converter: R$ ");
                value = ApiExchange.currencyConverter("BRL", "MXN");
                valueConverted = Double.parseDouble(value.conversion_rate());
                valueToConvert = scanner.nextDouble();
                System.out.println("Valor R$ " + valueToConvert + " [BRL] corresponde ao valor de R$ "
                        + (valueToConvert * valueConverted) + " [MXN]");
                System.out.println(menu.textMenu());

                break;

            case 6:
                System.out.println("Peso Mexicano --> Real");
                System.out.print("Digite o valor que deseja converter: $ ");
                value = ApiExchange.currencyConverter("MXN", "BRL");
                valueConverted = Double.parseDouble(value.conversion_rate());
                valueToConvert = scanner.nextDouble();
                System.out.println("Valor $ " + valueToConvert + " [MXN] corresponde ao valor de R$ "
                        + (valueToConvert * valueConverted) + " [BRL]");
                System.out.println(menu.textMenu());

               break;

            case 7:
                System.out.print("Operação finalizada!");
                break;

            default:
                System.out.println("Selecione uma opção de acordo como menu acima!");
                break;

        }
    }
}
