public class Task5 {
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if(character + key < 0 ){
                char encryptedChar = (char)(256 + (character + key) % 256);
                result.append(encryptedChar);
                continue;
            }
            char encryptedChar = (char)((character + key) % 256);
            result.append(encryptedChar);
        }

        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, -key);
    }
}
