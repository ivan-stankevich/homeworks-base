package org.ivan_stankevich.homeworks.homework4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void squareMatrixIfValuesIsEqual() {
        // Если матрица квадратная ожидаемое значение 1 (True)
        int result= Task1.equals(1,1);
        assertEquals(1,result);
    }
}
