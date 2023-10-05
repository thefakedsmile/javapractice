package String;

public class ReverseString {
    public String StringReverser(String stringToBeReversed) {
        int stringLength = stringToBeReversed.length();
        StringBuilder sb = new StringBuilder();
        for (int i = stringLength - 1; i >= 0; i--) {
            sb.append(stringToBeReversed.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String test = new ReverseString().StringReverser("Hello");
        System.out.println(test);
    }
}
