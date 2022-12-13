package lab7.hashMapTest;

import java.util.Objects;

public class TestClass {
    private int value;

    public TestClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return value == testClass.value;
    }

    @Override
    public int hashCode() {
        return value % 2;
    }
}
