package com.example.compose.rally

import androidx.compose.ui.test.junit4.createComposeRule
import com.example.compose.rally.ui.components.RallyTopAppBar
import org.junit.Rule
import org.junit.Test


//Test Class
class TopAppBarTest {

    //get compose test rule
    @get:Rule
    val composeTestRule= createComposeRule()

    //testing function
    @Test
    fun rallyTopAppBarTest() {

        val allScreen = RallyScreen.values().toList()
        composeTestRule.setContent {

            //the component be tested in isolation goes here
            RallyTopAppBar(allScreens = allScreen, onTabSelected = {}, currentScreen =RallyScreen.Accounts )
        }

        //slow down the test
        Thread.sleep(5000)
    }

}