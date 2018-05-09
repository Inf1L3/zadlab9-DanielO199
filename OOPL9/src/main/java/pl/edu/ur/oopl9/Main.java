package pl.edu.ur.oopl9;

import java.util.Random;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        
        Random r = new Random();
      /* ZAD1
        
        
        int[] tablica = new int[100];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = r.nextInt(11);
            System.out.println(tablica[i]);
        
        Arrays.sort(tab);
       System.out.println("Sortowanie i wyswietlanie tablicy: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        }
        */
        /*ZAD2
        int [] tab = new int[10];
        for (int i = 0; i < tab.length; i++){
            tab[i]=r.nextInt(11);
            System.out.println(tab[i]);}
            Set<String> liczby = new TreeSet<>();
		liczby.add(" ");
                Iterator it = liczby.iterator();
        
        
     while (it.hasNext()) {
            String value = (String) it.next();
            System.out.println("Value :" + value);
        }
        
	*/	
        
     List<Object> lista = new ArrayList<>();
        Samochod s1 = new Samochod("M1", "ferrari", 100, 99);
        Samochod s2 = new Samochod("M2", "chevrloet", 100,99 );
        Samochod s3 = new Samochod("M3", "fiat", 99, 66);
       Samochod s4 = new Samochod("M4", "fiat", 300, 99);
        lista.add(s1);
        lista.add(s2);
       lista.add(s3);
       lista.add(s4);
        
         for(int i = 0; i < lista.size(); i++){
            System.out.println("Lista nr "+(i+1)+": "+ lista.get(i).toString());

    }

    }
}