package steps;

import reserva.ReservaService;
import io.cucumber.java.pt.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaSteps {

    private ReservaService reservaService;
    private String cidade;
    private String endereco;
    private String resposta;

    @Dado("que o passageiro está em {string} no endereço {string}")
    public void queOPassageiroEstaEmNoEndereco(String cidade, String endereco) {
        this.cidade = cidade;
        this.endereco = endereco;
        this.reservaService = new ReservaService();
    }

    @Quando("ele solicitar uma reserva")
    public void eleSolicitarUmaReserva() {
        resposta = reservaService.reservar(cidade, endereco);
    }

    @Entao("o sistema deve responder com {string}")
    public void oSistemaDeveResponderCom(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resposta);
    }
}
