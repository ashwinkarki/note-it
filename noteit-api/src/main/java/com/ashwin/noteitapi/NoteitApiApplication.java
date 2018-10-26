package com.ashwin.noteitapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashwin.noteitapi.model.Note;
import com.ashwin.noteitapi.model.Notebook;
import com.ashwin.noteitapi.repository.NoteRepository;
import com.ashwin.noteitapi.repository.NotebookRepository;




@SpringBootApplication
public class NoteitApiApplication implements CommandLineRunner {
	
	@Autowired
	private NotebookRepository notebookRepository;
	@Autowired
	private NoteRepository noteRepository;

	public static void main(String[] args) {
		SpringApplication.run(NoteitApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*// Remove all existing entities
        this.notebookRepository.deleteAll();
        this.noteRepository.deleteAll();


        // Save a default notebook
        Notebook defaultNotebook = new Notebook("Default");
        this.notebookRepository.save(defaultNotebook);

        Notebook quotesNotebook = new Notebook("Quotes");
        this.notebookRepository.save(quotesNotebook);

        // Save the welcome note
        Note note = new Note("Hello", "Welcome to Note It", defaultNotebook);
        this.noteRepository.save(note);*/
		
	}
}
