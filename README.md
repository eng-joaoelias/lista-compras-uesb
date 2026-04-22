# 🛒 Sistema de Lista de Compras em Java

Este projeto consiste em um sistema de gerenciamento de lista de compras operado via terminal, desenvolvido como parte de uma **Prática Avaliativa de Estrutura de Dados**. O objetivo principal é demonstrar o domínio sobre manipulação de coleções dinâmicas (`ArrayList`), interação com usuário via console e a aplicação de conceitos fundamentais de POO, como encapsulamento e separação de responsabilidades.

---

## 📋 Requisitos do Projeto

O sistema foi desenvolvido seguindo rigorosamente as especificações técnicas descritas no roteiro da avaliação:

- **Manipulação de Dados:** Uso obrigatório de `ArrayList` sem o uso de *generics* (tipagem genérica).
- **Segurança de Tipos:** Implementação de *casting* manual para a classe de modelo ao recuperar objetos da lista.
- **Interatividade:** Menu de texto cíclico com operações de inserção, remoção, consulta e listagem.
- **Regras de Negócio:** Comparação de nomes de produtos de forma *case-insensitive* (ignorando maiúsculas e minúsculas).

---

## 🏗️ Arquitetura do Sistema

O projeto está organizado em três camadas principais para garantir a organização e facilidade de manutenção (padrão similar ao MVC):

### 1. Modelo (`model.ItemCompra`)
Representa a entidade básica do sistema.
- **Atributos:** Nome do produto (`String`) e quantidade (`int`).
- **Encapsulamento:** Todos os atributos são privados, acessados via métodos *getters* e *setters*.
- **Representação:** Sobrescrita do método `toString()` para exibição formatada dos dados do item.

### 2. Controle (`controller.ListaDeCompras`)
Contém a lógica de gerenciamento da coleção.
- Responsável por adicionar itens, remover por nome, buscar itens específicos e formatar a lista completa para a visão.
- Implementa a restrição de uso de `ArrayList` puro (sem `<ItemCompra>`).

### 3. Visão (`view.ComprasMain`)
Classe principal que contém o método `main`.
- Gerencia a interface com o usuário utilizando a classe `Scanner`.
- Exibe o menu interativo e valida a entrada de dados (incluindo a limpeza de buffer do teclado).

---

## 🚀 Funcionalidades

De acordo com as especificações exigidas:

1.  **Inserir Item:** Solicita nome e quantidade, cria o objeto e adiciona à lista.
2.  **Remover Item:** Localiza e remove um produto pelo nome exato, independentemente de como foi digitado (Maiúsculas/Minúsculas).
3.  **Consultar Item:** Verifica a existência de um produto na lista e exibe seus detalhes se encontrado.
4.  **Exibir Lista:** Lista todos os produtos cadastrados indicando sua posição (índice + 1) e detalhes.
5.  **Sair:** Finaliza a execução do programa com uma mensagem de despedida.

---

## 🛠️ Tecnologias Utilizadas

- [cite_start]**Linguagem:** Java 8+[cite: 1].
- [cite_start]**Biblioteca Base:** `java.util.ArrayList` e `java.util.Scanner`[cite: 9, 16].
- **Ferramenta de Construção:** IDE Eclipse/IntelliJ ou compilação via terminal (javac).

---

## 🔧 Como Executar

1. [cite_start]Clone este repositório ou baixe os arquivos `.java`[cite: 95].
2. Certifique-se de manter a estrutura de pacotes:
   - `src/model/ItemCompra.java`
   - `src/controller/ListaDeCompras.java`
   - `src/view/ComprasMain.java`
3. Compile os arquivos:
   ```bash
   javac model/*.java controller/*.java view/*.java
   ```
4. Execute o programa:
   ```bash
   java view.ComprasMain
   ```

---

## 📝 Critérios Técnicos Atendidos

- [x] [cite_start]Separação clara entre classes de modelo e lógica principal[cite: 85].
- [x] [cite_start]Uso de modificadores de acesso `private` para atributos[cite: 86].
- [x] [cite_start]Implementação de *Casting* manual: `ItemCompra item = (ItemCompra) lista.get(i);`[cite: 70].
- [x] [cite_start]Uso de `equalsIgnoreCase` para tratamento de strings[cite: 74].
- [x] [cite_start]Interface amigável e mensagens de confirmação ao usuário[cite: 91, 92].

---
[cite_start]**Desenvolvido como critério de avaliação acadêmica.** [cite: 75, 76]
