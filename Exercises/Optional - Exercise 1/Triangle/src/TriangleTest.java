package code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TriangleTest {
    static Triangle equilateralTriangle;
    static Triangle isoscelesTriangle;
    static Triangle scaleneTriangle;
    static Triangle invalidTriangle;
    static Triangle rightTriangle;
    static Triangle anotherInvalidTriangle;

    @BeforeAll
    static void setup() {
        equilateralTriangle = new Triangle(15.5f, 15.5f, 15.5f);
        isoscelesTriangle = new Triangle(11.24f, 11.24f, 6.1f);
        scaleneTriangle = new Triangle(15.0f, 20.0f, 30.0f);
        invalidTriangle = new Triangle(1.2f, 155.5f, 0.5f);
        anotherInvalidTriangle = new Triangle(-1.2f, -155.5f, -0.5f);
        rightTriangle = new Triangle(3.0f, 4.0f, 5.0f);
    }

    @Test
    void isValid() {
        Assertions.assertTrue(isoscelesTriangle.isValid());
    }

    @Test
    void isRight() {
        Assertions.assertFalse(isoscelesTriangle.isRight());
        Assertions.assertTrue(rightTriangle.isRight());
    }

    @Test
    void checkType() {
        Assertions.assertSame(equilateralTriangle.CheckType(), TriangleType.Equilateral);
        Assertions.assertSame(isoscelesTriangle.CheckType(), TriangleType.Isosceles);
        Assertions.assertSame(scaleneTriangle.CheckType(), TriangleType.Scalene);
        Assertions.assertSame(invalidTriangle.CheckType(), TriangleType.INVALID);
        Assertions.assertSame(anotherInvalidTriangle.CheckType(), TriangleType.INVALID);
    }
}