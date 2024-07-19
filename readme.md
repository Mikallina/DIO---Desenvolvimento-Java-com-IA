# Banco Digital em Java com POO

Este projeto prático em Java explora os conceitos de Programação Orientada a Objetos (POO) para criar um sistema simulado de operações bancárias, incluindo funcionalidades básicas como depósito, saque, transferência e consulta de extrato.

## Funcionalidades Implementadas

- **Depósito:** Permite ao usuário depositar um valor na conta corrente.
- **Saque:** Permite ao usuário sacar um valor da conta corrente, verificando o saldo disponível.
- **Transferência:** Permite ao usuário transferir um valor da conta corrente para a conta poupança, verificando o saldo disponível.
- **Extrato:** Exibe um histórico das transações realizadas, incluindo data, tipo (débito/ crédito), saldo resultante e comentários.

## Estrutura do Projeto

O projeto é dividido em duas principais classes:

1. **Operacoes.java**
   - Gerencia as operações bancárias através das classes `ContaCliente`, `ContaCorrente` e `ContaPoupanca`.
   - Implementa uma interface gráfica básica utilizando Swing para interação com o usuário.

2. **Extrato.java**
   - Responsável por exibir o extrato das transações em uma tabela (`JTable`).
   - Adiciona linhas ao extrato para operações de depósito, saque e transferência.

## Como Executar

1. **Clone o Repositório:**
git clone https://github.com/Mikallina/DIO---Desenvolvimento-Java-com-IA

2. **Abra o Projeto:**
- Importe o projeto em um ambiente de desenvolvimento Java (Eclipse, IntelliJ, etc.).

3. **Compile e Execute:**
- Execute a classe `Operacoes.java` para iniciar o sistema.

4. **Interaja com o Sistema:**
- Utilize a interface gráfica para realizar operações bancárias simuladas.
- Verifique o extrato para visualizar o histórico das transações.

## Melhorias Propostas

Este projeto pode ser expandido com diversas melhorias:

- Implementação de autenticação de usuário.
- Uso de bancos de dados para persistência de dados das contas e transações.
- Adição de notificações para transações importantes.
- Melhoria da interface gráfica para uma experiência de usuário mais intuitiva.

## Conclusão

O projeto de Banco Digital em Java com POO oferece uma oportunidade prática para consolidar os conhecimentos em Programação Orientada a Objetos, explorando o contexto bancário através da implementação de um sistema simulado de operações bancárias.