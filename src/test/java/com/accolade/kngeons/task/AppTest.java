package com.accolade.kngeons.task;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

    private List<Integer> getArrayFromTxtFile(final String fn) throws FileNotFoundException {
        final List<Integer> A = new ArrayList<>();
        Path resourceDirectory = Paths.get("src","test","resources", fn);
        File file = new File(resourceDirectory.toFile().getAbsolutePath());
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            String inArray[] = line.split(",");
            for (String i : inArray) {
                A.add(Integer.parseInt(i.strip()));
            }
        }
        myReader.close();
        return A;
    }

    @Test
    public void testBigNumbers() throws FileNotFoundException {
        final List<Integer> A = getArrayFromTxtFile("list.txt");
        assertEquals(50997, App.solution(A).intValue());
    }

    @Test
    public void testBigArray() throws FileNotFoundException {
        final List<Integer> A = getArrayFromTxtFile("list_from_1.txt");
        assertEquals(100000, App.solution(A).intValue());
    }
}
