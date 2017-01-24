import org.junit.Test;

public class TestClassHelloWorld {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Test
    public void printText() {
        System.out.println(text);
    }

}

