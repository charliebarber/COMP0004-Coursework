package ucl.ac.uk.model.note;

// Basic note consists of just text
public class BasicNote implements Note {
    private String type = "basic";
    private String text;

    public BasicNote(String text, Integer id) {
        this.text = text;
    }

    @Override
    public String getLabel() {
        return text;
    }

    @Override
    public String getType() {
        return type;
    }
}
