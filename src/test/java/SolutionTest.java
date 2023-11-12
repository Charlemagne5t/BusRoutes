import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numBusesToDestinationTest1() {
        int[][] routes = {
                {1, 2, 7},
                {3, 6, 7}
        };
        int source = 1;
        int target = 6;
        int expected = 2;
        int actual = new Solution().numBusesToDestination(routes, source, target);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numBusesToDestinationTest2() {
        int[][] routes = {
                {7, 12},
                {4, 5, 15},
                {6},
                {15, 19},
                {9, 12, 13}
        };
        int source = 15;
        int target = 12;
        int expected = -1;
        int actual = new Solution().numBusesToDestination(routes, source, target);

        Assert.assertEquals(expected, actual);
    }
}
