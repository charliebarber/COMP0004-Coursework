package ucl.ac.uk.model.note;

// Basic note consists of just text
public class ImageNote implements Note {
    private String type = "url";
    private String label;
    private String path;

    public ImageNote(String label, String url) {
        this.label = label;
        this.path = path;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    public String getContent() {
        return this.path;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setContent(String contents) {
        this.path = contents;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }
}
