package pl.gornik.doc;

public enum DocumentType {

    INVOICE("faktura",0),
    CONTRACT("kontrakt"),
    NOTARIAL_ACT("akt notarialny"),
    CERTIFICATE("certyfikat",1);

    public String getInfo() {
        return info;
    }

    private String info;
    private int id;

    DocumentType(String info) {
        this.info = info;
    }

    DocumentType(String info, int id) {
        this.info = info;
        this.id = id;
    }
}
