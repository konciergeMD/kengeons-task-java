package com.accolade.kngeons.task;

import com.accolade.kngeons.task.App;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
    @Test
    public void testSolutionBasic() {
        assertEquals(5, App.solution(Arrays.asList(
                1, 3, 6, 4, 1, 2
        )).intValue());
        assertEquals(4, App.solution(Arrays.asList(
                1, 2, 3
        )).intValue());
        assertEquals(2, App.solution(Arrays.asList(
                -2, -1, 1
        )).intValue());
        assertEquals(1, App.solution(Arrays.asList(
                -2, -1, 4
        )).intValue());
        assertEquals(1, App.solution(Arrays.asList(
                -2, -1, 0, 4
        )).intValue());
        assertEquals(1, App.solution(Arrays.asList(
                -1, -3
        )).intValue());
    }
}
