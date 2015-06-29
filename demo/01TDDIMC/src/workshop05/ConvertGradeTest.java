package workshop05;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConvertGradeTest {
    
    @Parameters
    public static Collection<Object[]> setupDatas() {
        return Arrays.asList(new Object[][] {
                {80, "A"},
                {70, "B"}
        });
    }

    private int score;
    private String expectedGrade;
    
    public ConvertGradeTest(int score, String expectedGrade) {
        this.score = score;
        this.expectedGrade = expectedGrade;
    }

    @Test
    public void flowOfConvertScoreToGradeProcess() {
        Calulator calculator = new Calulator();
        String actualGrade = calculator.convert(this.score);
        assertEquals(this.expectedGrade, actualGrade);
    }

}
