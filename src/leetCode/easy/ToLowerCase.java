package leetCode.easy;

public class ToLowerCase {
    public String toLowerCase(String str) {
        if (str == null || str.isEmpty()) return "";
        char [] table = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                'p','q','r','s','t','u','v','w','x','y','z'};

        StringBuffer strBuf = new StringBuffer();
        for (char ch : str.toCharArray()) {
           if (ch >= 65  && ch <= 90) {
               strBuf.append(table[ch-65]);
           } else {
               strBuf.append(ch);
           }
        }
        return strBuf.toString();
    }
}
