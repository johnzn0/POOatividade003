# Lista de atividades — Herança, sobrecarga e sobrescrita em Java

Este repositório contém os 10 exercícios da atividade de Laboratório de Técnicas de Programação Orientada a Objetos.

## Organização
Cada exercício está em uma pasta própria e possui uma classe pública por arquivo. Não foram usados `package`, interfaces, classes abstratas, exceções ou listas prontas do Java, conforme as instruções do enunciado.

- `01-pet-shop`
- `02-escola`
- `03-papelaria`
- `04-clinica`
- `05-biblioteca`
- `06-lanchonete`
- `07-imobiliaria`
- `08-academia`
- `09-cinema`
- `10-transporte-escolar`

## Como executar
É necessário ter o JDK instalado. Abra o terminal dentro da pasta de um exercício e compile os arquivos:

```bash
javac *.java
```

Depois execute a classe de teste correspondente, por exemplo:

```bash
java TestePetShop
```

Cada pasta tem sua própria classe `Teste...` com o método `main`. Execute um exercício por vez, estando dentro da pasta dele.

## Conceitos usados
- **Herança:** as classes específicas usam `extends` para herdar da classe geral.
- **Construtores:** as subclasses chamam `super(...)` como primeira instrução.
- **Sobrescrita:** métodos especializados usam `@Override`.
- **Sobrecarga:** métodos com o mesmo nome e parâmetros diferentes ficam na superclasse.
- **Polimorfismo:** os objetos são guardados em vetores do tipo da superclasse e percorridos com `for`.

Os valores e textos seguem as especificações e saídas ilustrativas do arquivo da atividade.
