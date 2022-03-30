package ucl.ac.uk.model.note;

// Basic note consists of just text
public class UrlNote implements Note {
    private String type = "url";
    private String label;
    private String url;

    public UrlNote(String label, String url) {
        this.label = label;
        this.url = url;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    public String getContent() {
        return this.url;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setContent(String contents) {
        this.url = contents;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }
}
