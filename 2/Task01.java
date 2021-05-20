import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Task01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String unicodeString = "\u042d\u0442\u043e \u043f\u0440\u0438\u043c\u0435\u0440";
        System.out.println("Исходная строка в Unicode: " + unicodeString);

        System.out.println("Массив байт в UTF8 посимвольно:");
        byte[] arr = unicodeString.getBytes("UTF-8");
        for(byte a: arr) {
            System.out.print(a);
        }
        System.out.println("");

        String result = new String(arr, "UTF-8");
        System.out.println("Вывод строки в формате UTF-8: " + result);

    }
}