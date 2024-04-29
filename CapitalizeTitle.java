public class CapitalizeTitle {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String[] s = title.split(" ");
        String out = "";
        for(int i=0; i<s.length; i++){
            String temp = s[i];
            if(s[i].length() > 2){
                temp = temp.substring(0,1).toUpperCase() + temp.substring(1);
            }
            out += temp;
            if(i != s.length-1){
                out += " ";
            }
        }
        return out;
    }
}
