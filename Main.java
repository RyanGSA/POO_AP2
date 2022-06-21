import br.ufc.quixada.poo.controller.UniversidadeController;
import br.ufc.quixada.poo.ui.TraineeUI;

public class Main {
    public static void main(String[] args) {

        UniversidadeController gerencia = new UniversidadeController();

        TraineeUI traineeUIMemoria = new TraineeUI(gerencia);
        traineeUIMemoria.run();
    }
}