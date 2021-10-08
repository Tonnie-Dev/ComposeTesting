package com.example.compose.rally

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.text.toUpperCase
import com.example.compose.rally.ui.components.RallyTopAppBar
import org.junit.Rule
import org.junit.Test
import java.util.*
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog

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


        testRule.onRoot().printToLog("currentLabelExists")
        //replace Thread.Sleep() with an assertion

        testRule.onNodeWithText(RallyScreen.Accounts.name.uppercase())
            .assertExists()
    }

}