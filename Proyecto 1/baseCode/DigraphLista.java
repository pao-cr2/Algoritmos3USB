/*
 * Implementa la clase abstracta Digraph utilizando dos tablas de
 * hash, una para vertices y una para arcos.
 */
public class DigraphLista extends Digraph {

    private  DynamicArray nodos;
    private  DynamicArray arcos;  //Lista<Arco>

    /*
     * @see Constructor para Digraph.
     */
    public DigraphLista() {
    	super();
    	nodos = new DynamicArray();
    	arcos = new DynamicArray();
    }

    /*
     * Agrega la arista dada al grafo. Si los vertices de la arista
     * no existen o el grafo tiene una arista entre dichos vertices,
     * retorna false. Si se agrega la nueva arista, retorna true.
     */
    public  boolean add(Arco e){
        String src = e.getSrc();
        Nodo noditoS = new Nodo(src);
        Nodo noditoD = new Nodo(e.getDst());
        int i = 0;
        
        try {
    		while(!(((Nodo) this.nodos.getArray()[i]).equals(noditoS)))
    			i++;
    	}
    	catch(java.lang.ArrayIndexOutOfBoundsException blah) {
    		return false;
    	}
        
        int j=0;
        try {
        	while(!(((Nodo) this.nodos.getArray()[j]).equals(noditoD)))
        		j++;
        }
        catch(java.lang.ArrayIndexOutOfBoundsException bleh) {
        	return false;
        }
    	
        Lista<Arco> nuevList = new MiLista<Arco>();
        if (this.arcos.getArray().length == 1) {
        	nuevList.add(e);
        	this.arcos.addFinal(nuevList.add(e));
        	return true;
        }
        ((Lista<Arco>) this.arcos.getArray()[i]).add(e);
        return true;        
    }

    /*
     * Agrega el nodo n. Si el vertice ya existe, retorna false. Si
     * se agrega el nodo, retorna true.
     */
    public  boolean add(Nodo n){
    	int i=0;
    	boolean agregue = false;
    
    	try {
    		while(!(((Nodo) this.nodos.getArray()[i]).equals(n)))
    			i++;
    	}
    	catch(java.lang.ArrayIndexOutOfBoundsException blah) {
    		this.nodos.addFinal(n); 
    		this.arcos.addFinal(new MiLista<Arco>());
    		agregue = true;
    	}
    	
    	return agregue;
    	
    }

    /*
     * Elimina los nodos y aristas del grafo.
     */
    public  void clear(){
    	if (this.nodos != null) {
    		int i=(this.nodos.getArray().length - 1);
        	while (i>=0){
        		this.nodos.remove(i);
        	}
        	i=(this.arcos.getArray().length -1);
        	while (i>=0){
        		this.arcos.remove(i);
        	}
    	}
    }

    /*
     * Chequea si el grafo contiene una arista del nodo src a dst
     */
    public  boolean contains(String src, String dst){
        Nodo nodito = new Nodo(src);
        boolean agregue = false;
        if (this.nodos == null)
        	return agregue;
        else if(!this.nodos.existe(nodito))
        	return agregue;
        else {
        	int i=0;
        	while( i < this.nodos.getArray().length && this.nodos.getArray()[i] != nodito)
        		i++;
        	Arco aux = new Arco(src,dst);
        	if (( (Lista<Arco>) this.arcos.getArray()[i]).contains(aux))
        		return agregue;
        	else{
        		agregue = (( (Lista<Arco>) this.arcos.getArray()[i]).add(aux));
        		return agregue;
        	}
        }
    }

    /*
     * Chequea si el grafo contiene un nodo con id nod
     */
    public boolean contains(String nod) {
		Nodo aux = new Nodo(nod);
		return this.nodos.existe(aux);
    }

    /*
     * Retorna la arista del grafo que conecta a los vertices
     * src y dst. Si no existe dicha arista, retorna null.
     */
    public  Arco get(String src, String dst){
        Nodo aux = new Nodo(src);
        if(!this.nodos.existe(aux))
        	return null;
        else {
        	int i=0;
        	while( i < this.nodos.getArray().length && this.nodos.getArray()[i] != aux)
        		i++;
        	Arco nuevo = new Arco(src,dst);
        	if (!( (Lista<Arco>) this.arcos.getArray()[i]).contains(nuevo))
        		return null;
        	else {
        		return nuevo;
        	}
        }
    }

    /*
     *Retorna todas las aristas del grafo
     */
    public  Lista<Arco> getArcos(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Retorna el nodo con id nod. Si no existe dicho nodo, 
     * retorna null.
     */
    public Nodo get(String nod){
    	Nodo aux = new Nodo(nod);
        if(!this.nodos.existe(aux)) 
        	return null;
        else {
        	int i=0;
        	while( i < this.nodos.getArray().length && this.nodos.getArray()[i] != aux)
        		i++;
        	return (Nodo) this.nodos.getArray()[i];
        }
    }

    /* 
     * Retorna todos los nodos del grafo.
     */
    public  Lista<Nodo> getNodos(){
        if (this.nodos == null)
        	return null;
        
    	Lista<Nodo> lista = new MiLista<Nodo>();
        int i=0;
        
        while(i < this.nodos.getArray().length) {
        	lista.add((Nodo) this.nodos.getArray()[i]);
        	i++;
        }
        return lista;
    }

    /*
     * Retorna la lista de lados que tienen al vertice dado como
     * destino. Si el vertice no existe, retorna null.
     */
    public  Lista<Arco> getInArcos(String nodo){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Retorna la lista de lados que tienen al vertice dado como
     * origen. Si el vertice no existe, retorna null.
     */
    public  Lista<Arco> getOutArcos(String nodo){
        Nodo aux = new Nodo(nodo);
        if (this.nodos == null)
        	return null;
        else if(!this.nodos.existe(aux)) 
        	return null;
        else {
        	int i=0;
        	while( i < this.nodos.getArray().length && this.nodos.getArray()[i] != aux)
        		i++;
        	return (Lista<Arco>) this.arcos.getArray()[i];
        }
    }

    /*
     * Remueve la arista del grafo que conecta a los vertices src y
     * dst. Si el grafo no cambia, retorna false. Si el grafo cambia,
     * retorna true.
     */
    public  boolean remove(String src, String dst){
    	Nodo aux = new Nodo(src);
    	boolean elimine = false;
    	if (this.nodos == null) 
    		return elimine;
    	else if(!this.nodos.existe(aux))
        	return elimine;
        else {
        	int i=0;
        	while( i < this.nodos.getArray().length && this.nodos.getArray()[i] != aux)
        		i++;
        	Arco nuevo = new Arco(src,dst);
        	if (!( (Lista<Arco>) this.arcos.getArray()[i]).contains(nuevo))
        		return elimine;
        	else {
        		elimine = ( (Lista<Arco>) this.arcos.getArray()[i]).remove(nuevo);
        		return elimine;
        	}
        }
    }

    /*
     * Remueve el nodo del grafo el nodo nod y todas las aristas a las
     * que esta conectado. Si el grafo no cambia, retorna false. Si el
     * grafo cambia, retorna true.
     */
    public  boolean remove(String nod){
    	Nodo aux = new Nodo(nod);
    	if (this.nodos == null)
    		return false;
    	else if(!this.nodos.existe(aux)) 
        	return false;
        else {
        	int i=0;
        	while( i < this.nodos.getArray().length && this.nodos.getArray()[i] != aux)
        		i++;
        	this.nodos.remove(i);
        	this.arcos.remove(i);
        	return true;
        } 
    }

}

// End DigraphHash.
