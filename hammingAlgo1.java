public class HammingAlgo1{

    public static void main(String[] args) {
        // Example binary message
        int[] msg = {9, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0};
        String parityScheme = "ODD";  // Change to "EVEN" for even parity
        int msgLength = msg.length;

        System.out.println("Hamming Code Parity Bit Calculation");
        System.out.println("Parity Scheme: " + parityScheme);

        // ---- H1 ----
        int sum1 = 0;
        int start1 = 1;
        for (int i = start1 - 1; i < msgLength; i += 2 * start1) {
            for (int j = i; j < i + start1 && j < msgLength; j++) {
                if (msg[j] == 1) {
                    sum1++;
                }
            }
        }
        int h1 = getHammingBit(parityScheme, sum1);
        System.out.println("Sum s1 = " + sum1 + "   H1 = " + h1);

        // ---- H2 ----
        int sum2 = 0;
        int start2 = 2;
        for (int i = start2 - 1; i < msgLength; i += 2 * start2) {
            for (int j = i; j < i + start2 && j < msgLength; j++) {
                if (msg[j] == 1) {
                    sum2++;
                }
            }
        }
        int h2 = getHammingBit(parityScheme, sum2);
        System.out.println("Sum s2 = " + sum2 + "   H2 = " + h2);

        // ---- H3 ----
        int sum3 = 0;
        int start3 = 4;
        for (int i = start3 - 1; i < msgLength; i += 2 * start3) {
            for (int j = i; j < i + start3 && j < msgLength; j++) {
                if (msg[j] == 1) {
                    sum3++;
                }
            }
        }
        int h3 = getHammingBit(parityScheme, sum3);
        System.out.println("Sum s3 = " + sum3 + "   H3 = " + h3);

        // ---- H4 ----
        int sum4 = 0;
        int start4 = 8;
        for (int i = start4 - 1; i < msgLength; i += 2 * start4) {
            for (int j = i; j < i + start4 && j < msgLength; j++) {
                if (msg[j] == 1) {
                    sum4++;
                }
            }
        }
        int h4 = getHammingBit(parityScheme, sum4);
        System.out.println("Sum s4 = " + sum4 + "   H4 = " + h4);

        // ---- H5 ----
        int sum5 = 0;
        int start5 = 16;
        for (int i = start5 - 1; i < msgLength; i += 2 * start5) {
            for (int j = i; j < i + start5 && j < msgLength; j++) {
                if (msg[j] == 1) {
                    sum5++;
                }
            }
        }
        int h5 = getHammingBit(parityScheme, sum5);
        System.out.println("Sum s5 = " + sum5 + "   H5 = " + h5);

       
        System.out.println("\nFinal Hamming Bits: [" + h1 + ", " + h2 + ", " + h3 + ", " + h4 + ", " + h5 + "]");
    }

    // Method to get parity bit (H1, H2, H3, ...)
    public static int getHammingBit(String parityScheme, int sum) {
        int remainder = sum % 2;

        if (parityScheme.equalsIgnoreCase("ODD")) {
            // For odd parity
            if (remainder == 0)
                return 1;
            else
                return 0;
        } else {
            // For even parity
            if (remainder == 0)
                return 0;
            else
                return 1;
        }
    }
}

