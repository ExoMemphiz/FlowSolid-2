package controller;

import model.Game;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ViktorKim
 */
public class ControlQuizTest {
    
    public static ControlQuiz quiz;
    
    public ControlQuizTest() {
    }
    
    @Before
    public void setUp() {
        quiz = new ControlQuiz();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGameNames method, of class ControlQuiz. Checks if it can load the text file correctly.
     */
    @Test
    public void testGetGameNames() {
        System.out.println("getGameNames");
        String[] result = quiz.getGameNames();
        String [] expResult = {"Music", "Video Games"};
        assertArrayEquals(expResult, result);
    }
    
        @Test // sæt den til forkert
    public void testGetGameNames2() {
        System.out.println("getGameNames");
        String[] result = quiz.getGameNames();
        String [] expResult = {"Musics", "Video Games"};
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getSelectedGameName method, of class ControlQuiz.
     */
    @Test
    public void testGetSelectedGameName() {
        System.out.println("getSelectedGameName");
        String expResult = "Music";
        quiz.selectGame("Music");
        String result = quiz.getSelectedGameName();
        assertEquals(expResult, result);
    }

    /**
     * Test of addGame method, of class ControlQuiz.
     */
    @Test
    public void testAddGame() {
        System.out.println("addGame");
        String fullLine = "JUnitTestCase";
        quiz.addGame(fullLine);
        String[] selected = quiz.getGameNames();
        assertEquals(fullLine, selected[selected.length-1]);
    }

    /**
     * Test of addQuestion method, of class ControlQuiz.
     */
    @Test
    public void testAddQuestion() {
        System.out.println("addQuestion");
        String fullLine = "";
        ControlQuiz instance = new ControlQuiz();
        instance.addQuestion(fullLine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
