package DataStructure.DS.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by songchiyun on 2017. 7. 12..
 */
public class StringOperations {
    public static void main(String[] args){
        StringOperations app = new StringOperations();
        /*System.out.println("reverse String");
        System.out.println(app.reverseString("Hello World!"));   //pelindrom

        System.out.println("Suffixes");
        List<String> suffixes = app.getSuffixes("hello");
        for(String s : suffixes)
            System.out.println(s);

        System.out.println("Prefix List");
        List<String> prefixes = app.getPrefixes("hello world");
        for(String s : prefixes){
            System.out.println(s);
        }*/
        /*
        System.out.println("Longest common prefix");
        System.out.println(app.logestCommonPrefix("hello world", "hello"));
        */
        System.out.println("Longest Reapeted Substring");
        System.out.println(app.logestRepeatedSubstring("11 1 1 11 1 1 1"));


    }
    public String reverseString(String text){
        int length = text.length();  //O(1)
        StringBuilder reverseString = new StringBuilder();

        for(int index=length-1;index>=0;index--){
            reverseString.append(text.charAt(index));   // O(N) + O(1)
        }

        return reverseString.toString();

    }
    public List<String> getSuffixes(String text){

        int length = text.length(); //O(1)
        List<String> suffixes = new ArrayList<>();

        for(int i=0;i<length;++i){

            suffixes.add(text.substring(i, length));  //O(1) !!! fast
        }

        return suffixes;
    }

    public List<String> getPrefixes(String text){

        int length = text.length();
        List<String> prefixList = new ArrayList<>();

        for(int index=0;index<length+1;++index){
            prefixList.add(text.substring(0, index));  //O(1)
        }
        return prefixList;
    }

    public String logestCommonPrefix(String t1, String t2){

        int commonLength = Math.min(t1.length(), t2.length());

        for(int index=0;index <commonLength; ++index){
            if(t1.charAt(index) != t2.charAt(index)){
                return t1.substring(0,index);  // O(1)
            }
        }
        return t1.substring(0,commonLength);
    }

    public String logestRepeatedSubstring(String text){

        int length = text.length();
        List<String> suffixes = getSuffixes(text);

        Collections.sort(suffixes);
        String longestSubstring = "";
        for(int i=0;i<length-1;i++){

            String temp = logestCommonPrefix(suffixes.get(i), suffixes.get(i+1));

            if(temp.length() > longestSubstring.length()){
                longestSubstring = temp;
            }
        }
        return longestSubstring;

    }


}
