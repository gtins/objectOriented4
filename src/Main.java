import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Veiculo fuca = new Veiculo();
        fuca.setModelo("Volkswagen");
        fuca.setCor("Preto");
        fuca.setPlaca("ARY-1987");

        Carreta carreta = new Carreta();
        carreta.setCor("Azul");
        carreta.setModelo("Scania Highline");
        carreta.setPlaca("3489");

        List<Veiculo> estacionamento = new LinkedList<>();
        estacionamento.add(fuca);
        estacionamento.add(carreta);

        for (Veiculo item:estacionamento
             ) {
            System.out.println(item);
        }

    }
}