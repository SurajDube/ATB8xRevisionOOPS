package OOPSConcept.Topic7Inheritance.Type3HeirarchicalInheritance.RealWorld.ex2;

public class FourWheeler extends Vehicle{
    double increasePriceBy = 1; // 1 times

    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println(
                "After modification, The price of car is: Rs." + basePrice
        );
    }
}
