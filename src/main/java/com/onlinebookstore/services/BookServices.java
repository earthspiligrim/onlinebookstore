package com.onlinebookstore.services;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.onlinebookstore.entities.Book;

@Service
public class BookServices {
	
	public static final String COL_NAME="Books";

    public Book getPatientDetails(String Id) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COL_NAME).document(Id);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        Book book = null;

        if(document.exists()) {
            book = document.toObject(Book.class);
            return book;
        }else {
            return null;
        }
    }
}
