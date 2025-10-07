//this class is a bookshelf which holds the books
//using arrays to specify the properties of each book
//20 books
package com.pluralsight;

import java.util.Scanner;

public class Library {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Book[] books = {
                new Book(1, "ISBN1001", "The Great Gatsby", true, "Jason Brocco"),
                new Book(2, "ISBN1002", "To Kill a Mockingbird", false, null),
                new Book(3, "ISBN1003", "1984", false, null),
                new Book(4, "ISBN1004", "Pride and Prejudice", false, null),
                new Book(5, "ISBN1005", "The Catcher in the Rye", false, null),
                new Book(6, "ISBN1006", "The Hobbit", true, "Ashley Mendez"),
                new Book(7, "ISBN1007", "Fahrenheit 451", false, null),
                new Book(8, "ISBN1008", "Jane Eyre", false, null),
                new Book(9, "ISBN1009", "Animal Farm", false, null),
                new Book(10, "ISBN1010", "Brave New World", true, "Mia Ree"),
                new Book(11, "ISBN1011", "Moby-Dick", false, null),
                new Book(12, "ISBN1012", "War and Peace", false, null),
                new Book(13, "ISBN1013", "Crime and Punishment", false, null),
                new Book(14, "ISBN1014", "The Odyssey", true, "Linda Belcher"),
                new Book(15, "ISBN1015", "The Iliad", false, null),
                new Book(16, "ISBN1016", "Wuthering Heights", false, null),
                new Book(17, "ISBN1017", "Great Expectations", false, null),
                new Book(18, "ISBN1018", "Les Misérables", false, null),
                new Book(19, "ISBN1019", "The Divine Comedy", false, null),
                new Book(20, "ISBN1020", "Dracula", false, null)
        };

        System.out.println("Hello, what would you like to do?");
        System.out.println("Your options are \n 1.view available books \n 2.view checked out books \n 3.exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                viewAvailableBooks(books);
                break;
            case 2:
                viewCheckedOutBooks(books);
                break;
            case 3:
                System.out.println("Exiting menu");
                break;
        }


    }

    //method to view available books
    public static void viewAvailableBooks(Book[] books) {
        System.out.println("The books available are:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.printf("Title: %s, ID: %d, ISBN: %s", book.getTitle(), book.getId(), book.getIsbn());
                System.out.println();
            }

        }
        System.out.println("Would you like to check out a book (Y) or exit (N)");
        String wantsToCheckOut = scanner.nextLine();

        if (wantsToCheckOut.equalsIgnoreCase("Y")) {

        }



            String bookChoice = scanner.nextLine();

        //use the check out method to
        //Show Available Books - Displays a list of all books that are not currently
        //checked out. Display the Id, ISBN and Title of the book.
        //o Prompt the user to either select a book to check out, or exit to go back
        //to the home screen
        //o If the user wants to check out a book, prompt them for their name
        //o Then check out the book

    }


    public static void viewCheckedOutBooks(Book[] books) {

    }
}






