package behavioral.patterns.behavioural;

public interface Visitor {
    void visit(AdultPatient patient);
    void visit(SeniorPatient patient);
    void visit(ChildPatient patient);
}
