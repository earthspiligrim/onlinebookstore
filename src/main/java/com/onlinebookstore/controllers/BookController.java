package com.onlinebookstore.controllers;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstore.entities.Book;
import com.onlinebookstore.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	BookServices bookServices;
	
    @GetMapping("/getBookWithId")
    public Book getPatient(@RequestParam String Id ) throws InterruptedException, ExecutionException{
    	System.out.println("printing id" + Id);
        return bookServices.getPatientDetails(Id);
    }

}
