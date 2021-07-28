package mr.adkhambek.cicerone.ui.bottom

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router


class LocalCiceroneHolder {
    private val containers = HashMap<String, Cicerone<Router>>()

    fun getCicerone(containerTag: String) = containers.getOrPut(containerTag) {
        Cicerone.create()
    }
}

interface RouterProvider {
    val router: Router
}