package com.ashwin.noteitapi.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.ashwin.noteitapi.model.Note;
import com.ashwin.noteitapi.model.Notebook;

/**
 * This component will only execute (and get instantiated) if the
 * property noteit.db.recreate is set to true in the
 * application.properties file
 */

/*@Component
@ConditionalOnProperty(name = "noteit.db.recreate", havingValue = "true")*/
public class DbSeeder /*implements CommandLineRunner*/ {
    /*private NotebookRepository notebookRepository;
    private NoteRepository noteRepository;

    public DbSeeder(NotebookRepository notebookRepository,
                    NoteRepository noteRepository) {
        this.notebookRepository = notebookRepository;
        this.noteRepository = noteRepository;
    }


    @Override
    public void run(String... args) {
        

        System.out.println("Initialized database");
    }*/
}