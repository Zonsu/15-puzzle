##Viikkoraportti 1

####Mitä tuli tehtyä:

Kiireinen viikko joten kaikki tehty yhdessä pyrähdyksessä ja palautettu hieman myöhässä. Tuskastelin pitkään koodamisen aloittamisen kanssa vaikka projektia tulikin mietittyä ja siitä keskusteltua.

Suurinta ongelmaa edusti se, miten toteutan pelilaudan simuloinnin niin, että siirrot on mahdollisimman helppo suorittaa. Monissa paikoissa ehdotettiin kaksiulotteista listaa, mutta en halunnut lähteä sitä toteuttamaan. Rakensin aluksi verkkoa jossa jokainen ruutu oli oma olionsa ja joka tunsi viereiset ruutunsa. Huomasin kuitenkin pian ratkaisun epäkäytännöllisyyden ja löysin tavan havainnollistaa pelilautaa yksiulotteisella listalla tarkastelemalla indeksien suhteita toisiinsa.

Loppu aika tulikin käytettyä dokumentointiin, manuaaliseen ja automaattiseen testaamiseen, sekä ratkaisun refaktorointiin useampaan kertaan. Toistaiseksi olen tyytyväinen pelilautani toimintaan vaikka se vielä vähän tynkä onkin.

####Miten ohjelma on edistynyt:

Toteutin tällä viikolla ohjelmaan 15-puzzle pelin, johon voidaan syöttää pelilauta ja joka voidaan pelata läpi komentoriviä käyttäen. Tämä tuli toteutettua melkeinpä vahingossa pelin toimintaa tarkastellessa. Mitään tekoälyä ei ohjelmalla vielä ole.

####Mitä opin:

Suurin välähdys tuli pelilaudan havainnollistamisen kanssa. Aivot olivat pitkään solmussa näinkin yksinkertaisen asian kanssa. Opin kuitenkin (taas kerran) että tekemällä ja kokeilemalla tulee niitä oivalluksia. Opin myös kuinka yksinkertainen toteutustapa palkitsee kun oman koodin ja ajattelutavan ymmärtämiseen ei tarvitse käyttää aikaa ja voi sen sijaan keskittyä loogisten ongelmien ratkaisemiseen.

Opin myös että jumissa ollessa kannattaa pyytää asiasta jonkun kanssa. Vaikka saisikin myös huonoja neuvoja, ajatusten pallottelu vie asiaa eteenpäin.

####Epäselvyyksiä:

Näitä riittää vielä. Olen ajatella kokeilla ongelman ratkaisuun IDA* algortimia, mutta sen ymmärtäminen on vielä hyvin yleisellä tasolla. Sitä lähden tutkimaan seuraavaksi. Myös tietorakenteiden itse toteuttaminen jännittää.

####Mitä seuraavaksi:

Seuraavaksi lähden toteuttamaan pelin automaattista ratkaisua. Ensin toteutan algoritmin jolla peli löytää ainakin osan pelilaudoista jotka eivät ole ratkaistavissa. Halusin toteuttaa tämän jo tällä viikolla mutta se jäi haaveeksi. Tämän jälkeen lähden rakentamaan IDA* algoritmia jollain yksinkertaisella heuristiikalla, tai vähintään haluan löytää jonkinlaisen tavan ratkaista peli automaattisesti.
