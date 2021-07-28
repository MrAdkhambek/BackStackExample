@file:Suppress("FunctionName")

package mr.adkhambek.cicerone.ui.bottom.a

import com.github.terrakok.cicerone.androidx.FragmentScreen
import mr.adkhambek.cicerone.ui.bottom.a.child.a.HomeInner1Fragment
import mr.adkhambek.cicerone.ui.bottom.a.child.b.HomeInner2Fragment
import mr.adkhambek.cicerone.ui.bottom.a.child.c.HomeInner3Fragment


object HomeScreens {

    @JvmStatic
    fun Child1() = FragmentScreen {
        HomeInner1Fragment()
    }

    @JvmStatic
    fun Child2() = FragmentScreen {
        HomeInner2Fragment()
    }

    @JvmStatic
    fun Child3() = FragmentScreen {
        HomeInner3Fragment()
    }
}