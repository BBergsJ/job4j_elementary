package ru.job4j.pojo;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ShopTest {

    @Test
    public void whenDeleteSecond() {

        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        Product[] products = new Product[5];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;

        Product[] expected = new Product[5];
        expected[0] = milk;
        expected[1] = egg;

        Shop test = new Shop();
        test.delete(products, 1);
        assertThat(products, is(expected));
    }
}