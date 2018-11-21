# ModernBuildings

Vores løsning:<br/>
Styrker:<br/>
At vi har en log i form af events for hver gang et regelsæt er brudt med reglen.
At man kan have forskellige regler per bygning.
Hvis en regl bliver brudt sætter det en aktuator igang.
At logikken er opdelt efter OOP principper.
Man kan bestemte på en enkle aktuator om den skal åbnes eller lukkes.
Man kan have lige så mange sensors og aktuators som man ønsker.

Svagheder:<br/>
At vi gør brug af en average værdi for alle sensorer i en bygning.
At vi tilføjer et event for hver gang vi tjekker for temperatur eller co2 niveauer - hvis der køres mange intervaller.
Ingen automatisk tjekning af regler.
Vi kan ikke styre level af aktuator - for eksempel en ventilator.

Kontra referenceimplementeringen:<br/>
Styrker:<br/>
Vi har regelsæt for bygninger, hvornår aktuator skal fortage en action.
Log af events.
Vi kan tjekke om alt er ok i en bygning.

Svagheder:<br/>
Vi kan ikke justere en ventilator på niveau.
