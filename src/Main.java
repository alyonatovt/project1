import Author.Author;
import Book.Book;
import Student.Student;

public class Main {
    public static void main(String[] args) {

            Student student1 = new Student("Olena",18,"KN-13");
            Student student2 = new Student("Olesia",17,"KN-13");
            Student student3 = new Student("Vanessa",17,"KN-13");

            Book book1 = new Book("The Cruel Prince",2018,"Holly Black");
            Book book2 = new Book("Carrie",1974,"Stephen Edwin King");
            Book book3 = new Book("The Da Vinci Code",2003,"Dan Brown");

            Author author1 = new Author("Holly Black",51,44);
            Author author2 = new Author("Stephen Edwin King",75,264);
            Author author3 = new Author("Dan Brown",58,8);


    }


}
