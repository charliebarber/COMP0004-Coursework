package ucl.ac.uk.model;

import ucl.ac.uk.model.note.Note;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class NoteIndex {
    private final HashMap<Integer, Note> index;
    private Integer count = 0;

    public NoteIndex() {
        this.index = new HashMap<>();
    }

    public void add(Note note) {
        this.count += 1;
        this.index.put(count, note);
    }

    public Note get(Integer key) {
        return index.get(key);
    }

    public void delete(Integer key) {
        index.remove(key);
    }

    public void updateContents(Integer key, String contents) {
        Note note = index.get(key);
        note.setContent(contents);
    }

    public void updateLabel(Integer key, String label) {
        Note note = index.get(key);
        note.setLabel(label);
    }

    public Integer getCount() {
        return this.count;
    }

    public ArrayList<IndexNode> getLabelIndex() {
//        HashMap<Integer, String> labelIndex = new HashMap<>();
//        this.index.forEach((key, val) -> labelIndex.put(key, val.getLabel()));
//        return labelIndex;
        ArrayList<IndexNode> labelIndex = new ArrayList<>();
        this.index.forEach((key, note) -> labelIndex.add(new IndexNode(key, note)));
        return labelIndex;
    }

    public ArrayList<IndexNode> getSortedIndex() {
        ArrayList<IndexNode> sortedIndex = new ArrayList<>();
        this.index.forEach((key, note) -> sortedIndex.add(new IndexNode(key, note)));
        Collections.sort(sortedIndex);
        return sortedIndex;
    }

    public ArrayList<IndexNode> search(String query) {
        ArrayList<IndexNode> results = new ArrayList<>();
        this.index.forEach((key, note) -> {
            if (note.getLabel().contains(query) || note.getContent().contains(query)) {
                results.add(new IndexNode(key, note));
            }
        });

        return results;
    }

    //    public HashMap<Integer, String> getStringIndex() {
//        HashMap<Integer, String> stringIndex = new HashMap<>();
//        this.index.forEach((key, val) -> stringIndex.put(key, val.getLabel()));
//        return stringIndex;
//    }
}
