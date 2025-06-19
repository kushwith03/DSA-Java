package Strings;

public class Compression {
    public static void compress() {
        String str = "aaabcccdd";
        StringBuilder ans = new StringBuilder("");
        int count;
        int k;
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            ans.append(str.charAt(i));
            if (count > 1) {
                ans.append(count);
            }
        }
        System.out.println("Compressed String : " + ans);
    }
}
