// import java.util.Scanner
// loading Scanner class into jvm
// java and util are like folders
// Scanner is a class

class Book{
    String title;
    String author;
    int pageNum;

    Book(String title, String author, int pageNum){
        this.title = title;
        // this.title = title
        // this will point to the current object
        // this is a refrence
        this.author = author;
        this.pageNum = pageNum;
    }
}

class Library{

    Book[] books;

    Library(Book[] b){
        books = b;
    }

    void showAll(){
        for(Book book : books){
            System.out.println(book.author);
            System.out.println(book.title);
            System.out.println(book.pageNum);
        }
    }

    void showOne(Book book){
        System.out.println(book.author);
        System.out.println(book.title);
        System.out.println(book.pageNum);
    }

    void findMaxPage(int pageNum){
        for(Book book : books){
            if(book.pageNum == pageNum){
                showOne(book);
            }
        }
    }

    void findAuthor(String author){
        for(Book book : books){
            if(book.author.equals(author)){
                showOne(book);
            }
        }
    }

    void findTitle(String title){
        for(Book book : books){
            if(book.title.equals(title)){
                showOne(book);
            }
        }
    }
}

class RunLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Something1", "Someone1", 20);
        Book book2 = new Book("Something2", "Someone2", 30);
        Book book3 = new Book("Something3", "Someone3", 20);
        Book book4 = new Book("Something4", "Someone4", 40);
        Book book5 = new Book("Something5", "Someone5", 20);
        
        Book[] books = {book1, book2, book3, book4, book5};

        Library library = new Library(books);

        library.showAll();
        System.out.println("\n\n");
        library.findMaxPage(20 );
        System.out.println("\n\n");
        library.findMaxPage(30 );
        System.out.println("\n\n");
        library.findAuthor( "Someone1");
        System.out.println("\n\n");
        library.findTitle( "Something4");
    }
}

// Stack has author, title and pageNum of book class
// When contructor executed stack's fields will be deleted