#15-puzzle solver määrittelydokumentti

##Ongelma
[15-peli](http://fi.wikipedia.org/wiki/15-peli)

Ongelmana on pystyä ratkaisemaan 15-peli mahdollisimman vähillä siirroilla, sekä tunnistaa aikaisessa vaiheessa laudat jotka eivät ole ohjelman ratkaistavissa. 

>"Jokainen mahdollinen tapa, jolla laatat voidaan sijoittaa kehykseen, vastaa yhtä 16-alkioisen joukon permutaatiota. Tällaisia tapoja on kaikkiaan 16! = 20 922 789 888 000 (yli 20 biljoonaa), mutta vain puolet näistä asetelmista on sellaisia, että tehtävä on ratkaistavissa, tehtiinpä kuinka monta siirtoa tahansa." [1]

##Algoritmit ja tietorakenteet

**Algoritmit:**

* Inversioiden laskeminen.
>"Inversioksi lasketaan jokainen kahden numero­laatan pari, jossa suurempi luku on ennen pienempää. Mikäli tyhjä ruutu on alimmalla rivillä, asetelma on ratkaistavissa, jos ja vain jos inversioiden lukumäärä on parillinen" [1]

* [Iterative Deepening A* (IDA*) -algotritmi](http://en.wikipedia.org/wiki/Iterative_deepening_A*) [3][4]
* [Manhattan Distance](http://heuristicswiki.wikispaces.com/Manhattan+Distance)
* Heapsort

**Tietorakenteet:**

* Lista
* PrirorityQueue
* Keko
* Binäärihakupuu

Inversioiden laskemisella voimme tunnistaa pelilaudan, joka ei ole ratkaistavissa. IDA* on polunhaku -algoritmi, jolla pyritään löytämään numeron reitti sille määrättyyn ruutuun mahdollisimman vähillä siirroilla. Algoritmin parina käytetään "Manhattan Distance" heuristiikkaa, jolla pystytään määrittämään lyhyin matka kahden ruudun välillä ja määrittämään siirtojen "hintaa".[5][6] Muita heuristiikkoja tullaan mahdollisesti tarkastelemaan ja vertailemaan.


##Syötteet

Ohjelmalle voidaan antaa syötteenä pelilauta joka halutaan ratkaista. Sitä voidaan myös pyytää generoimaan oma lauta, joko täysin mielivaltaisessa järjestyksessä oleva tai sellainen, jonka se pystyy ratkaisemaan.

##Aika- ja tilavaativuudet

**Heapsort** Aika: O(nlog(n))

**Keko** Aika kaikille operaatioille: O(logn) Tila: O(n)

**IDA*** 
Aika: Exp [7] Tila: O(1) 

Täydennetään myöhemmin.

##Lähteet
[1] Wikpedia: 15-peli: [http://fi.wikipedia.org/wiki/15-peli](http://fi.wikipedia.org/wiki/15-peli)

[2] wikiHow: How to Solve a Fifteen Puzzle: [http://www.wikihow.com/Solve-a-Fifteen-Puzzle](http://www.wikihow.com/Solve-a-Fifteen-Puzzle)

[3] Wikipedia: Iterative Deepening A*: [http://en.wikipedia.org/wiki/Iterative_deepening_A*](http://en.wikipedia.org/wiki/Iterative_deepening_A*)

[4] Brian Boroski: Optimal 8/15-Puzzle Solver [http://www.brian-borowski.com/software/puzzle/](http://www.brian-borowski.com/software/puzzle/)

[5] HeuristicWiki: Manhattan Distance [http://heuristicswiki.wikispaces.com/Manhattan+Distance](http://heuristicswiki.wikispaces.com/Manhattan+Distance)

[6] HeuristicWiki: IDA* [http://heuristicswiki.wikispaces.com/IDA*](http://heuristicswiki.wikispaces.com/IDA*)

[7] University of Washington: Iterative Deepening A* (IDA*) Search: Rough Algorithm from LISP [http://courses.cs.washington.edu/courses/cse415/06wi/notes/IDA.pdf](http://courses.cs.washington.edu/courses/cse415/06wi/notes/IDA.pdf)