package ru.job4j.collection.lambda;

import org.junit.Test;
import ru.job4j.collection.lambda.MRSupplier;

import java.util.function.Supplier;
import static org.junit.Assert.assertEquals;

public class MRSupplierTest {
    @Test
    public void test() {
        Supplier<String> supplier = MRSupplier.supplier();
        assertEquals("", supplier.get());
    }
}