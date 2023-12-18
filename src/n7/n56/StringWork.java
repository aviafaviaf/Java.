package n7.n56;

public interface StringWork {
    static int length(String str) {
        return str.length();
    }
    static String onPositions(String str) {
        if (str.isEmpty()) return "";
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }

    static String reverse(String str) {
        char el;
        StringBuilder ans = new StringBuilder(str);
        for (int i = 0; i < str.length() / 2; i++) {
            el = ans.charAt(i);
            ans.replace(i, i + 1, String.valueOf(ans.charAt(ans.length() - i - 1)));
            ans.replace(ans.length() - i - 1, ans.length() - i, String.valueOf(el));
        }
        return ans.toString();
    }
}
