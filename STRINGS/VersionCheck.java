package STRINGS;

public class VersionCheck {
   
    public static int compareVersion(String version1, String version2) {
        
        String[] new1 = version1.split("\\.");
    String[] new2 = version2.split("\\.");
    int len1 = new1.length;
    int len2 = new2.length;
    int maxLen = Math.max(len1, len2);

    for (int i = 0; i < maxLen; i++) {
        int v1 = (i < len1) ? Integer.parseInt(new1[i]) : 0;
        int v2 = (i < len2) ? Integer.parseInt(new2[i]) : 0;
        
        if (v1 > v2) return 1;
        if (v1 < v2) return -1;
    }

    return 0;
        
    }
   
   
    public static void main(String[] args) {
        String version1 = "1.20", version2 = "1.10";
        System.out.println(compareVersion(version1, version2));
    }
}
