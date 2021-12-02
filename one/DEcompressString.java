package com.neha.gs.one;

public class DEcompressString {

    public static void main(String[] args) {
        String input = "a3b3c1";
        System.out.println("a3b3c1".equals(decompress("aaabbbc")));
        System.out.println("".equals(decompress("")));
        System.out.println("a3b3a2d1".equals(decompress("aaabbbaad")));
    }

    public static String decompress(String input) {
        if (input.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        char lastSeen = 0;
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (lastSeen == current) {
                count++;
            } else {
                if (lastSeen != 0) {
                    sb.append(lastSeen).append(count);
                }
				count=1;
				lastSeen=current;
            }
        }
		sb.append(lastSeen).append(count);
        return sb.toString();
    }

}
