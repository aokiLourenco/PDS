A empresa TodosFazem (TF) pretende fazer uma gestão dinâmica de funcionários de forma a 
poder atribuir responsabilidades diversas ao longo do ano.

a) Usando como base as entidades seguintes, criando outras se necessário, construa uma 
solução que permita à empresa gerir empregados e poder atribuir dinamicamente, a 
cada um, competências distintas. Note que um empregado pode, eventualmente, ter 
ao mesmo tempo várias competências, por exemplo ser TeamMember e TeamLeader. 

b) Crie um programa principal para testar a solução. Por simplicidade pode implementar 
os métodos apenas com mensagens na consola. 

```
Employee  
  start (Date) 
  terminate(Date) 
  work() 

TeamMember 
  start (Date) 
  terminate(Date) 
  work() 
  colaborate() 

TeamLeader 
  start (Date) 
  terminate(Date) 
  work() 
  plan() 

Manager 
  start (Date) 
  terminate(Date) 
  work() 
  manage()
```