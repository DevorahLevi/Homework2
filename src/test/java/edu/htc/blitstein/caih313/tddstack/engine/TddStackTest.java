package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Faculty;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Student;
import jdk.jfr.StackTrace;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TddStackTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDefaultConstructor()
    {
        int expected = TddStack.DEFAULT_DEPTH;
        assertEquals(expected, testObject.stackDepth);
    }

    @Test
    public void testNewStackIsEmpty() {
        TddStack tddStack = new TddStack();
        assertTrue(tddStack.isEmpty());
    }

    @Test
    public void testNewStackIsFull()
    {
        TddStack tddStack = new TddStack();
        assertFalse(tddStack.isFull());
    }

    @Test
    public void testNewStackPop()
    {
        TddStack tddStack = new TddStack();
        assertNull(tddStack.pop());
    }

    @Test
    public void testPopIsPush() {
        TddStack tddStack = new TddStack();
        //Faculty implements IStackable
        IStackable iStackableOrig = new Faculty();
        tddStack.push(iStackableOrig);
        IStackable iStackablePopped = tddStack.pop();
        assertEquals(iStackableOrig, iStackablePopped);
    }

    @Test
    public void testIsEmptyFalseAfterPush()
    {
        TddStack tddStack = new TddStack();
        IStackable object = new Faculty();
        tddStack.push(object);
        assertFalse(tddStack.isEmpty());
    }

    @Test
    public void testIsFullTrueAfterPushObjects()
    {
        TddStack tddStack = new TddStack(3);
        IStackable object1 = new Faculty();
        IStackable object2 = new Student();
        IStackable object3 = new Student();

        tddStack.push(object1);
        tddStack.push(object2);
        tddStack.push(object3);

        assertTrue(tddStack.isFull());
    }
}