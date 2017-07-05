package b;

/**
 * Created by mikhail_alferov on 19.04.2017.
 */
public class CharTransormer {
    public static void main(String[] args) {
        String str = "\\u0404\\u0414\\u0420\\u041F\\u041E\\u0423";
        str = str.replace("\\", "").replace(" ", "");
        String[] arr = str.split("u");
        String text = "";
        for(int i = 1; i < arr.length; i++){
            int hexVal = Integer.parseInt(arr[i], 16);
            text += (char)hexVal;
        }
        System.out.println(text);
    }
}
