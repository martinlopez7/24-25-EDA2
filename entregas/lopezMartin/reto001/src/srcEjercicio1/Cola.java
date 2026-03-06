package srcEjercicio1;
public class Cola {

    private NodoFrame primero;
    private NodoFrame ultimo;
    private int tamaño;

    public Cola(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public void enqueue(){

        NodoFrame nuevoNodo = new NodoFrame();

        if(this.tamaño==0){
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        }else{
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        this.tamaño++;
    }

    public Frame[] dequeue(){
        Frame[] frames = obtenerDosPrimeros();
        if (frames[0] != null && frames[1] != null) {
            primero = primero.getSiguiente().getSiguiente();
            this.tamaño -= 2;
        }
        return frames;
    }

    public Frame[] peek(){
        return obtenerDosPrimeros();
    }

    private Frame[] obtenerDosPrimeros(){
        Frame[] frames = new Frame[2];
        if (tieneDosFrames()) {
            frames[0] = primero;
            frames[1] = primero.getSiguiente();
        }
        return frames;
    }

    private boolean tieneDosFrames(){
        return tamaño >= 2;
    }
    
}