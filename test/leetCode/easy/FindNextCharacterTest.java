package leetCode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class FindNextCharacterTest {

    @Test
    public void nextGreatestLetter() {
        FindNextCharacter find = new FindNextCharacter();
        assertThat(find.nextGreatestLetter(new char[]{'c','f','j'}, 'j'), is('c'));
        assertThat(find.nextGreatestLetter(new char[]{'c','f','j'}, 'a'), is('c'));
        assertThat(find.nextGreatestLetter(new char[]{'c','f','j'}, 'k'), is('c'));
        assertThat(find.nextGreatestLetter(new char[]{'c','f','j'}, 'c'), is('f'));
        assertThat(find.nextGreatestLetter(new char[]{'a','b','c','c','c','c','f','f','f','j','k'}, 'c'), is('f'));
        assertThat(find.nextGreatestLetter(new char[]{'e','e','e','e','e','e','n','n','n','n'}, 'e'), is('n'));
    }
}