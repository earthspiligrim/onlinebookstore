package com.onlinebookstore.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Book {
	
	private String bookId;
	
	private String author;
	
	private String bookName;
	
	private String genere;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Book(String bookId, String author, String bookName, String genere) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.bookName = bookName;
		this.genere = genere;
	}

	public Book() {
		super();
	}
	
	public String genereAndBookName() {
		return this.bookName + " , " + this.genere;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", author=" + author + ", bookName=" + bookName + ", genere=" + genere + "]";
	}
	
	

}
