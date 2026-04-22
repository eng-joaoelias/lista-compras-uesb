# 🛒 Sistema de Lista de Compras em Java

Este projeto consiste em um sistema de gerenciamento de lista de compras operado via terminal, desenvolvido como parte de uma **Prática Avaliativa de Estrutura de Dados**. O objetivo principal é demonstrar o domínio sobre manipulação de coleções dinâmicas (`ArrayList`), interação com usuário via console e a aplicação de conceitos fundamentais de POO, como encapsulamento e separação de responsabilidades.

---

## 📋 Requisitos do Projeto

[cite_start]O sistema foi desenvolvido seguindo rigorosamente as especificações técnicas descritas no roteiro da avaliação[cite: 4]:

- [cite_start]**Manipulação de Dados:** Uso obrigatório de `ArrayList` sem o uso de *generics* (tipagem genérica)[cite: 9, 69].
- [cite_start]**Segurança de Tipos:** Implementação de *casting* manual para a classe de modelo ao recuperar objetos da lista[cite: 70, 83].
- [cite_start]**Interatividade:** Menu de texto cíclico com operações de inserção, remoção, consulta e listagem[cite: 10, 37].
- [cite_start]**Regras de Negócio:** Comparação de nomes de produtos de forma *case-insensitive* (ignorando maiúsculas e minúsculas)[cite: 48, 74].

---

## 🏗️ Arquitetura do Sistema

O projeto está organizado em três camadas principais para garantir a organização e facilidade de manutenção (padrão similar ao MVC):

### 1. Modelo (`model.ItemCompra`)
[cite_start]Representa a entidade básica do sistema[cite: 23].
- [cite_start]**Atributos:** Nome do produto (`String`) e quantidade (`int`)[cite: 25, 26, 27].
- [cite_start]**Encapsulamento:** Todos os atributos são privados, acessados via métodos *getters* e *setters*[cite: 30, 86].
- [cite_start]**Representação:** Sobrescrita do método `toString()` para exibição formatada dos dados do item[cite: 64, 93].

### 2. Controle (`controller.ListaDeCompras`)
[cite_start]Contém a lógica de gerenciamento da coleção[cite: 20].
- [cite_start]Responsável por adicionar itens, remover por nome, buscar itens específicos e formatar a lista completa para a visão[cite: 38, 61].
- [cite_start]Implementa a restrição de uso de `ArrayList` puro (sem `<ItemCompra>`)[cite: 69].

### 3. Visão (`view.ComprasMain`)
[cite_start]Classe principal que contém o método `main`[cite: 34, 35].
- [cite_start]Gerencia a interface com o usuário utilizando a classe `Scanner`[cite: 16, 88].
- [cite_start]Exibe o menu interativo e valida a entrada de dados (incluindo a limpeza de buffer do teclado)[cite: 37, 89].

---

## 🚀 Funcionalidades

[cite_start]De acordo com as especificações exigidas[cite: 38]:

1.  [cite_start]**Inserir Item:** Solicita nome e quantidade, cria o objeto e adiciona à lista[cite: 39, 43, 44].
2.  [cite_start]**Remover Item:** Localiza e remove um produto pelo nome exato, independentemente de como foi digitado (Maiúsculas/Minúsculas)[cite: 46, 48, 50].
3.  [cite_start]**Consultar Item:** Verifica a existência de um produto na lista e exibe seus detalhes se encontrado[cite: 54, 57, 58].
4.  [cite_start]**Exibir Lista:** Lista todos os produtos cadastrados indicando sua posição (índice + 1) e detalhes[cite: 61, 64].
5.  [cite_start]**Sair:** Finaliza a execução do programa com uma mensagem de despedida[cite: 65, 66].

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
