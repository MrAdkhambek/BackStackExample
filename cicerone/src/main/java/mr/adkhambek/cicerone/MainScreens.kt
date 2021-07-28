@file:Suppress("FunctionName")

package mr.adkhambek.cicerone

import com.github.terrakok.cicerone.androidx.FragmentScreen
import mr.adkhambek.cicerone.ui.auth.AuthFragment
import mr.adkhambek.cicerone.ui.bottom.MainFragment


object MainScreens {

    @JvmStatic
    fun AuthScreen() = FragmentScreen {
        AuthFragment()
    }

    @JvmStatic
    fun MainScreen() = FragmentScreen {
        MainFragment()
    }
}