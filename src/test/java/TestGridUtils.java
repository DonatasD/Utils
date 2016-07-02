import com.donatasd.utils.GridUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class to check {@link GridUtils} functions.
 *
 * @author Donatas Daubaras
 */
public class TestGridUtils {
    /**
     *  Test GridUtils.getColor function. 0 indicates white field and 1 indicates black field.
     */
    @Test
    public void testGetColor() {
        /*  Check if white grid fields are identifies correctly
            (going diagonal, horizontal and vertical from 0,0 coordinates */
        Assert.assertEquals(GridUtils.getColor(0,0), 0);
        Assert.assertEquals(GridUtils.getColor(1,1), 0);
        Assert.assertEquals(GridUtils.getColor(0,2), 0);
        Assert.assertEquals(GridUtils.getColor(2,0), 0);
        /*  Check if black grid fields are identifies correctly
            (going diagonal, horizontal and vertical from 0,1 coordinates */
        Assert.assertEquals(GridUtils.getColor(0,1), 1);
        Assert.assertEquals(GridUtils.getColor(1,2), 1);
        Assert.assertEquals(GridUtils.getColor(0,3), 1);
        Assert.assertEquals(GridUtils.getColor(2,1), 1);
    }
}