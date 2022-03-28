package ucl.ac.uk.model;

import ucl.ac.uk.model.note.Note;

import java.util.ArrayList;
import java.util.HashMap;

public class DataModel {
    private final HashMap<Integer, Note> noteIndex;
    private Integer count = 0;

    public DataModel() {
        this.noteIndex = new HashMap<>();
    }

    public void add(Note note) {
        this.count += 1;
        this.noteIndex.put(count, note);
    }

    public Integer getCount() {
        return this.count;
    }
}
