@file:Suppress("FunctionName")

package mr.adkhambek.cicerone.ui.bottom.c

import com.github.terrakok.cicerone.androidx.FragmentScreen
import mr.adkhambek.cicerone.ui.bottom.c.child.AccountInner1Fragment


object AccountScreens {

    @JvmStatic
    fun Child1() = FragmentScreen {
        AccountInner1Fragment()
    }
}