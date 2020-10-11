package com.onlinebookstore.repository;

import java.io.File;
import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FireBaseInitialize {

	@PostConstruct
	public static void initialize() {
//		onlinebookstorespringboot/src/main/resources/serviceAccountKey.json
		try {
//			FileInputStream serviceAccount = new FileInputStream("path/to/serviceAccountKey.json");
			File serviceAccountKeyFile = ResourceUtils.getFile("classpath:serviceAccountKey.json");
			FileInputStream serviceAccount = new FileInputStream(serviceAccountKeyFile);
			System.out.println(serviceAccount.toString());

			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://onlinebookstore-44d9b.firebaseio.com").build();

			FirebaseApp.initializeApp(options);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
