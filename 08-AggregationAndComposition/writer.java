public class writer {
    String Name;
    int BornDate;
    int NumberOfBooks;
    book Book;
    
    public writer(String Name, int BornDate, int NumberOfBooks, book Book){
        this.Name = Name;
        this.BornDate = BornDate;
        this.NumberOfBooks = NumberOfBooks;
        this.Book = Book;
    }

    public void WriteBook(){
        System.out.println("I just finished my new piece of art");
    }

    public void ReadBook(){
        System.out.println("I just finished reading a book");
    }

    public static void main(String[] args){
        book Krzyzacy = new book("Henryk Sienkiewicz" , "Krzyzacy", 350);
        writer Author = new writer("Sienkiewicz", 1846, 100, Krzyzacy);
        Author.WriteBook();
        System.out.println(Author.Book.Author);
    }
}
