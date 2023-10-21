package com.example.goodreads;

import java.util.*;

public interface BookRepositary {
    ArrayList<Book> getBooks();

    Book getBookId(int bookId);
}