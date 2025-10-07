//this class is a bookshelf which holds the books
//using arrays to specify the properties of each book
//20 books
package com.pluralsight;

public class Library {
    //initializing the books object using new
    //smth smth with the constructor, smth smth memory
    //must use a constructor bc is in class body
    Book books[] = new Book[20];

    public BookShelf() {
    //using a for loop to generate the id and isb numbers in order
        for(int i = 0; i < books.length; i++) {
            String isbn = "ISBN" + (i +3000);
            int id = (i +1000);
        }
        books[0].setTitle("The Visible Man by Chuck Klosterman");
        books[1].setTitle("1984 by Goerge Orwell");
        books[2].setTitle("The Exhibition of Persephone by Jessi Jezewska Stevens ");
        books[3].setTitle("The Killing Hands by P.D Martin");
        books[4].setTitle("Possession by Peter James");
        books[5].setTitle("The Killer Inside Me Jim Thompson");
        books[6].setTitle("Marvel Zombies The Full Collection");
        books[7].setTitle("What Everybody is Saying by Joe Navarro");
        books[8].setTitle("");
        books[9].setTitle("");
        books[10].setTitle("");
        books[11].setTitle("");
        books[12].setTitle("");
        books[13].setTitle("");
        books[14].setTitle("");
        books[15].setTitle("");
        books[16].setTitle("");
        books[17].setTitle("");
        books[18].setTitle("");
        books[19].setTitle("");
    }

    //setting values for each book in the array





}
