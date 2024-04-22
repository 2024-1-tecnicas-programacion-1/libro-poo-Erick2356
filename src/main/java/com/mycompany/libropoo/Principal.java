package com.mycompany.libropoo;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        String titulo= e.nextLine();
        String autor= e.nextLine();
        int anoPublicacion = e.nextInt();
        String genero = e.next();
        Libro libro1 = new Libro(titulo, autor, anoPublicacion, genero);

        System.out.println(libro1.mostrarinformacion());
        libro1.marcarLeido();
        System.out.println(libro1.getLeido());
        System.out.println(libro1.esAntiguo());
        

    }
    
}
