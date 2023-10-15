package test

import androidx.navigation.NavController
import org.junit.Assert

fun NavController.assertCurrentRouteName(expectedRoute: String) {
    Assert.assertEquals(expectedRoute, currentBackStackEntry?.destination?.route)
}