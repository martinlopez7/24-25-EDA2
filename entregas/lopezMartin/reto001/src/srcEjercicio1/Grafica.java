package srcEjercicio1;

public class Grafica {

    private Cola colaFrames;

    public Grafica(){
        this.colaFrames = new Cola();
    }

    public void generarFrames(){
        colaFrames.enqueue(); 
    }

    public Frame[] devolverDosFrames(){
        return colaFrames.dequeue();
    }
    
}