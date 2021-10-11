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
        testRule.onRoot(useUnmergedTree = true).printToLog("currentLabelExists")

        //testRule.onNodeWithContentDescription(RallyScreen.Accounts.name).assertExists()

      testRule.onNode(hasText(RallyScreen.Accounts.name.uppercase()) and hasParent(
          hasContentDescription(RallyScreen.Accounts.name)), useUnmergedTree = true)
    }





}