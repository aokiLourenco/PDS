## Chain of responsibility - Chef lab10.ex2

Serve para atribuir uma certa resposibilidade específica a cada classe.

**Request** -> Handler -> Handler -> Handler -> **Ordering System**

Interface/abstract class -> concrete Handlers (extends abstract class) <- Client/Main faz o pedido para o primeiro concrete Handler da chain.

![alt text](images/image1.png)

## Command - Command lab10.ex3

Comando específico para uma TV o Invoker pode chamar vários butões do comando e o Comando executa os comandos de cada botão.

![alt text](images/image.png)