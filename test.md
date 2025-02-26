| ligne exécutée           | effet                                                      | pile d<appel  |
|--------------------------|------------------------------------------------------------|---------------|
| var a = 100                 | a= 100                                              | main()|
|          a += double(a) + (3 * triple(8))         | double(a) 100 =>x                                           |main()|
|val z = x * 2       |   z=200    | double()  <br/> main()  |
| return z            |renvois z                                       | double()  <br/> main()|
|  a += double(a) + (3 * triple(8))          | triple(8) a=>8                                     |main()|
|   return a * 3        | retourne 32                                      |triple()  <br/> main()|
| a += double(a) + (3 * triple(8))           | a= 100 + 200 + (3*24)     a= 372                                 |main()|
| println(a)           | affiche 372                                      |main()|
