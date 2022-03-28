package ucl.ac.uk.model;

import ucl.ac.uk.model.note.Note;

import java.util.ArrayList;

public class DataModel {
    private final ArrayList<Note> noteArrayList;

    public DataModel(ArrayList<Note> noteArrayList) {
        this.noteArrayList = noteArrayList;
    }
}
