package lessons._21;

import com.itstep.lesson._10.CharList;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

@DisplayName("CharList  class Test")
public class Practice {
    private CharList testData = null;

    @BeforeEach
    public void prepareData() {
        testData = new CharList("Hello");
    }

    @Test
    @DisplayName("Validate the reverse as String value method from CharList class")
    public void charListReverseAsStringMethod() {
        String reverseToString = testData.reverseList().toString();
        MatcherAssert.assertThat(reverseToString, Matchers.equalToIgnoringCase("olleh"));
    }
    @Test
    @DisplayName("Validate the reverse as Array value method from CharList class")
    public void charListReverseAsArrayMethod() {
        ArrayList<Character> reverseArrayResult=testData.reverseList().internalList;

        ArrayList<Character> expectedArray= new ArrayList<>();
        Collections.addAll(expectedArray,'h','e','l','l','o');

        MatcherAssert.assertThat(reverseArrayResult,Matchers.contains(expectedArray));
    }

}
