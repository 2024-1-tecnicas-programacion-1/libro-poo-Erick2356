package com.mycompany.libropoo;


import java.util.LinkedList;

public class Biblioteca {
    private LinkedList <Libro> Libros;
    public Biblioteca() {
        this.Libros = new LinkedList<>();
    }

   

    public void registrarLibro (Libro newlibro){

        Libros.add(newlibro);
      
       
    }


    public Libro buscarLibro(String palabrabusqueda){

        for (Libro r: Libros){
            if (r.getTitulo().equals(r) || r.getAutor().equals(r) || r.getAutor().equals(r)){

                return r;

            }
            
                

        }
        return null;

    }

    public void MostrarLibros (){

        for(Libro r:Libros) {
            System.out.println(r);
        }


    }


    public void mostrarLibrosnoLeidos (){

        for(Libro r:Libros);


      

        

    }


}
