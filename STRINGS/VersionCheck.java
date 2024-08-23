package STRINGS;

public class VersionCheck {
   
    public static int compareVersion(String version1, String version2) {
        
        String[] new1 = version1.split("\\.");
        String[] new2 = version2.split("\\.");
        int len = Math.min(new1.length,new2.length);
        for(int i =0 ; i < len ;i ++){
          int v1 = 0;
          v1 = Integer.parseInt(new1[i]);
          int v2 = 0;
          v2 = Integer.parseInt(new2[i]);
            if(v1 > v2 ) return 1;
            if(v1 < v2 ) return -1;
        }
       

        return 0;
        
    }
   
   
    public static void main(String[] args) {
        String version1 = "1.0", version2 = "1.0.0.0";
        System.out.println(compareVersion(version1, version2));
    }
}
