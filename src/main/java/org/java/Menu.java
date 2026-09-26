package org.java;

public class Menu {

    //Todo:

    //Låna bok
    //Lämna tillbaka bok
    //Visa status för alla böcker

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
                    searchBook();
                    break;
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
        String title = IO.readln("Ange bokens titel: ");
        String author = IO.readln("Ange bokens författare: ");
        int year;

        try {
            year = Integer.parseInt(
                    IO.readln("Ange bokens utgivningsår: ")
            );
        } catch (NumberFormatException e) {
            IO.println("Årtalet måste vara ett heltal.");
            return;
        }

        int id = library.getNumberOfBooks() + 1;

        Library.Book book = new Library.Book(id, title, author, year);

        library.addBook(book);

        IO.println("\n Boken har lagts till med ID: " + book.id() + "\n");
    }

    //--------------metod sök bok
    private void searchBook() {
        String searchText = IO.readln("Skriv in titel eller författare för att söka efter en bok");
        library.searchBook(searchText);
    }





}

