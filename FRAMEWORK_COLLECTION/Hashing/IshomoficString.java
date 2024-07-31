package FRAMEWORK_COLLECTION.Hashing;

public class IshomoficString {
    public static boolean  isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] m1 = new int[200];
        int[] m2 = new int[200];
        for(int i = 0 ; i < s.length(); i++){
            if(m1[s.charAt(i)] != m2[t.charAt(i)]){
               return false;
            }
            m1[s.charAt(i)] = i +1;
             m2[t.charAt(i)] = i+1;
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s= "egg" , t = "adf";
        System.out.println(isIsomorphic(s, t));
    }
}
