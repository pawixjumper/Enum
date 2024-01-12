package pl.gornik.doc;

public class Document {

    private String name;
    private int pageCount;
    private DocumentType documentType;
    private boolean confirmed;

    public Document(String name, int pageCount, DocumentType documentType, boolean confirmed) {
        this.name = name;
        this.pageCount = pageCount;
        this.documentType = documentType;
        this.confirmed = confirmed;
    }


    public DocumentType getDocumentType(){return documentType;}

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", documentType=" + documentType.getInfo() +
                ", confirmed=" + confirmed +
                '}';
    }
}
