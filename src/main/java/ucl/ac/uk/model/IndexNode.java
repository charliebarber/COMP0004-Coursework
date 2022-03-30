package ucl.ac.uk.model;

import ucl.ac.uk.model.note.Note;

public class IndexNode implements Comparable<IndexNode> {
    private Integer key;
    private Note note;

    public IndexNode(Integer key, Note note) {
        this.key = key;
        this.note = note;
    }

    @Override
    public int compareTo(IndexNode other) {
        return note.getLabel().compareTo(other.note.getLabel());
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
