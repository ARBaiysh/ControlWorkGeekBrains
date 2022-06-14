public class Main {
    public static void main(String[] args) {

    }
    private static String[] initArray() {
        return new String[]{"asd", "asdff", "as", "ass"};
    }

    private static String[] arrayOnlyUpToThreeCharacters(String[] array) {
        if (array.length == 0) {
            return array;
        }
        StringBuilder st = new StringBuilder();
        for (String s : array) {
            if (s.length() < 4) {
                st.append(s).append(",");
            }
        }
        return st.toString().split(",");
    }
}
