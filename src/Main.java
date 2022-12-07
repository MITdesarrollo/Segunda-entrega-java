import Personas.Persona;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //instancias de Persona

        Persona persona1 = new Persona("lolo", "gomez");
        Persona persona2 = new Persona("lola", "perez");
        Persona persona3 = new Persona("lula", "fernandez");
        Persona persona4 = new Persona("lilo", "torres");
        Persona persona5 = new Persona("lalo", "suarez");

        List<Persona> listaDePersonas = new ArrayList<>();
        listaDePersonas.add(persona1);
        listaDePersonas.add(persona2);
        listaDePersonas.add(persona3);
        listaDePersonas.add(persona4);
        listaDePersonas.add(persona5);


        listaDePersonas.sort(Comparator.comparing(Persona::getNombre));
        imprimirPersonas(listaDePersonas, true);

        listaDePersonas.sort(Comparator.comparing(Persona::getApellido));
        imprimirPersonas(listaDePersonas, false);

        listaDePersonas.sort(Comparator.comparing(Persona::getApellido).reversed());
        imprimirPersonas(listaDePersonas, false);
    }
    public static void imprimirPersonas(List<Persona> lista, boolean mostrarNombres){
        System.out.println("---------------------------");
        for (int i = 0; i < lista.size(); i++){
            if (mostrarNombres == true){
                System.out.println(lista.get(i).getNombre());
            }else{
                System.out.println(lista.get(i).getApellido());
            }

            };
    }

}