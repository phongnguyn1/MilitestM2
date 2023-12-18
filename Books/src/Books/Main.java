package Books;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook programmingBook1 = new ProgrammingBook("P001", "Java Programming", 29.99, "John Smith", "Java", "Spring");
        ProgrammingBook programmingBook2 = new ProgrammingBook("P002", "Python Basics", 19.99, "Alice Johnson", "Python", "Django");
        ProgrammingBook programmingBook3 = new ProgrammingBook("P003", "C# Fundamentals", 24.99, "Bob Williams", "C#", ".NET");
        ProgrammingBook programmingBook4 = new ProgrammingBook("P004", "JavaScript Essentials", 14.99, "Emma Davis", "JavaScript", "React");
        ProgrammingBook programmingBook5 = new ProgrammingBook("P005", "Ruby Programming Guide", 17.99, "James Brown", "Ruby", "Ruby on Rails");
        FictionBook fictionBook1 = new FictionBook("F001", "The Great Gatsby", 9.99, "F. Scott Fitzgerald", "Classic");
        FictionBook fictionBook2 = new FictionBook("F002", "To Kill a Mockingbird", 12.99, "Harper Lee", "Drama");
        FictionBook fictionBook3 = new FictionBook("F003", "1984", 14.99, "George Orwell", "Dystopian");
        FictionBook fictionBook4 = new FictionBook("F004", "Pride and Prejudice", 11.99, "Jane Austen", "Romance");
        FictionBook fictionBook5 = new FictionBook("F005", "The Catcher in the Rye", 10.99, "J.D. Salinger", "Coming-of-Age");
        double totalCost = programmingBook1.getPrice() + programmingBook2.getPrice() + programmingBook3.getPrice()
                + programmingBook4.getPrice() + programmingBook5.getPrice() + fictionBook1.getPrice()
                + fictionBook2.getPrice() + fictionBook3.getPrice() + fictionBook4.getPrice() + fictionBook5.getPrice();

        System.out.println("Tổng tiền của 10 cuốn sách là:" + totalCost);
    }
}
