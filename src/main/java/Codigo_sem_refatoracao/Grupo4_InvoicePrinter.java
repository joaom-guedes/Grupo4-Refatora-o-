package Codigo_sem_refatoracao;
import java.util.*;
class Grupo4_InvoicePrinter {
    static class Linha {
        String desc; int qtd; double preco;
        Linha(String d,int q,double p){desc=d; qtd=q; preco=p;}
    }
    public static void imprimirNota(String id, String cliente, String moeda, List<Linha>
            linhas) {
        double total = 0;
        System.out.println("== NOTA FISCAL ==");
        System.out.println("ID: "+id+" / Cliente: "+cliente);
        for (Linha l : linhas) {
            double parcial = l.qtd * l.preco;
            System.out.println(l.desc+" x"+l.qtd+" = "+moeda+" "+parcial);
            total += parcial;
        }
        if (total > 500) total -= 25;
        System.out.println("TOTAL: "+moeda+" "+total);
        if ("USD".equals(moeda)) System.out.println("Taxa adicional: 5.0");
        if ("BRL".equals(moeda)) System.out.println("IOF: 7.3");
    }
    public static void main(String[] args) {
        List<Linha> ls = Arrays.asList(new Linha("Mouse",2,50), new
                Linha("Teclado",1,200));
        imprimirNota("INV-1","Maria","BRL", ls);
    }
}