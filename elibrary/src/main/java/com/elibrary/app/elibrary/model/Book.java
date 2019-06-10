package com.elibrary.app.elibrary.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookid")
	private int bookId;
	
    @Column(name = "title")
    @NotEmpty(message = "*Please provide title")
    private String title;

    @Column(name = "fee")
    @NotNull(message = "*Please provide fee")
	private float fee;
	
    @Column(name="datepublished")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "*Please provide published date")
	private LocalDate datePublished;
	
	public Book() {
	}
	
	public Book(String title, float fee, LocalDate datePublished) {
		this.title = title;
		this.fee = fee;
		this.datePublished = datePublished;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", fee=" + fee + ", datePublished=" + datePublished
				+ "]";
	}
	
}