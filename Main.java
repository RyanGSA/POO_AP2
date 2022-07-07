//Ryan Gonçalves Souza Araújo 508281
//Francisco Gabriel da Silva Lima 514586
import br.ufc.quixada.poo.controller.GerenciaUniversidade;
import br.ufc.quixada.poo.controller.UniversidadeController;
import br.ufc.quixada.poo.ui.TraineeGUI;

public class Main {
    public static void main(String[] args) {

        GerenciaUniversidade gerencia = new UniversidadeController();
        new TraineeGUI( gerencia );
    }
}