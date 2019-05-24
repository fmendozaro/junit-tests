import java.util.Arrays;

public class Kitchen {

    String[] tortillas;

    public Kitchen(){
        this.tortillas = new String[0];
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public void add(String tortilla){
        String[] copy = Arrays.copyOf(tortillas, this.size()+1);
        copy[this.size()] = tortilla;
        tortillas = copy;
    }

    public void pop(){
        tortillas[this.size()-1] = null;
        String[] copy = Arrays.copyOf(tortillas, this.size()-1);
        tortillas = copy;
    }

    public boolean contains(String tortilla){
        for (int i = 0; i < this.size(); i++){
            if(tortillas[i].equals(tortilla))
                return true;
        }
        return false;
    }
    
    public void printAll(){
        for (int i = this.size()-1; i >= 0; i--){
            System.out.println("tortillas["+i+"] " + tortillas[i]);
        }
    }

    public int size() {
        return tortillas.length;
    }
}
