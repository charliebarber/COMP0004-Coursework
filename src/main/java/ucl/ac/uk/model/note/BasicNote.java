package ucl.ac.uk.model.note;

// Basic note consists of just text
public class BasicNote implements Note {
    private String type = "basic";
    private String label;
    private String text;

    public BasicNote(String label, String text) {
        this.label = label;
        this.text = text;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    public String getContent() {
        return this.text;
    }

    @Override
    public String getType() {
        return type;
    }
}
