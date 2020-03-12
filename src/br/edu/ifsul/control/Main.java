package br.edu.ifsul.control;

import br.edu.ifsul.model.*;

import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        //cliente
        //constructor com parametros
        Cliente c1 = new Cliente("048.366.150-38", "Talles", "Eduardo", "Rua Jóse Rizzolo", "96040760", "051-980401326", "teduardo13@hotmail.com");

        //constructor com parametros
        Cliente c2 = new Cliente("123.123.123-22", "Talles", "Eduardo", "Rua Jóse Rizzolo", "96040760", "051-980401326", "teduardo13@hotmail.com");

        //constructor vazio
        Cliente c3 = new Cliente();
        c3.setCpf("123.123.123-33");
        c3.setNome("Talles");
        c3.setSobrenome("Eduardo");
        c3.setEndereco("RUa jose rizzolo");
        c3.setCep("96040366");
        c3.setTelefone("123-912121212");
        c3.setEmail("teduardo13@hotmail.com");
        System.out.println("Cliente 2 " + c2); //print do construct parametrizado
        System.out.println("Cliente 3 " + c3); //print do construct sem parametros

        System.out.println("");

        //locacao
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        //constructor com parametros
        Locacao l1 = new Locacao(df.parse("03/05/2020"), simpleDateFormat.parse("11:00"), df.parse("03/05/2020"), simpleDateFormat.parse("11:00"), 5400, 12.45, 35.99, true);
        System.out.println(l1);

        System.out.println("");

        //automovel
        //constructor com parametros
        Automovel automovel1 = new Automovel("sla oq renavan", "ijk-1231", "azul", 4, "diesel", 120, "preto", 12.20);
        //constructor vazio
        Automovel automovel2 = new Automovel();
        automovel2.setRenavan("sla oq renavan");
        automovel2.setPlaca("ijk-1231");
        automovel2.setCor("azul");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("diesel");
        automovel2.setQuilometragem(240);
        automovel2.setChassi("preto");
        automovel2.setValor_locacao(12.20);
        System.out.println("Automovel 1 " + automovel1); //print do construct parametrizado
        System.out.println("AUtomovel 2 " + automovel2); //print do construct sem parametros

        System.out.println("");

        //modelo
        //constructor com parametros
        Modelo modelo1 = new Modelo("sedan");
        //constructor vazio
        Modelo modelo2 = new Modelo();
        modelo2.setDescricao("sedan xd");

        System.out.println("Modelo 1 " + modelo1); //print do construct parametrizado
        System.out.println("Modelo 2 " + modelo2); //print do construct sem parametros

        System.out.println("");

        //marca
        //constructor com parametros
        Marca marca1 = new Marca("volvo");
        //constructor vazio
        Marca marca2 = new Marca();
        marca2.setDescricao("nissan");

        System.out.println("Marca 1 " + marca1); //print do construct parametrizado
        System.out.println("Marca 2 " + marca2); //print do construct sem parametros

    }
}
