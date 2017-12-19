import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestForMaven {

    @Test
    public void shouldAdd(){
        System.out.println("2+2");
    }

    @Test
    public void shouldMultiply(){
        System.out.println("2-2");
    }

    @BeforeTest
    public void prepareTests(){
        System.out.println("Tests preparing");
    }
}
