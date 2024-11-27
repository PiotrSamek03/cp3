public class book{
    int NumberOfPages;
    String Title;
    String Author;



    public book(String Author, String Title, int NumberOfPages){
        this.NumberOfPages = NumberOfPages;
        this.Title = Title;
        this.Author = Author;
    }

    public void OpenBook(){
        System.out.println("Book is open");
    }

    public void CloseBook(){
        System.out.println("Book is closed");
    }

    public void ReadBook(){
        System.out.println("Book is beeing read");
    }

    
}