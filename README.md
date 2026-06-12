# Calculadora - Java

Este e mais um projeto integrado ao meu portfolio pessoal, desenvolvido para fixar os conceitos de Java puro, Orientacao a Objetos e recursos modernos da linguagem que estou aprendendo no Bootcamp Santander 2026 - AI Java Back-end.

O objetivo foi pegar uma calculadora estrutural simples e evolui-la para uma arquitetura limpa, eficiente e blindada contra erros de input do usuario.

---

## 🛠️ Tecnologias e Recursos Utilizados

* **Java 21:** Versao utilizada para aplicar os recursos mais recentes da linguagem.
* **Enums (Enumerations):** Centraliza e padroniza a lista de operacoes aceitas (SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO, POTENCIA, INVALIDA), eliminando o uso perigoso de Strings soltas que causavam erros caso o usuario digitasse com espacos ou letras maiusculas.
* **Switch Expressions (Java 14+):** Logica de selecao de calculo muito mais limpa e segura, eliminando a verbosidade do switch antigo e evitando a execucao acidental de blocos de codigo por falta de 'break'.
* **Tratamento de Excecoes (Try-Catch):** O sistema intercepta erros de digitacao silenciosamente atraves do metodo valueOf(), impedindo que a aplicacao lance um IllegalArgumentException e trave na cara do usuario.
* **Controle de Casos de Borda:** Validacoes estruturadas para impedir divisoes por zero e outras indeterminacoes matematicas conhecidas.

---

## 🏎️ O que aprendi sobre Eficiencia e Boas Praticas

* **Separacao de Responsabilidades:** O Enum Operacao atua puramente como um tradutor isolado de texto, enquanto a classe principal Calculadora assume o controle total das mensagens e interacao de entrada e saida com o terminal.
* **Processamento Inteligente:** No modelo antigo, todas as operacoes eram calculadas simultaneamente antes de checar a escolha do usuario. Com o Switch Expression moderno, a CPU executa estritamente a conta que foi solicitada, economizando recursos e processamento desnecessario.
* **Precisao Numerica:** Substitui o tipo int por double nas variaveis de calculo para garantir que operacoes com casas decimais (como 5 / 2) nao sofram cortes incorretos de informacao e entreguem o resultado exato de 2.5.

---

## 🚀 Como Executar o Projeto

1. Garanta que voce possui o SDK do Java 21 ou superior instalado em sua maquina.
2. Clone este repositorio:
   ```bash
   git clone [https://github.com/Rafa-Shafie/calculadora-java.git](https://github.com/Rafa-Shafie/calculadora-java.git)
