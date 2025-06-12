package runner;

import org.junit.jupiter.api.Test;
import reserva.ReservaService;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaServiceTest {

    private final ReservaService reservaService = new ReservaService();

    @Test
    public void testReservaDentroDaArea() {
        String resultado = reservaService.reservar("Belo Horizonte", "Av. Afonso Pena");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testReservaForaDaArea() {
        String resultado = reservaService.reservar("São Paulo", "Av. Paulista");
        assertEquals("Área fora de cobertura", resultado);
    }
}
