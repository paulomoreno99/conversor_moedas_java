package model;

public class Menu {
    public String textMenu() {
        return """
                ##################################################################
                Seja Bem Vindo(a) ao nosso sistema de conversão de Moedas.
                Escolha uma opção abaixo.:
                                              
                1 - Real            ==> Dolar
                2 - Dolar           ==> Real
                3 - Real            ==> Yuan China
                4 - Yuan China      ==> Real
                5 - Real            ==> Peso Mexicano
                6 - Peso Mexicano   ==> Real
                7 - Sair do Sistema
                Opção.:  
                ###################################################################
                """;
    }
}
