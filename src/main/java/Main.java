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

    private static void printArray(String[] outputArrays) {
        StringBuilder st = new StringBuilder("[");
        for (int i = 0; i < outputArrays.length; i++) {
            if (outputArrays[i].length() > 0) {
                st.append('"').append(outputArrays[i]).append('"');
                if (i < outputArrays.length - 1) {
                    st.append(",");
                }
            }
        }
        st.append("]");
        System.out.println(st);
    }
}
