package com.sampleapp;

import com.sampleapp.model.ProgramType;

import java.util.ArrayList;
import java.util.List;

public class ProgramService {

    public List getAvailableBooks(ProgramType type){

        List books = new ArrayList();

        if(type.equals(ProgramType.PYTHON)){
            books.add("Python for EveryBody");
            books.add(("The Quick Python Book"));
            books.add(("Learning Python"));
            books.add(("Python Tricks"));
            books.add(("Think Python"));

        }else if(type.equals(ProgramType.GROOVY)){
            books.add("Groovy in Action");
            books.add("Groovy Programming");
            books.add("Learning Groovy");

        }else if(type.equals(ProgramType.SHELL)){
            books.add("Shell Scripting Tutorial");
            books.add("Linux Shell Scripting with Bash");
            books.add("Mastering Linux Shell Scripting");

        }else {
            books.add("No Books Available");
        }
    return books;
    }
}
