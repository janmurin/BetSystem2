# BetSystem2
java app for processing raw bet events data into usable json DB, simulating betting strategies

Program zjednocuje predpovedane kurzy na sportove zapasy s ich vysledkami a vytvara z nich json databazu, kde jedna polozka obsahuje sportovu udalost, predpovedany kurz a true/false hodnotu podla toho ci predpovedana udalost nastala.

Priklad mergovanych suborov: [today&#95;bet&#95;offer2016-03-31.pdf](http://jmurin.sk/files/today_bet_offer2016-03-31.pdf) a [vysledky2016-03-31.txt](http://jmurin.sk/files/vysledky2016-03-31.txt)

**Pipelina:**
 
1. skonvertovat subor s vysledkami pouzitim ```VysledkyRaw2utf8.java```
2. manualne nakopirovat v Adobe PDF readeri predpovedane kurzy do textoveho suboru
3. opravit nakopirovane kurzy pouzitim ```KurzySuborOpravator.java```, pripadne opravit chyby v suboroch
4. pouzitim ```DBRaw2DBClean.java``` vytvorit prvotny merge zo ziskanych textovych vstupnych dat
5. zavolanim ```Text2JsonParser.java``` sa z raw databazy vytvori cista DB kurzov

Priklad vyslednej databazy: 

[prikladDB.txt](http://jmurin.sk/files/prikladDB.txt)

alebo:

```
[
    {
        "sport": "Terno dňa",
        "liga": "Futbal",
        "typEventu": "Zápas",
        "date": "2014-11-25",
        "competitors": "4 CSKA Moskva-AS Roma                          1:1                  0                  18:00 _ CSKA Moskva-AS Roma (nL) 2.9 3.35 2.5 18:00",
        "kurz": "2.9",
        "vyherny": "false",
        "poznamka": "1"
    },
    {
        "sport": "Terno dňa",
        "liga": "Futbal",
        "typEventu": "Zápas",
        "date": "2014-11-25",
        "competitors": "4 CSKA Moskva-AS Roma                          1:1                  0                  18:00 _ CSKA Moskva-AS Roma (nL) 2.9 3.35 2.5 18:00",
        "kurz": "3.35",
        "vyherny": "true",
        "poznamka": "0"
    },
    {
        "sport": "Terno dňa",
        "liga": "Futbal",
        "typEventu": "Zápas",
        "date": "2014-11-25",
        "competitors": "4 CSKA Moskva-AS Roma                          1:1                  0                  18:00 _ CSKA Moskva-AS Roma (nL) 2.9 3.35 2.5 18:00",
        "kurz": "2.5",
        "vyherny": "false",
        "poznamka": "2"
    },
    {
        "sport": "Terno dňa",
        "liga": "Hokej",
        "typEventu": "Zápas",
        "date": "2014-11-25",
        "competitors": "5 Vítkovice-Sparta                             2:2                  0                  17:00 _ Vítkovice-Sparta (nL) 3.05 4.15 2.1 17:00",
        "kurz": "3.05",
        "vyherny": "false",
        "poznamka": "1"
    },
    {
        "sport": "Terno dňa",
        "liga": "Hokej",
        "typEventu": "Zápas",
        "date": "2014-11-25",
        "competitors": "5 Vítkovice-Sparta                             2:2                  0                  17:00 _ Vítkovice-Sparta (nL) 3.05 4.15 2.1 17:00",
        "kurz": "4.15",
        "vyherny": "true",
        "poznamka": "0"
    },
    {
        "sport": "Terno dňa",
        "liga": "Hokej",
        "typEventu": "Zápas",
        "date": "2014-11-25",
        "competitors": "5 Vítkovice-Sparta                             2:2                  0                  17:00 _ Vítkovice-Sparta (nL) 3.05 4.15 2.1 17:00",
        "kurz": "2.1",
        "vyherny": "false",
        "poznamka": "2"
    }
]```