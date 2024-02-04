package codingninja;

public class ReverseStringWordWise {
    static String reverseStringWordWise(String input) {
        // Write your code here
        StringBuffer sb=new StringBuffer();
        int count=input.length();
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)==' '){
                for(int j=i+1;j<count;j++){
                    sb.append(input.charAt(j));
                }
                sb.append(' ');
                count=i;
            }
        }
        for (int j=0;j<count;j++){
            sb.append(input.charAt(j));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStringWordWise("hello this"));
    }
}
