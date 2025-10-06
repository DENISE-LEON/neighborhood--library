// this class is used to specify what each individual book can and can't do
// included are properties of each individual book & check in, check out methods
package com.pluralsight;

import java.util.Scanner;

public class Book {
    Scanner scanner = new Scanner(System.in);

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String CheckedOutTo;


    //the getter which allows us to summon the information
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return CheckedOutTo;
    }

    //
    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        CheckedOutTo = checkedOutTo;
    }


    //the constructor used to initialize the class
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        CheckedOutTo = checkedOutTo;
    }

    //class methods
    //creating the method for when the book in checked out
    //using instance in order to update the values
    public void checkOut(String wantToCheckOut, Scanner scanner) {

        String name = "";
        if (this.isCheckedOut) {
            System.out.println("Sorry, the book you selected is currently unavailable");
            return;
        }
        if (wantToCheckOut.equalsIgnoreCase("Y")) {
            do {
                System.out.println("In order to check out this book please provide your name");
                name = scanner.nextLine();

            } while (name.isBlank());

            this.CheckedOutTo = name;
            this.isCheckedOut = true;
        } else {
            System.out.println("Check out cancelled");
        }

    }

    //creating a method that allows the user to check in books
    //using instance method to update the values
    public void checkIn(Scanner scanner) {

        String wantToCheckIn = scanner.nextLine().trim();

        if (wantToCheckIn.equalsIgnoreCase("Y")) {
            System.out.println("Thank you for returning our book! Have a great day!");
            isCheckedOut = false;

            this.CheckedOutTo = null;
            this.isCheckedOut = false;

        } else {
            System.out.println("Return cancelled");
        }
    }

}

