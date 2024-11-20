package OOPSConcept.Topic12Interface.ex3;

public class TestInterface {
    public static void main(String[] args){
        Bank b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}
