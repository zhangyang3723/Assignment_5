package assignment_5_YangZhang;

public class SingleNumber {
    public int singleNum(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = array[i] ^ a;
        }
        return a;
    }
}
