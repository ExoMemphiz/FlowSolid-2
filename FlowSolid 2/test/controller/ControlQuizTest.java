package controller;

import model.Game;
import model.WordPair;
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
        assertNotEquals(expResult, result);
    }

    /**
     * Test of getSelectedGameName method, of class ControlQuiz.
     */
    @Test
    public void testGetSelectedGameName() {
        System.out.println("getSelectedGameName");
        quiz.selectGame("Music");
        String result = quiz.getSelectedGameName();
        assertEquals(quiz.getSelectedGameName(), result);
    }

    /**
     * Test of addGame method, of class ControlQuiz. Remember to delete stuff!
     */
    @Test
    public void testAddGame() {
        System.out.println("addGame");
        String fullLine = "JUnitTestCase, JUnitTestCase, Question, Answer";
        quiz.addGame(fullLine);
        quiz.selectGame("JUnitTestCase");
        String selected = quiz.getSelectedGame().toString();
        assertEquals(fullLine, selected);
    }
    
}
