public interface Visitor {
    void visit(Figuri figura);
    String visit(Cerc cerc);
    String visit(Patrat patrat);
    String visit(Punct punct);
}
