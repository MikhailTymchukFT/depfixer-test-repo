package example;

import org.junit.Test;

public class TargetTest {
    @Test
    public void testName() throws Exception {
        Target.name();
        System.out.println("aaa");
        throw new Exception();
    }
}