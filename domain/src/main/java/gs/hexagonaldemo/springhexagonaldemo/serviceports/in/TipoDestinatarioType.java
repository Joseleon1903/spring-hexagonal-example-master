package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

public enum TipoDestinatarioType {

    TO("To"),
    CC("Cc"),
    BCC("Bcc");

    private final String label;

    private TipoDestinatarioType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static TipoDestinatarioType desdeValor(String label){
        return valueOf(label);
    }

}
