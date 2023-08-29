# Dio-Trilha-Java-Básico
Projeto Java Básico.

#### Autores
[Henrique Erinaldo](https://github.com/henriqueerds/dio-trilha-java-basico)

## Desafio
Projeto Java Básico que receberá dados via terminal contendo as características de conta bancária ficticia e recebendo uma resposta via terminal.

1. Foi criado uma classe `ContaBranco.java` onde recebera dados via terminal digitado pelo usuário, contendo as características de conta em banco conforme atributos abaixo:
2. Na classe `ContaTerminal.java` contem os atributos e os Getters e Setters onde será chamado pela classe `Main`.

###### Os Atributos e os Tipos da Classe `ContaTerminal.java`
| Atributos | Tipos    |
|-----------|----------|
| Numerico  | Inteiro  |
| Agência   | String   |
| Nome do Cliente| String |
| Saldo     | Double   |

###### Import Utilizados
Foi utilizado a Classe Scanner. A classe Scanner (pertencente à biblioteca java. util) tem um método (nextLine()) cujo principal objetivo é “extrair” informações dadas pelo utilizador.

```java
import java.util.Scanner;
 
Scanner scanner = New Scanner();
```
3.Depois de todas as informações terem sido inseridas e rodar o código, o sistema exibirá a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] aparecerão os dados que inseridas pelos usuários.


