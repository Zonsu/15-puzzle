##Viikkoraportti 2

####Mitä tuli tehtyä:

Ohjelman rakennetta refaktoroitu edelleen hurjasti. Refaktorointi tulee jatkumaan edelleen sillä joissain luokissa on jäljellä aikamoinen siivo. Pelilautaan ja UI:hin liittyvät toiminnot eriytetty staattisiksi metodeiksi.

Itse toiminnallisuuksia aloin ensin viemään eteenpäin algoritmilla joka tarkistaa pelin aloitustilanteesta sen ratkaistavuuden. Algoritmi on tällä hetkellä hyvin yksinkertainen eikä huomaa todellakaan kaikkia ratkaisemattomia lautoja, mutta se on alku.

Ohjelman omaa tekoälyä aloin kehittämään perinteisellä syvyyshaulla, jolla on tukenaan muistina ArrayList. Syvyyshaku ei suostu ajamaan loppuun ja aiheuttaa stack overflown.

####Miten ohjelma on edistynyt:

Hitaammin kuin toivoisin. Omia tietorakenteita ei juurikaan ole eikä ohjelma vielä ole onnistunut ratkaisemaan kuin hyvin yksinkertaisen pelilaudan. Toisaalta olen kohtalaisen tyytyväinen ohjelman rakenteeseen ja uskon että sen päälle on helppo kehittää. Abtrakteja luokkia ja kapselointia pitäisi harrastaa enemmän.

Kaikki mikä on tällä hetkellä järkevää yksikkötestata ja dokumentoida on testattu ja dokumentoitu.

####Mitä opin:

Näin hieman jälkijunassa tuli oivallus siitä, kuinka ohjelman on mahdollista ratkaista tämänkaltainen palapeli. Vaikka en vielä saanutkaan rakennettua niitä algoritmeja mitä suunnittelin tälle viikolle, tuli ainakin rekursion periaatteet kerrattua hyvin huolellisesti. Hakualgoritmien tutkimista tuli myös tehtyä reilusti.


####Epäselvyyksiä:

Syvyyshaun rakennettuani ihmetyttää, miksi stackoverflow tulee niin nopeasti. Tiedän että syvyyshaku ei ole oikea ratkaisu ongelmaan, mutta silti sen muistin käyttö jää verrattaen pieneksi. Jatkan tutkimista.

IDA* edelleen hämärän peitossa. Näpertely jatkukoon.


####Mitä seuraavaksi:

IDA* tai vastaava algoritmi olisi hyvä viimeistään tässä vaiheessa saada aikaiseksi jotta pääsen toteuttamaan omia tietorakenteita. 