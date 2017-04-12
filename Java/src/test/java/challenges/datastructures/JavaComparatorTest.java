package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/11/17.
 */
public class JavaComparatorTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;
    private int numOfTestCases;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expected = null;
        numOfTestCases = 2;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void sortByScoreTest(){
        data = numOfTestCases + "\n" +
                "david 100\n" +
                "amy 150";
        expected = "amy 150\n" +
                "david 100\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaComparator.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void sortByScoreLessThanTest(){
        data = numOfTestCases + "\n" +
                "david 150\n" +
                "amy 100";
        expected = "david 150\n" +
                "amy 100\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaComparator.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void sortByNameIfScoresAreEqualTest(){
        data = numOfTestCases + "\n" +
                "david 150\n" +
                "amy 150";
        expected = "amy 150\n" +
                "david 150\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaComparator.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void hackerrankTestCaseTest(){
        data = "100\n" +
                "bcaab 7\n" +
                "bc 6\n" +
                "acbb 0\n" +
                "b 10\n" +
                "bcbc 6\n" +
                "cc 5\n" +
                "caba 7\n" +
                "bcbbb 3\n" +
                "bbac 8\n" +
                "bb 11\n" +
                "bb 7\n" +
                "aabca 10\n" +
                "ba 10\n" +
                "bcba 11\n" +
                "bbbb 10\n" +
                "cacab 10\n" +
                "bccac 6\n" +
                "a 4\n" +
                "cb 1\n" +
                "ccaa 2\n" +
                "baac 7\n" +
                "ab 6\n" +
                "ccbca 12\n" +
                "accab 2\n" +
                "bbcb 8\n" +
                "aba 6\n" +
                "bcca 13\n" +
                "ca 2\n" +
                "bbab 9\n" +
                "abbba 10\n" +
                "cba 5\n" +
                "baccb 1\n" +
                "aca 9\n" +
                "caacb 12\n" +
                "bc 10\n" +
                "aabc 7\n" +
                "cbb 14\n" +
                "a 1\n" +
                "ab 3\n" +
                "aaaa 3\n" +
                "c 8\n" +
                "bbbbb 13\n" +
                "a 12\n" +
                "acbba 8\n" +
                "cb 5\n" +
                "ccba 12\n" +
                "ac 14\n" +
                "ba 7\n" +
                "a 12\n" +
                "a 10\n" +
                "bbb 0\n" +
                "ccb 9\n" +
                "cccb 11\n" +
                "b 4\n" +
                "bbbc 10\n" +
                "a 14\n" +
                "aaac 2\n" +
                "cbba 9\n" +
                "cab 2\n" +
                "bc 7\n" +
                "cacc 6\n" +
                "ca 5\n" +
                "bbc 5\n" +
                "cccaa 13\n" +
                "bbbab 3\n" +
                "aaabc 9\n" +
                "acc 11\n" +
                "bbbaa 13\n" +
                "cc 1\n" +
                "cc 9\n" +
                "a 7\n" +
                "cbbc 14\n" +
                "a 13\n" +
                "cb 5\n" +
                "aab 10\n" +
                "ccb 8\n" +
                "c 4\n" +
                "ccbbb 3\n" +
                "aaba 3\n" +
                "b 11\n" +
                "acac 1\n" +
                "cbcb 13\n" +
                "babab 2\n" +
                "ca 0\n" +
                "ab 9\n" +
                "ba 3\n" +
                "a 6\n" +
                "abba 11\n" +
                "cbaa 11\n" +
                "caa 1\n" +
                "abac 3\n" +
                "ca 2\n" +
                "ba 12\n" +
                "b 11\n" +
                "cc 9\n" +
                "a 13\n" +
                "abc 9\n" +
                "aa 13\n" +
                "caabc 3\n" +
                "aabbb 2";
        expected = "a 14\n" +
                "ac 14\n" +
                "cbb 14\n" +
                "cbbc 14\n" +
                "a 13\n" +
                "a 13\n" +
                "aa 13\n" +
                "bbbaa 13\n" +
                "bbbbb 13\n" +
                "bcca 13\n" +
                "cbcb 13\n" +
                "cccaa 13\n" +
                "a 12\n" +
                "a 12\n" +
                "ba 12\n" +
                "caacb 12\n" +
                "ccba 12\n" +
                "ccbca 12\n" +
                "abba 11\n" +
                "acc 11\n" +
                "b 11\n" +
                "b 11\n" +
                "bb 11\n" +
                "bcba 11\n" +
                "cbaa 11\n" +
                "cccb 11\n" +
                "a 10\n" +
                "aab 10\n" +
                "aabca 10\n" +
                "abbba 10\n" +
                "b 10\n" +
                "ba 10\n" +
                "bbbb 10\n" +
                "bbbc 10\n" +
                "bc 10\n" +
                "cacab 10\n" +
                "aaabc 9\n" +
                "ab 9\n" +
                "abc 9\n" +
                "aca 9\n" +
                "bbab 9\n" +
                "cbba 9\n" +
                "cc 9\n" +
                "cc 9\n" +
                "ccb 9\n" +
                "acbba 8\n" +
                "bbac 8\n" +
                "bbcb 8\n" +
                "c 8\n" +
                "ccb 8\n" +
                "a 7\n" +
                "aabc 7\n" +
                "ba 7\n" +
                "baac 7\n" +
                "bb 7\n" +
                "bc 7\n" +
                "bcaab 7\n" +
                "caba 7\n" +
                "a 6\n" +
                "ab 6\n" +
                "aba 6\n" +
                "bc 6\n" +
                "bcbc 6\n" +
                "bccac 6\n" +
                "cacc 6\n" +
                "bbc 5\n" +
                "ca 5\n" +
                "cb 5\n" +
                "cb 5\n" +
                "cba 5\n" +
                "cc 5\n" +
                "a 4\n" +
                "b 4\n" +
                "c 4\n" +
                "aaaa 3\n" +
                "aaba 3\n" +
                "ab 3\n" +
                "abac 3\n" +
                "ba 3\n" +
                "bbbab 3\n" +
                "bcbbb 3\n" +
                "caabc 3\n" +
                "ccbbb 3\n" +
                "aaac 2\n" +
                "aabbb 2\n" +
                "accab 2\n" +
                "babab 2\n" +
                "ca 2\n" +
                "ca 2\n" +
                "cab 2\n" +
                "ccaa 2\n" +
                "a 1\n" +
                "acac 1\n" +
                "baccb 1\n" +
                "caa 1\n" +
                "cb 1\n" +
                "cc 1\n" +
                "acbb 0\n" +
                "bbb 0\n" +
                "ca 0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaComparator.main(args);
        assertEquals(expected, stdout.toString());
    }
}
