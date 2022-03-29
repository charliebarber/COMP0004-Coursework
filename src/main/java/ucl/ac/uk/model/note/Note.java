package ucl.ac.uk.model.note;

//  Notes need an ID, label and a type (e.g text, url, image)
public interface Note {
    String getLabel();

    String getContent();

    String getType();

    void setContent(String contents);

    void setLabel(String label);
}
