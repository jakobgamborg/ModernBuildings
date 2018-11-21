# ModernBuildings

Vores løsning:<br/>
Styrker:<br/>
At vi har en log i form af events for hver gang et regelsæt er brudt med reglen.<br/>
At man kan have forskellige regler per bygning.<br/>
Hvis en regl bliver brudt sætter det en aktuator igang.<br/>
At logikken er opdelt efter OOP principper.<br/>
Man kan bestemte på en enkle aktuator om den skal åbnes eller lukkes.<br/>
Man kan have lige så mange sensors og aktuators som man ønsker.

Svagheder:<br/>
At vi gør brug af en average værdi for alle sensorer i en bygning.<br/>
At vi tilføjer et event for hver gang vi tjekker for temperatur eller co2 niveauer - hvis der køres mange intervaller.<br/>
Ingen automatisk tjekning af regler.<br/>
Vi kan ikke styre level af aktuator - for eksempel en ventilator.

Kontra referenceimplementeringen:<br/>
Styrker:<br/>
Vi har regelsæt for bygninger, hvornår aktuator skal fortage en action.<br/>
Log af events.<br/>
Vi kan tjekke om alt er ok i en bygning.

Svagheder:<br/>
Vi kan ikke justere en ventilator på niveau.
