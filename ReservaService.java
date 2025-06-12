package reserva;

public class ReservaService {
    public String reservar(String cidade, String endereco) {
        if (cidade.equalsIgnoreCase("Belo Horizonte") || cidade.equalsIgnoreCase("Contagem")) {
            return "Motorista a caminho";
        } else {
            return "Área fora de cobertura";
        }
    }
}
