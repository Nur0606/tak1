// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        News[] newsArray = {
                new NewsPapper("chehol", 20),
                new Magazine("naushnik ", 50),
                new Gadjet(" myshka ", 5)};


        for (News news : newsArray) {
            news.displayInfo();
            System.out.println("\uD83D\uDE0E ");

        }
    }
    }
