import java.util.Objects;

public class task3 {
    public static void main(String[] args) {
        String[] words = {"cd", "ac", "dc", "ca", "zz"};
        int count = 0;
        for (int i = 0; i < words.length-1; i++){
            for (int j = i + 1; j < words.length; j++){
                if (Objects.equals(words[i], reverse(words[j]))){
                    count++;
                }
            }
        }
        System.out.print(count + " ta");
    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i > -1; --i){
            sb.append(str.charAt(i));
        }
        return new String(sb);
    }
}
