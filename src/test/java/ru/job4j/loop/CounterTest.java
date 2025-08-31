package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whentStart0Finish10Then55() {
        int start = 0;
        int finish = 10;
        double expected = 55;
        double output = Counter.sum(start, finish);
        double value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whentStart3Finish8Then33() {
        int start = 3;
        int finish = 8;
        double expected = 33;
        double output = Counter.sum(start, finish);
        double value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whentStart15Finish8Then0() {
        int start = 15;
        int finish = 8;
        double expected = 0;
        double output = Counter.sum(start, finish);
        double value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}
