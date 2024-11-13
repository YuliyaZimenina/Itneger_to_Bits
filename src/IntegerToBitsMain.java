public class IntegerToBitsMain {
    public static void main(String[] args) {
        IntegerToBits showB = new IntegerToBits(8);
        IntegerToBits showI = new IntegerToBits(32);
        IntegerToBits showL = new IntegerToBits(64);

        System.out.println("Binary representation of the value 123: " );
        showB.show(123);
        System.out.println("Binary representation of the value 87987: " );
        showI.show(87987);
        System.out.println("Binary representation of the value 237658768: " );
        showL.show(237658768);

        //You can also display the least significant bits for any integer value
        System.out.println("The lower 8 bits of the value 87987:");
        showB.show(87987);
    }
}