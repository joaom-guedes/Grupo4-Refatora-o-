package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Impressora_de_Nota_Fiscal {

    public Impressora_de_Nota_Fiscal() {}

    public static void imprimeNotas(Usuario usuario,String moeda){

        System.out.println(cabecalho(usuario));

        double valorTotal = 0;
        for(Produto p :usuario.getProdutos()){
            System.out.println(p.getDesc()+" x "+p.getQtd()+" = "+p.getQtd()*p.getPreco());
            valorTotal += p.getQtd()*p.getPreco();
        }
        valorTotal = calculaDesconto(valorTotal);
        System.out.println("TOTAL: "+moeda+" "+valorTotal);
        System.out.println(verificaTaxas(moeda));
    }

    public static double calculaDesconto(double valor){
        if (valor > 500){return valor -= 25;} else{return valor;}
    }

    public static String verificaTaxas(String moeda){
        if ("USD".equals(moeda)){return ("Taxa adicional: 5.0");}
        if ("BRL".equals(moeda)) {return ("IOF: 7.3");}
        return "Sem taxa";
    }
    public static String cabecalho(Usuario usuario){
        return ("== NOTA FISCAL == \n ID: "+usuario.getID()+" / Cliente: "+usuario.getNome());
    }
    public static void main(String[] args) {


        Produto p1 = new Produto("Mouse",2,50);
        Produto p2 = new Produto("Teclado",1,200);

        ArrayList<Produto> listaProduto = new ArrayList<>();

        listaProduto.add(p1);
        listaProduto.add(p2);

        Usuario user1 = new Usuario(listaProduto,"Maria","INV-1");
        imprimeNotas(user1,"BRL");

    }

}
