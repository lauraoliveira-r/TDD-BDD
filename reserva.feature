Feature: Reserva de carro por aplicativo

  Scenario: Reserva dentro da área de cobertura
    Given que o passageiro está em "Belo Horizonte" no endereço "Av. Afonso Pena"
    When ele solicitar uma reserva
    Then o sistema deve responder com "Motorista a caminho"

  Scenario: Reserva fora da área de cobertura
    Given que o passageiro está em "São Paulo" no endereço "Av. Paulista"
    When ele solicitar uma reserva
    Then o sistema deve responder com "Área fora de cobertura"
