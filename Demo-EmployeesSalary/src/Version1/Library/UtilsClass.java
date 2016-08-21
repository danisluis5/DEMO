package Version1.Library;

public class UtilsClass {
    public String changeCurrencyVND(String temp){
        String outString = "";
        int j = 0;
        int dot = temp.length()/3;
        if(temp.length()%3==0){
            dot = dot-1;
        }
        for(int i = temp.length()-1;i >= 0; i--){
            outString += temp.charAt(i);
            j++;
            if(j==3 && dot!=0){
               outString += ".";
               j = 0;
               dot--;
            }
        }
        return new StringBuilder(outString).reverse().toString();
    }
}
