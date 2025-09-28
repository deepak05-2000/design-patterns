package behavioral.patterns.behavioural;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Patient[] patients = {
                new AdultPatient(),
                new ChildPatient(),
                new SeniorPatient()
        };
        Visitor diagnosisVisitor = new DiagnosisVisitor();
        Visitor billingVisitor = new BillingVisitor();
        for(Patient patient : patients) {
            patient.accept(diagnosisVisitor);
            patient.accept(billingVisitor);
        }
    }
}
