package srcEjercicio1;
public class Cola {

    private NodoFrame primero;
    private NodoFrame ultimo;
    private int size;

    public Cola(){
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void enqueue(){

        NodoFrame nuevoNodo = new NodoFrame();

        if(this.size==0){
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        }else{
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        this.size++;
    }

    public Frame[] dequeue(){
        Frame[] frames = new Frame[2];
        if (tieneDosFrames()) {
            frames[0] = primero;
            primero = primero.getSiguiente();
            frames[1] = primero;
            primero = primero.getSiguiente();
            this.size -= 2;
        }   
        return frames;
    }

    public Frame[] peek(){
        Frame[] frames = new Frame[2];
        if (tieneDosFrames()) {
            frames[0] = primero;
            frames[1] = primero.getSiguiente();
            this.size -= 2;
        }   
        return frames;
    }

    private boolean tieneDosFrames(){
        return size>=2;
    }
    
}