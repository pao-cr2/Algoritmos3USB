
public class Diccionario{

        private DynamicArray box;
        private DynamicArray index;
        private int tamano = 0;
        
        public Diccionario(){
                this.box = new DynamicArray();
                this.index = new DynamicArray();
                this.tamano = 0;                
        }
        
        public void agregar(Object clave, Object valor){          
                this.index.addFinal(clave);
                this.box.addFinal(valor);
                this.tamano++;
                
        }
        
        public Object buscar(Object clave){
                int i = 0;
                
                while(this.index.getArray()[i] != clave && i != this.tamano){
                        i++;
                }
                
                if (this.index.getArray()[i] == clave){
                        return this.box.getArray()[i];
                }
                return null;
                
        }

        public String toStrings(){
                byte i;
                String todo = "";
                for(i=0;i<this.tamano;i++){
                        todo = todo + this.box.getArray()[i].toString() + "\n";
                }

                return todo;
        }
}