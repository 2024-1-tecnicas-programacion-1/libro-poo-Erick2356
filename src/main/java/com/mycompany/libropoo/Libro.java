package com.mycompany.libropoo;

public class Libro {

    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean leido;
    private String genero;

    Libro (String titulo, String autor, int anoPublicacion, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.leido=false;
    
    }

// Complejidad temporal O(1)
    public String mostrarinformacion(){
        return "Titulo: " + titulo + " Autor: " + autor + " Año de publicacion: " + anoPublicacion + " Genero: " + genero;


    }
// Complejidad temporal O(1)
    public void marcarLeido () {
        leido=true;


    }
// Complejidad temporal O(1)
    public boolean getLeido(){
        return leido;
    }
//  Complejidad temporal O(1)
    public boolean esAntiguo() {
        return (2024-anoPublicacion>= 50);
     
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    } 
    public String getGenero() {
        return genero;
    }


}
