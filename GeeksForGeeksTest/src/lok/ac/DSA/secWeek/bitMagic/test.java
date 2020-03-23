package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 13-06-2019.
 */
public class test {

// Utility function to check number of
// elements having set msb as of pattern
        static int checkBit(int pattern, int arr[], int n)
        {
            int count = 0;

            for (int i = 0; i < n; i++)
                if ((pattern & arr[i]) == pattern)
                    count++;

            return count;
        }

// Function for finding maximum and
// value pair
    static int maxAND(int arr[], int n)
    {
        int res = 0, count;

        // iterate over total of 30bits
        // from msb to lsb
        for (int bit = 31; bit >= 0; bit--) {

            // find the count of element
            // having set msb

            int t1 = (1 << bit);

            int t = res | t1;
            count = checkBit(t, arr, n);

            // if count >= 2 set particular
            // bit in result
            if (count >= 2)
                res |= (1 << bit);
        }

        // Find the elements
        if (res == 0)
            System.out.println("Not Possible");

        else {

            // print the pair of elements
            System.out.print("Pair = ");

            count = 0;

            for (int i = 0; i < n && count < 2; i++) {

                // inc count value after
                // printing element
                if ((arr[i] & res) == res) {
                    count++;
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        // return the result value
        return res;
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 4, 8, 6, 2 };
        int n = arr.length;
        System.out.println("Maximum AND Value = "
                + maxAND(arr, n));

    }
}
