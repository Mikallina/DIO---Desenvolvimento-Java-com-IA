# Banco Digital em Java com POO

Este projeto pr�tico em Java explora os conceitos de Programa��o Orientada a Objetos (POO) para criar um sistema simulado de opera��es banc�rias, incluindo funcionalidades b�sicas como dep�sito, saque, transfer�ncia e consulta de extrato.

## Funcionalidades Implementadas

- **Dep�sito:** Permite ao usu�rio depositar um valor na conta corrente.
- **Saque:** Permite ao usu�rio sacar um valor da conta corrente, verificando o saldo dispon�vel.
- **Transfer�ncia:** Permite ao usu�rio transferir um valor da conta corrente para a conta poupan�a, verificando o saldo dispon�vel.
- **Extrato:** Exibe um hist�rico das transa��es realizadas, incluindo data, tipo (d�bito/ cr�dito), saldo resultante e coment�rios.

## Estrutura do Projeto

O projeto � dividido em duas principais classes:

1. **Operacoes.java**
   - Gerencia as opera��es banc�rias atrav�s das classes `ContaCliente`, `ContaCorrente` e `ContaPoupanca`.
   - Implementa uma interface gr�fica b�sica utilizando Swing para intera��o com o usu�rio.

2. **Extrato.java**
   - Respons�vel por exibir o extrato das transa��es em uma tabela (`JTable`).
   - Adiciona linhas ao extrato para opera��es de dep�sito, saque e transfer�ncia.

## Como Executar

1. **Clone o Reposit�rio:**
git clone https://github.com/Mikallina/DIO---Desenvolvimento-Java-com-IA

2. **Abra o Projeto:**
- Importe o projeto em um ambiente de desenvolvimento Java (Eclipse, IntelliJ, etc.).

3. **Compile e Execute:**
- Execute a classe `Operacoes.java` para iniciar o sistema.

4. **Interaja com o Sistema:**
- Utilize a interface gr�fica para realizar opera��es banc�rias simuladas.
- Verifique o extrato para visualizar o hist�rico das transa��es.

## Melhorias Propostas

Este projeto pode ser expandido com diversas melhorias:

- Implementa��o de autentica��o de usu�rio.
- Uso de bancos de dados para persist�ncia de dados das contas e transa��es.
- Adi��o de notifica��es para transa��es importantes.
- Melhoria da interface gr�fica para uma experi�ncia de usu�rio mais intuitiva.

## Conclus�o

O projeto de Banco Digital em Java com POO oferece uma oportunidade pr�tica para consolidar os conhecimentos em Programa��o Orientada a Objetos, explorando o contexto banc�rio atrav�s da implementa��o de um sistema simulado de opera��es banc�rias.