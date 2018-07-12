/**  
 * Checks whether a certain bit in a bit field is set (to 1).
 */
public class BitTest {
    public static void main(String[] args) {
        int flags = 0x11;
        System.out.println(Integer.toBinaryString(flags) + " flags");
        
        int i = 5;
        int mask = 1 << i-1;
        System.out.println(Integer.toBinaryString(mask) + " mask");

        // mask bit at position i in flags
        int flagsMasked = (flags & mask);
        System.out.println(
              Integer.toBinaryString(flagsMasked) + " flagsMasked");
        
        // now test
        System.out.println(i + "-tes Bit gesetzt in " + flags + " : " + 
                           (flagsMasked != 0));
            
        // in concise form
        System.out.println(i + "-tes Bit gesetzt in " + flags + " : " + 
                           ((flags & 1<<i-1) != 0));  
    }
}
