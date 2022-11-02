package BuildTower;

import org.junit.Test;

import static BuildTower.InviteMore.inviteMoreWomen;
import static org.junit.Assert.assertEquals;

public class InviteMoreTest {
    @Test
    public void basicTests() {
        assertEquals(true, inviteMoreWomen(new int[] {1, -1, 1}));
        assertEquals(false, inviteMoreWomen(new int[] {-1, -1, -1}));
        assertEquals(false, inviteMoreWomen(new int[] {1, -1}));
        assertEquals(true, inviteMoreWomen(new int[] {1, 1, 1}));
    }
}