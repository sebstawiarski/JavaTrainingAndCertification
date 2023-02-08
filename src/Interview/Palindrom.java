package Interview;

public class Palindrom {

    //KAJAK

    public static void main(String[] args) {
        System.out.println(isPallndrom("kajak"));
    }
    public static boolean isPallndrom(String word) {
        int n = word.length();
        for (int i = 0; i < (n/2); i++) {
            if(word.charAt(i) !=word.charAt(n-i-1)) {
                return false;
            }
        }

        return true;
    }
}
