package com.orm.core;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.BookDao;
import com.orm.entity.Book;

public class AppExample {

    public static void main(String[] args) {

        // Load Spring Configuration
        String configuration = "config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configuration);
        BookDao bookDao = (BookDao) context.getBean("bookDao");

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Book Management ==========");
        System.out.println("1. Add New Book");
        System.out.println("2. Get Book by ID");
        System.out.println("3. Get All Books");
        System.out.println("4. Update Book");
        System.out.println("5. Delete Book");
        System.out.print("Choose an option (1-5): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        try {
            switch (choice) {
                case 1: // ✅ Add new book
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Book Name: ");
                    String bookName = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String authorName = scanner.nextLine();

                    Book newBook = new Book(bookId, bookName, authorName);
                    bookDao.saveNewBook(newBook);
                    System.out.println("\n✅ Book saved successfully!");
                    break;

                case 2: // 🔍 Get book by ID
                    System.out.print("Enter Book ID to fetch: ");
                    int fetchId = scanner.nextInt();
                    Book fetchedBook = bookDao.getBookDetailsById(fetchId);
                    if (fetchedBook != null) {
                        System.out.println("\n📘 Book Found: " + fetchedBook);
                    } else {
                        System.out.println("\n⚠️ Book not found!");
                    }
                    break;

                case 3: // 📚 Get all books
                    List<Book> books = bookDao.getAllBooks();
                    if (books.isEmpty()) {
                        System.out.println("\n⚠️ No books found!");
                    } else {
                        System.out.println("\n📚 List of Books:");
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 4: // ✏️ Update book
                    System.out.print("Enter Book ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Book updateBook = bookDao.getBookDetailsById(updateId);
                    if (updateBook != null) {
                        System.out.print("Enter New Book Name: ");
                        String newName = scanner.nextLine();

                        System.out.print("Enter New Author Name: ");
                        String newAuthor = scanner.nextLine();

                        updateBook.setBookName(newName);
                        updateBook.setAuthorName(newAuthor);

                        bookDao.updateBook(updateBook);
                        System.out.println("\n✅ Book updated successfully!");
                    } else {
                        System.out.println("\n⚠️ Book not found!");
                    }
                    break;

                case 5: // 🗑️ Delete book
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = scanner.nextInt();
                    Book deleteBook = bookDao.getBookDetailsById(deleteId);
                    if (deleteBook != null) {
                        bookDao.deleteBook(deleteBook);
                        System.out.println("\n✅ Book deleted successfully!");
                    } else {
                        System.out.println("\n⚠️ Book not found!");
                    }
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }

        } catch (Exception e) {
            System.err.println("\n❌ Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
            ((ClassPathXmlApplicationContext) context).close();
        }

        System.out.println("\n==============================");
        System.out.println("Application Closed. ✅");
    }
}
