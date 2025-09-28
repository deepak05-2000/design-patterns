package behavioral.patterns.behavioural;

public class DiagnosisVisitor implements Visitor {
    @Override
    public void visit(AdultPatient patient) {
        System.out.println("Diagnosing Adult Patient");
    }

    @Override
    public void visit(SeniorPatient patient) {
        System.out.println("Diagnosing Senior Patient");
    }

    @Override
    public void visit(ChildPatient patient) {
        System.out.println("Diagnosing Child Patient");
    }
}
