
## Källkritik & reflektion:

Jag försökte utforma projektet så enkelt som möjligt, men upplevde att 
ansvarsfördelningen mellan klasserna var en utmaning. Jag valde ändå att dela
upp programmet i flera klasser så att varje klass kanske skulle få ett 
tydligare ansvar, vet inte om det blev det eller om det bara blev rörigt. 

Member representerar en enskild medlem, medan MemberManager hanterar flera 
medlemmar. MemberManager lagrar medlemmarna i en array och ansvarar bland
annat för registrering och sökning. Denna uppdelning gör att Member inte 
behöver känna till hela medlemsarrayen.

Jag valde att använda Library för att hantera böcker, utlåning, återlämning 
och sökning. På så sätt samlas bibliotekets funktioner på ett ställe.

Book är en record eftersom en bok i detta projekt främst består av 
data: ID, titel, författare och utgivningsår. En bok ändras inte efter att den har
skapats, vilket gör en record lämplig för denna typ av objekt.

Member är en vanlig klass eftersom medlemsinformationen kanske kan behöva 
ändras under programmets körning, till exempel medlemmens namn. Klassen innehåller
privata fält och metoder för att komma åt informationen.

- BiblioteksHanterare startar programmet genom att skapa och starta menyn.
- Menu visar menyn och hanterar användarens val.
- Library hanterar böcker, utlåning, återlämning och sökning.
- Book är en record som representerar en bok med ID, titel, författare och utgivningsår.
- MemberManager hanterar registrering och sökning av medlemmar.
- Member representerar en enskild biblioteksmedlem.

## Användning 
1. Man får lägga in böcker för att få ett bibliotek med böcker. 
2. Man får registrerar medlemmar för att lägga in medlemmar. 
3. Man kan se alla medlemmar för att ta reda på namn och id på vem som kan låna en bok. 
4. Låna en bok genom att skriva in ID på boken och medlemmen. 
5. Lämna tillbaka en bok genom att skriva in ID på boken man vill lämna tillbaka.
6. Söka efter en bok som innehåller text som finns i titel eller författare av boken. 
7. Visa alla böcker och status och om böckerna är tillgängliga eller inte och till vem. 
8. Avsluta. 