package org.example.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LoggerTest {

    @Test
    void checkIfTheSameInstance() {

        var log01 = Logger.getinstance();

        log01.setType("Test01");
        log01.setContent("First Object");

        var log02 = Logger.getinstance();

        log01.setType("Test02");
        log01.setContent("Second Object");

        Assertions.assertEquals(log01.getType(), log02.getType());

        Assertions.assertNotEquals(log01.getType(), "Test01");

    }
}