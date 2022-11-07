package model.dto;

public class Employed extends Person {

    private long codeEmployed;

    public Employed(final String name,
                    final String lastName,
                    final DocumentType documentType,
                    final String documentNumber,
                    final long codeEmployed) {
        super(name, lastName, documentType, documentNumber);
        this.codeEmployed = codeEmployed;
    }

    public long getCodeEmployed() {
        return codeEmployed;
    }

    public void setCodeEmployed(long codeEmployed) {
        this.codeEmployed = codeEmployed;
    }
}
