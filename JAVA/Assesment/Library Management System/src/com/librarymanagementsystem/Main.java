package com.librarymanagementsystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	//initializing string, ArrayList as private to store and hide data from public
	private static String password = "123";
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		//user input for password
		System.out.print("Enter password: ");
        String input = scanner.nextLine();
        //making condition to check the password is correct or not
        if (input.equals(password)) 
        {
            System.out.println("Authentication successful!\n");
            showMainMenu();
        } 
        else 
        {
            System.out.println("Invalid password. Exiting...");
        }
	}
	//creating method for showing main menu
	private static void showMainMenu() 
	{
		//using while loop to check if condition is true then enter in loop
        while (true) 
        {
            System.out.println("\n-- Main Menu --");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Search Book");
            System.out.println("4. View Book List");
            System.out.println("5. Edit Book Record");
            System.out.println("6. Change Password");
            System.out.println("7. Close Application");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            //switching by user input
            switch (choice) {
                case 1:
                    showCategoryMenu();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    viewBookList();
                    break;
                case 5:
                    editBookRecord();
                    break;
                case 6:
                    changePassword();
                    break;
                case 7:
                    System.out.println("Closing application...");
                    try 
                    {
                        Thread.sleep(3000);//closing thread in 3 seconds
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
	//creating method to show category menu
	private static void showCategoryMenu() 
	{
        System.out.println("\n-- Category Menu --");
        System.out.println("1. Computer");
        System.out.println("2. Electronics");
        System.out.println("3. Electrical");
        System.out.println("4. Civil");
        System.out.println("5. Mechanical");
        System.out.println("6. Architecture");
        System.out.println("7. Back to Main Menu");

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();//user input to select category
        scanner.nextLine(); // Consume newline character
        //making condition if user input is in between 1 to 6 then which method should be called
        if (choice >= 1 && choice <= 6) 
        {
            addBook(choice);
        }
        else if (choice == 7) //if user input is 7 then showing main menu 
        {
            showMainMenu();
        } else //if user input is not from above choice then show error message
        {
            System.out.println("Invalid choice. Please try again.");
            showCategoryMenu();
        }
    }
	//creating return type method to get category by user input
	 private static String getCategoryName(int categoryChoice) 
	 {
		 //switching user input for category
		 switch (categoryChoice) 
	     {
	     case 1:
	    	 return "Computer";
	     case 2:
	    	 return "Electronics";
	     case 3:
	    	 return "Electrical";
	     case 4:
	    	 return "Civil";
	     case 5:
	    	 return "Mechanical";
	     case 6:
	    	 return "Architecture";
	     default:
	    	 return "";
	     }
	 }
	 //creating method for add book
	 private static void addBook(int categoryChoice) 
	 {
         System.out.print("Enter book ID: ");
         int bookId = scanner.nextInt();
         scanner.nextLine(); // Consume newline character

         System.out.print("Enter book name: ");
         String bookName = scanner.nextLine();

         System.out.print("Enter author name: ");
         String author = scanner.nextLine();

         System.out.print("Enter quantity: ");
         int quantity = scanner.nextInt();

         System.out.print("Enter price: ");
         double price = scanner.nextDouble();

         String category = getCategoryName(categoryChoice);
         //creating object of Book class
         Book book = new Book(bookId,bookName,author,quantity,price,category);
         books.add(book);//adding values into ArrayList

         System.out.println("Book added successfully!");
	 }
	 //creating method for delete perticular book data via Book Id
	 private static void deleteBook() 
	 {
		 System.out.print("Enter book ID: ");
		 int bookId = scanner.nextInt();
		 scanner.nextLine(); // Consume newline character

		 boolean found = false;
		 for (Book book : books) 
		 {
			 if (book.getBookId() == bookId) 
			 {
				 books.remove(book);
				 found = true;
				 break;
			 }
		 }
         //making condition if book is available or not
		 if (found) 
		 {
			 System.out.println("Book deleted successfully!");
		 } 
		 else 
		 {
			 System.out.println("Book not found!");
		 }
	 }
	//creating method to search book by book id or book name
	private static void searchBook() 
	{
        System.out.println("\n-- Search Book --");
        System.out.println("1. Search by Book ID");
        System.out.println("2. Search by Book Name");

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();//taking user input
        scanner.nextLine(); // Consume newline character
        //creating HashSet for search book result
        HashSet<Book> searchResult = new HashSet<>();
        //making conditions for user input
        if (choice == 1) 
        {
            System.out.print("Enter book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            //showing book result
            for (Book book : books) 
            {
                if (book.getBookId() == bookId) 
                {
                    searchResult.add(book);
                }
            }
        }
        else if (choice == 2) 
        {
            System.out.print("Enter book name: ");
            String bookName = scanner.nextLine();
            //showing book result
            for (Book book : books) 
            {
                if (book.getBookName().equalsIgnoreCase(bookName)) 
                {
                    searchResult.add(book);
                }
            }
        } 
        //if user input is invalid then show error message
        else 
        {
            System.out.println("Invalid choice. Please try again.");
            searchBook();
            return;
        }
        //creating another conditions if there is no book by search result
        if (searchResult.isEmpty()) 
        {
            System.out.println("No books found matching the search criteria.");
        } 
        else //if book available then show book result
        {
            System.out.println("\nSearch Results:");
            for (Book book : searchResult) 
            {
                System.out.println(book);
            }
        }
    }
	//creating method for view all book
	private static void viewBookList() 
	{
		//making condition if book is available or not
        if (books.isEmpty()) 
        {
            System.out.println("No books found.");
        }
        else //if available then show all book list
        {
            System.out.println("\nBook List:");
            for (Book book : books) 
            {
                System.out.println(book);
            }
        }
    }
	//creating method to edit in book by book id
    private static void editBookRecord() 
    {
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        boolean found = false;
        int index = -1;
        for (int i = 0; i < books.size(); i++) 
        {
            Book book = books.get(i);
            if (book.getBookId() == bookId) 
            {
                found = true;
                index = i;
                break;
            }
        }
        //making condition if book is available or not
        if (found) 
        {
            System.out.print("Enter new book name: ");
            String newBookName = scanner.nextLine();
            books.get(index).setBookName(newBookName);

            System.out.println("Book record updated successfully!");
        }//if book is not available then show error message
        else 
        {
            System.out.println("Book not found!");
        }
    }
    //creating method for change password
    private static void changePassword() 
    {
        System.out.print("Enter old password: ");
        String oldPassword = scanner.nextLine();
        //making condition if old password input by user is correct or not 
        if (oldPassword.equals(password)) 
        {
            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine();

            password = newPassword;
            System.out.println("Password changed successfully!");
        }
        else //if old password is incorrect then show error message
        {
            System.out.println("Invalid old password!");
        }
    }
}