public class exercises {
    public static void main(String[] args) {
        // Q2
        System.out.println(Integer.parseInt("100011", 2));  // 35

        // Q7
        System.out.println(Integer.parseInt("1011011", 2));  // 91

        // Q11
        System.out.println(Integer.toBinaryString(478));  // 111011110

        // Q21
        int sum1 = Integer.parseInt("1111000", 2) + Integer.parseInt("1001110", 2);
        System.out.println(Integer.toBinaryString(sum1));  // 11000110
        System.out.println(sum1);  // 198

        // Q22
        int sum2 = Integer.parseInt("1000001", 2) + Integer.parseInt("1100001", 2);
        System.out.println(Integer.toBinaryString(sum2));  // 10100010
        System.out.println(sum2);  // 162

        // Q30
        int i = 0b1001;
        System.out.println(i);  // 9
    }
}
