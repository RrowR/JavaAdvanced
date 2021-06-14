import org.junit.jupiter.api.Test;

public class ThinkingTest {
    @Test
    public void test01(){
        String a = "端午安康";
        char[] chars = a.toCharArray();
        for (char c : chars) {
            System.out.println((int)c);
        }
    }
}
