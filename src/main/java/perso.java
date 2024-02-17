public class perso {
    private int cedula;
    private String nombre;
    private int edad;
    public void setCedula(int cedula){
        this.cedula=cedula;
    }
    public int getCedula(){
        return cedula;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }

}
public class Empleado extends perso{
    private long sueldo;
    public long getSueldo(){
        return sueldo;
    }
    public void setSueldo(long sueldo){
        this.sueldo=sueldo;
    }
}
public class cliente extends perso{
    private String email;
    public String setEmail(){
        this.email=email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
