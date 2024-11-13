public class IntegerToBits {
    int numberBits;

    IntegerToBits(int number) {
        numberBits = number;
    }

    //Method for displaying a bit pattern
    void show(long value) {
        long mask = 1;
        //Shift to the left of the value 1 to the desired position
        mask <<= numberBits - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((value & mask) != 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
            spacer++;
            if ((spacer & 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}



