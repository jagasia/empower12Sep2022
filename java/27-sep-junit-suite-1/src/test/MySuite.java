package test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({MathematicsTest2.class,MathematicsTest3.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(Admin.class)
@SuiteClasses({MathematicsTest1.class,MathematicsTest3.class})
public class MySuite {

}
