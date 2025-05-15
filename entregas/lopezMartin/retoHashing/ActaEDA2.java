package entregas.lopezMartin.retoHashing;

public class ActaEDA2 {

    private Estudiante[] estudiantes;
    private String codigoActa;

    public ActaEDA2(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
        this.codigoActa = generarCodigoActa();
    }

    private String generarCodigoActa() {
        
    }

    public String getCodigoActa(){
        return this.codigoActa;
    }
    
}
