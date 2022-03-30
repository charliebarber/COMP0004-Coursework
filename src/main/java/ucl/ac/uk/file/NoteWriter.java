package ucl.ac.uk.file;

import ucl.ac.uk.model.note.Note;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NoteWriter {
    FileWriter file;
    BufferedWriter writer;

    public NoteWriter(String filename) throws IOException {
        this.file = new FileWriter(filename, true);
        this.writer = new BufferedWriter(file);
    }

    public void writeNote(Integer key, Note note) throws IOException {
        String noteLine = '\n' + Integer.toString(key) + "," + note.getType() + "," + note.getLabel() + "," + note.getContent();
        System.out.println("WRITING" + noteLine);
        writer.write(noteLine);
        writer.close();
    }
}
