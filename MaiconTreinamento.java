import java.util.Locale;
import java.util.Scanner;

public class MaiconTreinamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).uselocale(Locale.us);

        System.out.println("Esolha um desses Nomes pela sigla: ");
        String Maicon = "M";
        String Juliane ="J";
        String Teresa= "T";

        System.out.println("Maicon - SIGLA (M)");
        System.out.println("Juliane - SIGLA (J)");
        System.out.println("Teresa - SIGLA (T)");

        switch ("") {
            case "M":{
                System.out.println("Você escolheu o Maicon!");
                break;
            }

            case "J":{
                System.out.println("Você escolheu a Juliane!");
                break;
            }

            case "T":{
                System.out.println("Você escolheu a Teresa!");
                break;
            }
                
                break;
        
            default:
                break;
        }
    }
}
