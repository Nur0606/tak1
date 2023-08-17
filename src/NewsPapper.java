public class NewsPapper extends News{

    public NewsPapper(String name, int pages) {
        super(name, pages);
    }

    @Override
    void displayInfo() {
        System.out.println("Newspaper Name: " + getName());
        System.out.println("Number  Pages: " + getPages());

    }
}



