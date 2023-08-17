public class Gadjet extends  News{
    public Gadjet(String name, int pages) {
        super(name, pages);
    }

    @Override
        void displayInfo() {
            System.out.println("Magazine Name: " + getName());
            System.out.println("Number Pages: " + getPages());
        System.out.println("\uD83D\uDE00");
        }
    }
