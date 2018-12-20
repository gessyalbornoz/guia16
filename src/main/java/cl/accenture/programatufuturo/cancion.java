package cl.accenture.programatufuturo;

public class cancion {
    private int idcancion;
    private String nombre;
    private String autor;
    private String genero;
    private int duracion;

    public cancion(){}

    public cancion(int idcancion, String nombre, String autor, String genero, int duracion) {
        this.idcancion = idcancion;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.duracion = duracion;
    }
    public void setIdcancion(idcancion){
        this.idcancion = idcancion;
    }

    public int getIdcancion(){
        return idcancion;
    }
    public void setNombre(nombre){
        this.nombre = nombre;
    }

    public int getNombre(){
        return nombre;}



    public void setAutor(autor){
        this.autor = autor;
    }
    public int getAutor(){
        return autor;}

    public void setgenero(genero)  {
        this.genero = genero;
    }


}
