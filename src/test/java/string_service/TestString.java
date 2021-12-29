package string_service;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestString {

    @Test
    public void TestEqualsCopyS(){
        StringBuilder str = new StringBuilder("crt");
        int N = 5;
        String expected = "crtcrtcrtcrtcrt";
        assertEquals(expected, StringProcessor.CopyS(str, N).toString());
    }
    @Test
    public void TestNCopyS(){
        StringBuilder str = new StringBuilder("crt");
        int N = 0;
        String expected = "";
        assertEquals(expected, StringProcessor.CopyS(str, N).toString());
    }

    @Test
    public void TestExceptionCopyS(){
        StringProcessor d = new StringProcessor();
        StringBuilder str = new StringBuilder("crt");
        int N = -1;
        try{
            d.CopyS(str, N);
        }catch (IllegalArgumentException err)
        {
            System.err.println("Число копий не может быть < 0");
        }
    }

    @Test
    public void TestEqualsStringMatch(){
        String str1 = "tkqwertytrqwerty-qwertyqwertya";
        String str2 = "qwerty";
        int expected = 4;
        assertEquals(expected, StringProcessor.StringMatch(str1, str2));
    }

    @Test
    public void TestEqualZeroStringMatch(){
        String str1 = "";
        String str2 = "qwerty";
        int expected = 0;
        assertEquals(expected, StringProcessor.StringMatch(str1, str2));
    }

    @Test
    public void TestExceptionStringMatch(){
        StringProcessor d = new StringProcessor();
        String str1 = "qwerty";
        String str2 = "";
        try{
            d.StringMatch(str1, str2);
        }catch (IllegalArgumentException err)
        {
            System.err.println("Строка не может быть пустой");
        }
    }

    @Test
    public void TestEqualsChangeNumbers(){
        String str = "12321";
        String expected = "одиндватридваодин";
        assertEquals(expected, StringProcessor.ChangeNumbers(str).toString());
    }

    @Test
    public void TestEqualsChangeStr(){
        StringBuilder str = new StringBuilder("1234567");
        String expected = "1357";
        assertEquals(expected, StringProcessor.ChangeStr(str).toString());
    }



}
