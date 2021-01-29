package ufv.dis.final2021.SLG;

public class IP {
    private String nombre;
    private String tipo;
    private String descripcion;

    public IP(){
        this.nombre=null;
        this.tipo=null;
        this.descripcion=null;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
