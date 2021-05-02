public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String string1 = str1;
        String string2 = str2;
        String string3 = string1.concat(string2);
        return string3;
    }
    public Integer getIndexOrNull(String str1, char letter){
        String string1 = str1;
        char character = letter;
        int a = string1.indexOf(character); // a is 11
        return a;
    }
    public Integer getIndexOrNull(String str1, String str2){
        String string1 = str1;
        String string2 = str2;
        int string3 = str1.indexOf(str2);
        return string3;
    }
    public String concatSubstring(String str1, int x, int y, String str2){
        String string1 = str1;
        String string2 = str2;
        int ex1 = x;
        int ex2 = y;
        String string3 = string1.substring(ex1,ex2);
        String string4 = string3.concat(string2);
        return string4;
    }
}