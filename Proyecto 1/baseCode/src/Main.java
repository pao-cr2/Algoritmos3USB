
public class Main {

	public static void main(String[] args) {
		
		Arco prueba = new Arco("pedro","juan");

		Arco prueba1 = new Arco("pedro","pepe");

		Arco prueba2 = new Arco("lalala","lelele");
//		Arco prueba1 = (Arco)prueba.clone();

//		System.out.println(prueba.getDst()+"\n"+prueba1.getSrc());
		
//		System.out.println(prueba.equals(prueba1));
		
		Lista<Arco> listaPrueba = new MiLista<Arco>();
		Lista<Arco> listaPrueba2 = new MiLista<Arco>();
		boolean a=true;
		
		System.out.println("isEmpty");
		a = listaPrueba.isEmpty();
		System.out.println(a);
		
		a = listaPrueba.add(prueba);
//		System.out.println(a);
		
		System.out.println("getSize");
		int tam = listaPrueba.getSize();
		System.out.println(tam);

		a = listaPrueba.add(prueba1);
//		System.out.println(a);
		
		System.out.println("getSize");
		tam = listaPrueba.getSize();
		System.out.println(tam);
		
		a = listaPrueba.contains(prueba2);
//		System.out.println(a);
		
		System.out.println("isEmpty");
		a = listaPrueba.isEmpty();
		System.out.println(a);
		
		a = listaPrueba2.isEmpty();
//		System.out.println(a);
		
		a = listaPrueba.remove(prueba);
//		System.out.print("remove");
//		System.out.println(a);
		
		a = listaPrueba.contains(prueba1);
		System.out.println("contains");
		System.out.println(a);
		
		
		System.out.println("getSize");
		tam = listaPrueba.getSize();
		System.out.println(tam);
		
		listaPrueba.clear();
		
		tam = listaPrueba.getSize();
//		System.out.println(tam);
		
		a = listaPrueba.add(prueba);
//		System.out.println(a);
		a = listaPrueba.add(prueba1);
//		System.out.println(a);
		
		a = listaPrueba2.add(prueba);
//		System.out.println(a);
		a = listaPrueba2.add(prueba1);
//		System.out.println(a);
		
		System.out.println("Equals");
		System.out.println(listaPrueba.equals(listaPrueba2));
		System.out.println(listaPrueba2.equals(listaPrueba));
		
		listaPrueba.clear();
		listaPrueba2.clear();
		
		a = listaPrueba.add(prueba);
//		System.out.println(a);
		a = listaPrueba.add(prueba2);
//		System.out.println(a);
		a = listaPrueba.add(prueba);
//		System.out.println(a);
		
		a = listaPrueba2.add(prueba);
//		System.out.println(a);
		a = listaPrueba2.add(prueba2);
//		System.out.println(a);
		a = listaPrueba2.add(prueba1);
//		System.out.println(a);
		
		
		
	/*	
		System.out.println("Equals");
		a = listaPrueba2.equals(listaPrueba);
		System.out.println(a);
		
		System.out.println("\nImprimir");
		Object[] array = (Object[]) listaPrueba2.toArray();
		for(int i=0; i<array.length;i++){
			System.out.println(array[i].toString());
		}

		Matriz matrix = new Matriz();
		
		matrix.print();
		matrix.addFila();
		matrix.addColumna();
		matrix.print();
		matrix.addFila();
		matrix.addColumna();
		matrix.addColumna();
		matrix.addColumna();
		matrix.addColumna();
		for(int i=0;i<3;i++){
			matrix.add(i, i,9);
		}
		matrix.add(2, 0,1);
		System.out.println("Esta?\n"+matrix.esta(2, 1));
		matrix.add(0, 2,5);		
		for(int i=3;i<6;i++){
			for(int j=0;j<3;j++){
				matrix.add(j,i,1);
			}
		}
		matrix.add(0, 5,0);
		matrix.add(2 ,5,0);
		matrix.add(1, 4,0);
		matrix.print();
*/		
/*
		DigraphMatriz sinNombre = new DigraphMatriz();
		System.out.println(sinNombre.add(new Nodo("A")));
		System.out.println(sinNombre.add(new Nodo("B")));
		System.out.println(sinNombre.add(new Nodo("A")));
		System.out.println(sinNombre.add(new Arco("A","A")));
		System.out.println(sinNombre.add(new Nodo("D")));
		System.out.println(sinNombre.add(new Arco("B","B")));
		System.out.println(sinNombre.add(new Arco("A","D")));
		System.out.println(sinNombre.add(new Arco("D","D")));
		
		sinNombre.clear();
		System.out.println(sinNombre.add(new Nodo("D")));
		System.out.println(sinNombre.add(new Nodo("B")));
		System.out.println(sinNombre.add(new Nodo("A")));
		System.out.println(sinNombre.add(new Arco("A","D")));
		System.out.println(sinNombre.add(new Arco("D","B")));
		
		System.out.println("Contains\n"+sinNombre.contains("A", "D"));
		System.out.println(sinNombre.contains("D", "A"));
		System.out.println(sinNombre.contains("B", "A"));
		System.out.println(sinNombre.contains("A", "E"));
		System.out.println(sinNombre.contains("E", "F"));
		System.out.println(sinNombre.contains("E", "D"));
		
		System.out.println("\n"+sinNombre.contains("A"));
		System.out.println(sinNombre.contains("E")+"\n");
		
		try{
			System.out.println(sinNombre.get("A", "D").toString());
		}catch(java.lang.NullPointerException w){
			System.out.println("null");
		}
		try{
			System.out.println(sinNombre.get("D", "A").toString());
		}catch(java.lang.NullPointerException w){
			System.out.println("null");
		}
		
		sinNombre.add(new Nodo("E"));
		sinNombre.add(new Nodo("F"));
		sinNombre.add(new Arco("F","F"));
		sinNombre.add(new Arco("B","F"));
		System.out.println();
		sinNombre.add(new Arco("A","F"));
		Object[] wut = sinNombre.getArcos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		System.out.println("\ngetInArcos");
		wut = sinNombre.getInArcos("F").toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		System.out.println("\ngetOutArcos");
		wut = sinNombre.getOutArcos("A").toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		System.out.println("\nNodos");
		try{
			System.out.println(sinNombre.get("A").toString());
		}catch(java.lang.NullPointerException w){
			System.out.println("null");
		}
		try{
			System.out.println(sinNombre.get("G").toString());
		}catch(java.lang.NullPointerException w){
			System.out.println("null");
		}
		
		System.out.println();
		wut = sinNombre.getNodos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		System.out.println();
		wut = sinNombre.getArcos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		System.out.println(sinNombre.remove("F", "F"));
		System.out.println(sinNombre.remove("B", "A"));
		
		wut = sinNombre.getArcos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		sinNombre.clear();
		sinNombre.add(new Nodo("A"));
		sinNombre.add(new Nodo("B"));
		sinNombre.add(new Nodo("C"));
		sinNombre.add(new Nodo("D"));
		
		sinNombre.add(new Arco("A","B"));
		sinNombre.add(new Arco("C","D"));
		sinNombre.add(new Arco("A","C"));
		sinNombre.add(new Arco("D","B"));
		
		wut = sinNombre.getNodos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		wut = sinNombre.getArcos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		sinNombre.remove("A");
		
		wut = sinNombre.getNodos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		wut = sinNombre.getArcos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		sinNombre.add(new Nodo("E"));
		sinNombre.add(new Nodo("F"));
		
		sinNombre.add(new Arco("B","B"));
		sinNombre.add(new Arco("B","D"));
		sinNombre.add(new Arco("D","B"));
		sinNombre.add(new Arco("E","F"));
		sinNombre.add(new Arco("F","B"));
		
		wut = sinNombre.getPreds("B").toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		System.out.println(sinNombre.getInDegree("B")+
				"---"+sinNombre.getOutDegree("B"));
		wut = sinNombre.getSucs("B").toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		sinNombre.remove("B","B");
		sinNombre.remove("D","B");
		sinNombre.remove("F","B");
		
		try{
		wut = sinNombre.getPreds("B").toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		}catch(java.lang.NullPointerException x){
			System.out.println("null");
		}
		System.out.println(sinNombre.getInDegree("B")+
				"---"+sinNombre.getOutDegree("B"));
		try{
			wut = sinNombre.getSucs("B").toArray();
			for(int i=0;i<wut.length;i++){
				System.out.println(wut[i].toString());
			}
		}catch(java.lang.NullPointerException x){
				System.out.println("null");
		}
		
		Digraph conNombre = (DigraphMatriz) sinNombre.clone();
		
		wut = sinNombre.getNodos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		wut = sinNombre.getArcos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		
		conNombre.remove("C");
		conNombre.remove("E", "F");
		
		wut = conNombre.getNodos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
		wut = conNombre.getArcos().toArray();
		for(int i=0;i<wut.length;i++){
			System.out.println(wut[i].toString());
		}
*/
		
		System.out.println();
		System.out.println("Inicio de la prueba de DigraphLista ");
		System.out.println();
		Digraph sinNombre = new DigraphLista();
		System.out.println(sinNombre.add(new Nodo("A")));
		System.out.println(sinNombre.add(new Nodo("B")));
		System.out.println(sinNombre.add(new Nodo("A")));
		System.out.println(sinNombre.add(new Arco("A","A")));
		System.out.println(sinNombre.add(new Nodo("D")));
		System.out.println(sinNombre.add(new Arco("B","B")));
		System.out.println(sinNombre.add(new Arco("A","D")));
		System.out.println(sinNombre.add(new Arco("D","D")));
		System.out.println(sinNombre.add(new Arco("B","B")));

		
		System.out.println("Contains ");
		System.out.println(sinNombre.contains("A", "D"));
		System.out.println(sinNombre.contains("D", "A"));
		System.out.println(sinNombre.contains("B", "A"));
		System.out.println(sinNombre.contains("A", "A"));
		System.out.println(sinNombre.contains("E", "F"));
		System.out.println(sinNombre.contains("E", "D"));
		System.out.println(sinNombre.contains("B", "B"));
		System.out.println(sinNombre.contains("D", "D"));
		System.out.println(sinNombre.contains("A"));
		
		System.out.println("Hice clear del grafo y reviso a ver si contiene cosas: ");
		sinNombre.clear();
		System.out.println();
		System.out.println(sinNombre.contains("A", "D"));
		System.out.println(sinNombre.contains("B", "B"));
		System.out.println(sinNombre.contains("D", "D"));
		System.out.println(sinNombre.contains("A", "B"));
		
		System.out.println("Agrego nodos y arcos nuevos: ");
		System.out.println(sinNombre.add(new Nodo("D")));
		System.out.println(sinNombre.add(new Nodo("B")));
		System.out.println(sinNombre.add(new Nodo("A")));
		System.out.println(sinNombre.add(new Arco("A","D")));
		System.out.println(sinNombre.add(new Arco("D","B")));
		System.out.println(sinNombre.add(new Arco("B","A")));
				
		
		System.out.println("Estoy eliminando: \n");
		System.out.println(sinNombre.remove("D","B"));
		System.out.println(sinNombre.remove("A","B"));
		System.out.println(sinNombre.remove("A"));
		
		sinNombre.clear();
		System.out.println("Agregue de nuevo lo que tenia al principio: ");
		System.out.println(sinNombre.add(new Nodo("A")));
		System.out.println(sinNombre.add(new Nodo("B")));
		System.out.println(sinNombre.add(new Nodo("A")));
		System.out.println(sinNombre.add(new Arco("A","A")));
		System.out.println(sinNombre.add(new Nodo("D")));
		System.out.println(sinNombre.add(new Arco("B","B")));
		System.out.println(sinNombre.add(new Arco("A","D")));
		System.out.println(sinNombre.add(new Arco("D","D")));
		System.out.println(sinNombre.add(new Arco("B","B")));
		
		MiLista<Nodo> listitaNoditos = new MiLista<Nodo>();
		MiLista<Arco> listitaArcos = new MiLista<Arco>();
		
		listitaArcos = (MiLista<Arco>) sinNombre.getOutArcos("A");
		listitaNoditos = (MiLista<Nodo>) sinNombre.getNodos();
		
		listitaArcos = (MiLista<Arco>) sinNombre.getInArcos("A");
		listitaArcos = (MiLista<Arco>) sinNombre.getArcos();
		
		listitaArcos.imprimirLista();
		listitaNoditos.imprimirLista();
		
		
		System.out.println("Veremos si la lista de los nodos contiene todos los nodos (A,B,D) y si no contiene el E: ");
		System.out.println(listitaNoditos.contains(new Nodo("A")));
		System.out.println(listitaNoditos.contains(new Nodo("B")));
		System.out.println(listitaNoditos.contains(new Nodo("D")));
		System.out.println(listitaNoditos.contains(new Nodo("E")));
		System.out.println();
		
		System.out.println("Veremos si la lista de arcos contiene todos los arcos, los ultimos 3 no pertenecen: ");


		int i = 0;
		boolean dummy = sinNombre.add(new Nodo(""+i));

		System.out.println(listitaArcos.contains(new Arco("A","A")));
		System.out.println(listitaArcos.contains(new Arco("B","B")));
		System.out.println(listitaArcos.contains(new Arco("A","D")));
		System.out.println(listitaArcos.contains(new Arco("D","D")));
		System.out.println(listitaArcos.contains(new Arco("F","U")));
		System.out.println(listitaArcos.contains(new Arco("A","E")));
		System.out.println(listitaArcos.contains(new Arco("B","Y")));
		
		Arco herp;
		Nodo derp;
		
		derp = sinNombre.get("A");
		herp = sinNombre.get("A","A");
		
		System.out.println(herp.toString());
		System.out.println(derp.toString());
	
		derp = sinNombre.get("F");
		herp = sinNombre.get("F","U");
		
		if (derp == null) {
			System.out.println("Derp es null!");
		}
		
		if (herp == null) {
			System.out.println("Herp es null!");
		}
		
		
		
		
		
		/*
		while(dummy && i<2001){
			i++;
			System.out.println(i+" "+sinNombre.add(new Nodo(""+i)));
		}
		
		System.out.println("Nodos");
		Object[] wut = sinNombre.getNodos().toArray();
		for(int j=0;j<wut.length;j++){
			System.out.println(wut[j].toString());
		}
		
		while(dummy && i != 1){
			i--;
			System.out.println(i+" "+sinNombre.add(new Arco(""+i,""+(i-1))));
		}
		
		System.out.println("Arcos");
		wut = sinNombre.getArcos().toArray();
		for(int j=0;j<wut.length;j++){
			System.out.println(wut[j].toString());
		}
		*/
	}	

}
