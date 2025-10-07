// this class is used to specify what each individual book can and can't do
// included are properties of each individual book & check in, check out methods
//not sure if I could specify each property for each book here, methinks no because too much code
package com.pluralsight;


public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


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
        return checkedOutTo;
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
        this.checkedOutTo = checkedOutTo;
    }


    //the constructor used to initialize the class
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    //class methods
    //creating the method for when the book in checked out
    //using instance in order to update the values
    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;


    }

    public void checkIn() {
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }


}

