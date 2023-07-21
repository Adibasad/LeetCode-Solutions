class Solution {
    public String gcdOfStrings(String str1, String str2) {
    if(!(str1+str2).equals(str2+str1)) return "";

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int n1, int n2){
       return n2 == 0 ? n1 : gcd(n2, n1%n2);

    }
}