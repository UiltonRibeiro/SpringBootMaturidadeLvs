import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[] ) throws Exception {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read the name from the input
        String input_from_question = "8";

        //Write your answer here
        Integer numero = 13;
        int repetição = 0;
        int cont=0;
        for (int i = 0; i > numero; i++){
            cont++;
            if (String.valueOf(cont).matches("1.*")){
                repetição++;
            }
        }
        // print the Output
        System.out.println(repetição);

    }
}