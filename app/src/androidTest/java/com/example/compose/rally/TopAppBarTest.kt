package com.example.compose.rally

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.text.toUpperCase
import com.example.compose.rally.ui.components.RallyTopAppBar
import org.junit.Rule
import org.junit.Test
import java.util.*


//Test Class
class TopAppBarTest {

    //get compose test rule
    @get:Rule
    val testRule= createComposeRule()



    //testing function
    @Test
    fun rallyTopAppBarTest() {

        val allScreen = RallyScreen.values().toList()
        testRule.setContent {
            //the component be tested in isolation goes here
            RallyTopAppBar(
                allScreens = allScreen,
                onTabSelected = {},
                currentScreen = RallyScreen.Accounts
            )
        }

        //replace Thread.Sleep() with an assertion

        testRule.onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsDisplayed()
    }

}