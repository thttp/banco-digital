# Banco Digital

Este projeto implementa um sistema simples de banco digital utilizando Java e Spring Boot. O sistema oferece dois tipos de contas: Conta Corrente e Conta Poupança, cada uma com funcionalidades básicas como depósito, saque e transferência entre contas do mesmo banco.

## Funcionalidades Implementadas

- **Conta Corrente**
  - Depósito
  - Saque (incluindo limite do cheque especial)
  - Transferência para outras contas do mesmo banco

- **Conta Poupança**
  - Depósito
  - Saque
  - Aplicação de rendimento mensal
  
## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **`src/main/java/com/thttp/banco_digital/`**: Contém todas as classes Java do projeto.
  - **`model/`**: Classes que definem os modelos de Conta Corrente e Conta Poupança.
  - **`exception/`**: Classes de exceção customizadas para operações financeiras.
  - **`util/`**: Classes utilitárias, como `InputHelper` para entrada de dados via console.
  - **`BancoDigitalApp.java`**: Ponto de entrada da aplicação.
  - **`Conta.java`**: Classe base para contas, com métodos comuns como depósito, saque e transferência.
  - **`ContaCorrente.java`**: Classe que estende `Conta`, representando uma conta corrente com limite de cheque especial.
  - **`ContaPoupanca.java`**: Classe que estende `Conta`, representando uma conta poupança com taxa de rendimento.
- **`src/main/resources/`**: Recursos estáticos, como arquivos de configuração.
  - **`application.properties`**: Configurações do Spring Boot.

## Pré-requisitos

Para executar este projeto localmente, você precisa ter instalado:
- Java JDK 11 ou superior
- Maven
- Um IDE de sua preferência (recomendado: VSCode, IntelliJ IDEA, Eclipse)

## Como Executar

1. Clone este repositório: `git clone https://github.com/seu-usuario/banco-digital.git`

4. Importe o projeto em seu IDE como um projeto Maven existente.

5. Aguarde o IDE baixar as dependências do Maven.

6. Execute a classe `BancoDigitalApp.java` como uma aplicação Java.

7. Siga as instruções no console para interagir com o sistema bancário (exemplo: depósito, saque, transferência).

## Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.
