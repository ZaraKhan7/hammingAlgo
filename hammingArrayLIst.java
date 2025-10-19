import java.util.ArrayList;
import java.util.Arrays;

public class HammingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> bits = new ArrayList<>(Arrays.asList(0, 1, 1, 0, 1, 0, 0, 1, 1, 0 )); 

        // Calculate sums for Hamming bits H1, H2, H3, H4
        for (int n = 0; n < 4; n++) {

            int blockSize = (int) Math.pow(2, n);
            int startIndex = blockSize;
            int total = 0;

            int index = startIndex;
          
            while (index < bits.size()) {
                for (int j = 0; j < blockSize && (index + j) < bits.size(); j++) {
                    total += bits.get(index + j);
                }
                index += blockSize * 2; // Skip one block
            }

            System.out.println("For Hamming Bit H" + (n + 1) + ", total sum = " + total);
        }
    }
}
