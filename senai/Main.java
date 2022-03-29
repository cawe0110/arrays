package br.com.senai;
import java.util.ArrayList;
import br.com.senai.model.Pessoa;

public class Main
    {
        public static void main(String[] args) {
            ArrayList<Pessoa> numeros = new ArrayList<Pessoa>();
            numeros.add(new Pessoa( "a"));
            numeros.add(new Pessoa( "a"));
            numeros.add(new Pessoa( "c"));
            numeros.add(new Pessoa( "d"));
            for(int i=0 ; i<numeros.size(); i++)
            {System.out.println(numeros.get(i).getNome());}
        }
    }
