package us.joshhoffmann.test;

import org.junit.Test;
import us.mattgreen.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestMeals {

    @Test
    public void testGetItem() {
        Meals aMeal = new Meals(MealType.BREAKFAST, "Sushi", 220);

        assertTrue("Wrong Item", aMeal.getItem().equals("Sushi"));
    }

    @Test
    public void testGetCalories() {
        Meals aMeal = new Meals(MealType.BREAKFAST,"Sushi",220);

        assertTrue("Wrong Calories",aMeal.getCalories() == 220);
    }

    @Test
    public void testGetMealType() {

    }

}
