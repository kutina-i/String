package string_service;

public class StringProcessor {

            public static StringBuilder CopyS(StringBuilder s, int N) {
                StringBuilder newS = new StringBuilder();
                if (N == 0) {
                    return newS;
                }
                if (N < 0) {
                    throw new IllegalArgumentException("Число копий не может быть < 0");
                }
                for (int i = 0; i < N; i++) {
                    newS.append(s);
                }

                return newS;
            }

            public static int StringMatch(String str1, String str2) {
                int count = 0;
                if(!str2.isEmpty()){
                    String temp = str1.replace(str2, "");
                    count = (str1.length() - temp.length()) / str2.length();
                }else{
                    throw new IllegalArgumentException("Строка не может быть пустой");
                }
                return count;
            }

            public static StringBuilder ChangeNumbers(String str) {
                StringBuilder newSTR = new StringBuilder();
                char[] temp = str.toCharArray();

                for (int i = 0; i < temp.length; i++) {
                    if (temp[i] == 49) {
                        newSTR.append("один");
                    }
                    if (temp[i] == 50) {
                        newSTR.append("два");
                    }
                    if (temp[i] == 51) {
                        newSTR.append("три");
                    }
                }
                return newSTR;
            }

            public static StringBuilder ChangeStr(StringBuilder str) {
                for (int i = 1; i < str.length();  i += 1) {
                        str.deleteCharAt(i);
                }
                return str;
            }

}
