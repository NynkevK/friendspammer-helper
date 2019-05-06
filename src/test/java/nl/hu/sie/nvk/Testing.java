package nl.hu.sie.nvk;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test @Disabled
    public void test_fail() {
        fail("Let's test the failing unit test");
    }
}