package aula7;

public class Ex07_01LMS {
    public static String[] soletrandoStr(String input) {
        String[] characters = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            characters[i] = String.valueOf(input.charAt(i));
        }
        return characters;
    }
}
