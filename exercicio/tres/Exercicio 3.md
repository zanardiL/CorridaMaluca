# Exercício 03 
## :racing_car: Classe CarroCorrida
### Atributos:
- numeroCarro : int
- piloto : Piloto
- velocidadeMaxima : float
- velocidadeAtual : float
- ligado : boolean

### Métodos:

+ "Construtor"
+ set... (alterar atributos da Classe - "Modificadores")
+ get... (retorna valores dos atributos da Classe - "Acessores")
+ acelerar(float) - aumenta unidades em Km/h
+ frear(float) - reduz a velocidade em percentual (%) de frenagem
+ parar()
+ ligar()
+ desligar()

#### Observações:
- Não ultrapassar a velocidade máxima
- Frear e Acelerar só funcionam se o carro estiver ligado
- Desligar só funciona se o carro estiver parado

## :woman_pilot: Classe Piloto
### Atributos:
- nome : int
- idade : String
- sexo : Enum
- equipe : String
- 
### Métodos:
- "Construtor"
- set... (alterar atributos da Classe - "Modificadores")
- get... (retorna valores dos atributos da Classe - "Acessores")