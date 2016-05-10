package boletin31;

import java.util.ArrayList;

public class Boletin31 {

    public static void main(String[] args) {
        
        ArrayList <SeleccionFutbol> lista = new ArrayList();
        
        SeleccionFutbol futbolista1 = new Futbolista(1,26,"Defensa",33,"John","Terry");
        SeleccionFutbol futbolista2 = new Futbolista(2,11,"Delantero",23,"John", "Guidetti");
        SeleccionFutbol masajista1 = new Masajista(3,"Masajista",15, 57,"Alberto","Lopez");
        SeleccionFutbol entrenador = new Entrenador(4,1111,43,"Eduardo","Berizzo");
        
        lista.add(entrenador);
        lista.add(masajista1);
        lista.add(futbolista1);
        lista.add(futbolista2);
        
       for (int i=0;i<lista.size();i++){
           System.out.println(lista.get(i).toString());
    }
        
    }
    
}
