import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        String frutas1[] = new String[] {"Banana", "Morango", "Maça", "Uva"};
        //String frutas2[] = new String[] {"Banana", "Morango", "Maça", "Uva"};
        String frutas2[] = new String[] {"Pera", "Melão", "Kiwi", "Uva"};

        List<String> repetidas = new ArrayList<>();
        
        for(int i = 0; i<frutas1.length; i++){
            for(int j=0; j<frutas2.length; j++){
                if(frutas1[i] == frutas2[i] && !repetidas.contains(frutas1[i])){
                    repetidas.add(frutas1[i]);
                }
        }
        }
        System.out.println("As frutas repeditdas são:" + repetidas);
    }
}
