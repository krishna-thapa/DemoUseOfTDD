package ScrabbleScoreTest;

import ScrabbleScore.ScrabbleScore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScrabbleScoreTest {

    private ScrabbleScore srabbleScore;

    @Before
    public void setUp(){
        srabbleScore = new ScrabbleScore();
    }

    @Test
    public void inputFirstArrayRetunSum(){
        String input = "aaaaab";
        Assert.assertEquals(5, srabbleScore.calculateSrabbleScore(input));
    }
}
