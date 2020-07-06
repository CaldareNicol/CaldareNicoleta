package lessons._21;

import lessons._19.FirstTest;
import lessons._20.Test_20;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(value = {
        FirstTest.class,
        Test_20.class,
        Practice.class

})
public class RunAllMyTests {

}
