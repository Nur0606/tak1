class Magazine extends News {
    public Magazine(String name, int pages) {
        super(name, pages);
    }

    @Override
    void displayInfo() {
        System.out.println("Magazine Name: " + getName());
        System.out.println("Number  Pages: " + getPages());
    }
}