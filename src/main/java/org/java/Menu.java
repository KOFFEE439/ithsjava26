package org.java;

public class Menu {

        public void showMenu () {
            boolean menu = true;
            while (menu) {
                IO.println("Bibliotekshanteraren ");
                IO.println("==================== ");
                IO.println("1. Lägg till en bok ");
                IO.println("2. Registrera medlem  ");
                IO.println("3. Se alla medlemmar  ");
                IO.println("4. Låna bok ");
                IO.println("5. Lämna tillbaka bok ");
                IO.println("6. Sök bok ");
                IO.println("7. Visa alla böcker och status ");
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
                        borrowBook();
                        break;
                    case "5":
                        returnBook();
                        break;
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


        private MemberManager memberManager;
        private Library library;

    public Menu() {
            this.memberManager = new MemberManager(2);
            this.library = new Library();
        }


        private void registerNewMember () {
            String name = IO.readln("Skriv den nya medlemmens namn: ");
            int id = memberManager.getNumberOfMembers() + 1;

            Member member = new Member(id, name);

            memberManager.registerMember(member);

            IO.println("medlem har registrerats. " + "\n");
        }


        private void showAllMembers () {
            for (int i = 0; i < memberManager.getNumberOfMembers(); i++) {
                Member member = memberManager.getMember(i);

                IO.println("ID: " + member.getId());
                IO.println("Namn: " + member.getName());
            }
        }



        private void addNewBook () {
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


        private void searchBook () {
            String searchText = IO.readln("Skriv in titel eller författare för att söka efter en bok");
            library.searchBook(searchText);
        }

    private void borrowBook() {
        String input = IO.readln("Ange ID på boken du vill låna: ");

        try {
            int bookId = Integer.parseInt(input);

            boolean success = library.borrowBook(bookId);

            if (success) {
                IO.println("Boken är nu utlånad.");
            } else {
                IO.println("Boken finns inte eller är redan utlånad.");
            }

        } catch (NumberFormatException e) {
            IO.println("Du måste skriva ett heltal.");
        }
    }

    private void returnBook() {
        String input = IO.readln(
                "Ange ID på boken du vill lämna tillbaka: "
        );

        try {
            int bookId = Integer.parseInt(input);

            boolean success = library.returnBook(bookId);

            if (success) {
                IO.println("Boken har lämnats tillbaka.");
            } else {
                IO.println(
                        "Boken finns inte eller är inte utlånad."
                );
            }

        } catch (NumberFormatException e) {
            IO.println("Du måste skriva ett heltal.");
        }
    }


}


