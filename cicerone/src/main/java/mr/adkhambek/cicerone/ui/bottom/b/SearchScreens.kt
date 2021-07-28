@file:Suppress("FunctionName")

package mr.adkhambek.cicerone.ui.bottom.b

import com.github.terrakok.cicerone.androidx.FragmentScreen
import mr.adkhambek.cicerone.ui.bottom.b.child.a.SearchInner1Fragment
import mr.adkhambek.cicerone.ui.bottom.b.child.b.SearchInner2Fragment
import mr.adkhambek.cicerone.ui.bottom.b.child.c.SearchInner3Fragment


object SearchScreens {

    @JvmStatic
    fun Child1() = FragmentScreen {
        SearchInner1Fragment()
    }

    @JvmStatic
    fun Child2() = FragmentScreen {
        SearchInner2Fragment()
    }

    @JvmStatic
    fun Child3() = FragmentScreen {
        SearchInner3Fragment()
    }
}