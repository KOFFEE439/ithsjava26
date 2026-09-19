package org.java;

public class Menu {


//Todo Meny & interaktivitet: en robust meny (Scanner) som hanterar felaktig inmatning (t.ex.
//bokstäver där siffror förväntas) utan att programmet kraschar.


    //Todo: Funktionalitet:
    //◦ Lägga till en ny bok.
    //◦ Registrera en ny medlem.
    //◦ Låna en bok — kontrollera att boken finns och inte redan är utlånad.
    //◦ Lämna tillbaka en bok.
    //◦ Söka bok på (del av) titel eller författare, skiftlägesokänsligt, via egen sökloop (linjär
    //sökning).
    //◦ Visa samtliga böcker med status (utlånad/tillgänglig och till vem).

    //Todo: Felhantering: tydliga meddelanden vid t.ex. bok/medlem som inte hittas, bok som redan är
    //utlånad, eller ogiltiga menyval — programmet ska aldrig krascha på grund av felaktig inmatning.
    //Versionshantering: projektet sätts upp i en IDE, byggs med Maven och lämnas in som länk till ett
    //Git-repository med flera meningsfulla commits (inte en enda stor commit).
    //Källkritik & reflektion: skriv i projektets README.md en kort beskrivning av lösningen samt en
    //reflektion kring dina designval (t.ex. record kontra klass).

    //--------------------


    //----------------------- meny
    public void showMenu() {
        boolean menu = true;
        while (menu) {
            IO.println("Bibliotekshanteraren ");
            IO.println("==================== ");
            IO.println("1. Lägg till en bok ");  //set book
            IO.println("2. Registrera medlem  "); //set member
            IO.println("3. Se alla medlemmar  ");
            IO.println("4. Låna bok ");             //boolean borrowBook specific book set
            IO.println("5. Lämna tillbaka bok ");   //boolean returnBook
            IO.println("6. Sök bok "); //array search writer or title
            IO.println("7. Visa alla böcker och status "); //array allBooks
            IO.println("8. Avsluta ");

            String choice = IO.readln("Välj ett alternativ " + "\n");

            switch (choice) {
                case "1":
                    addNewBook();
                    break;
                case "2":
                    registerNewMember();
                    break;
                case "3":
                    showAllMembers();
                    break;
                case "4":
                case "5":
                case "6":
                case "7":
                    library.printBooks();
                    break;
                case "8":
                    menu = false;
                    IO.println("\n" + "VÄLKOMMEN TILLBAKA! ");
                    break;
                default:
                    IO.println("\n" + "Ogiltigt val, vänligen välj en siffra mellan 1 och 8." + "\n");
                    break;


            }

        }

    }

    // skapar konstruktor från Membermanager och library
    private MemberManager memberManager;
    private Library library;

    public Menu() {
        this.memberManager = new MemberManager(2);
        this.library = new Library();
    }

    //-------------- case 2
    private void registerNewMember() {
        String name = IO.readln("Skriv den nya medlemmens namn: ");
        int id = memberManager.getNumberOfMembers() + 1;

        Member member = new Member(id, name);

        memberManager.registerMember(member);

        IO.println("medlem har registrerats. " + "\n");
    }

    // ------------------case 3
    private void showAllMembers() {
        for (int i = 0; i < memberManager.getNumberOfMembers(); i++) {
            Member member = memberManager.getMember(i);

            IO.println("ID: " + member.getId());
            IO.println("Namn: " + member.getName());
        }
    }

    //-------------------case 1

    private void addNewBook() {

        try {
            String title = IO.readln("Ange bokens title: ");
            String author = IO.readln("Ange bokens författare: ");
            int year = Integer.parseInt(IO.readln("Ange bokens utgivningsår: "));


            Library.Book book = new Library.Book(title, author, year);

            library.addBook(book);

            IO.println("Boken har lagts till \n");
        }
        catch (NumberFormatException e) {
            IO.println("\n \n Årtalet måste vara heltal. Boken lades inte till, försök igen. \n");
        }


    };



}

