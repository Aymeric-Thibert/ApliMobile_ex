| ligne exécutée           | effet                                                      | pile d'affaire |
|--------------------------|------------------------------------------------------------|----------------|
| val a = 100                    | a = 100                                                   | main()|
| a += double(a) + (3 * triple(8))                  | a= 100 appelle double 100 => x                                         |main()|
| val z = x*2            | x=100  z= 100*2 z=200                                   |      double() <br /> main()|
| return z            | retourne la valeur z z=200                                       | double() <br /> main()|
| a += double(a) + (3 * triple(8))            |  appelle triple(8)                                      |main()|
| return a*3            | a = 8     return 24                                  |triple() <br /> main()|
|    a += double(a) + (3 * triple(8))    | calcul a <br /> 100 + (3*24) + 200 = 372  <br /> a=372                                    |main()|
| println(a)           | on print a qui est égal à 372                                     |main()|
