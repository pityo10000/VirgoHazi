A használathoz lekell futtatni a következő parancsot a projekten:
mvn clean package

Ezután a projekt target könyvtárában előállt jart a következőképpen lehet futtatni:

#Ha több paklival szeretnénk játszani, akkor a <Paklik mennyisége> helyén megtudjuk adni, hogy hány paklival játszanánk.
#A beadott paraméter csak pozitív egész szám lehet.
java -jar PokerHand-1.0.0-SNAPSHOT.jar <Paklik mennyisége>

#Ha csak egyel játszanánk, akkor csak szimplán paraméter nélkül kell elindítanunk:
java -jar PokerHand-1.0.0-SNAPSHOT.jar

Az alkalmazás a generált paklikat összekeveri, kiválaszt 5 lapot, amelyeket ki is ír a képernyőre.
Ezeket kielemzi, majd a felismert pókerkezet is kiíratja.

Példa:
A kiosztott lapok a kovetkezok:
pikk    asz
kor     7
treff   kiraly
kor     10
pikk    7
A pokerkez a kovetkezo: egy par
