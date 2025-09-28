package behavioral.patterns.behavioural;

public class BillingVisitor implements Visitor {
    @Override
    public void visit(AdultPatient patient) {
        System.out.println("Billing Adult Patient");
    }

    @Override
    public void visit(SeniorPatient patient) {
        System.out.println("Billing Senior Patient");
    }

    @Override
    public void visit(ChildPatient patient) {
        System.out.println("Billing Child Patient");
    }
}
