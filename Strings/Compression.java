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

    public static int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        while (right < chars.length) {
            int start = right;
            while (right < chars.length && chars[right] == chars[start]) {
                right++;
            }
            chars[left++] = chars[start];
            if (right - start > 1) {
                String num = Integer.toString(right - start);
                for (char c : num.toCharArray()) {
                    chars[left++] = c;
                }
            }
        }
        return left;
    }
}
