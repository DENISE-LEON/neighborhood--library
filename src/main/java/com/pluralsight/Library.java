//this class is a bookshelf which holds the books
//using arrays to specify the properties of each book
//20 books
package com.pluralsight;

import java.util.Scanner;

public class Library {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //books in the library and their properties
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

        //asking user what they want to do, getting input using 1,2, or 3
        System.out.println("Hello, what would you like to do?");
        System.out.println("Your options are \n 1.view available books \n 2.view checked out books \n 3.exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        //using switch statement based on what user has chosen
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
         boolean found = false;
        if (wantsToCheckOut.equalsIgnoreCase("Y")) {
            System.out.println("Please enter the ID number of the book you would like to check out");
            int bookID = scanner.nextInt();

            scanner.nextLine();

            //loop through all books to match id to book
            for (Book book : books) {
                if (book.getId() == bookID && !book.isCheckedOut()) {
                    found = true;
                    System.out.println("Please enter your name in order to check out");
                    String name = scanner.nextLine();
                    book.checkOut(name);

                    System.out.printf("You have successfully checked out %s!", book.getTitle());

                } //cannot use an else statement incase # is incorrect because it will check the bookID number against every book in the array and display error msg

                if(!found) {
                    System.out.println("The ID you have entered is incorrect please try again");
                }
            }


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






