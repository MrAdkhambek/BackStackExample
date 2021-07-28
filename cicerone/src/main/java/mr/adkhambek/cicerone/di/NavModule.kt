package mr.adkhambek.cicerone.di

import android.content.Context
import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import mr.adkhambek.cicerone.ui.bottom.Tab
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NavigationDispatcher @Inject constructor() {

    private val navigationEmitterA: MutableSharedFlow<NavigationCommand> = MutableSharedFlow()
    val navigationCommandsA: Flow<NavigationCommand> = navigationEmitterA.asSharedFlow()

    private val navigationEmitterB: MutableSharedFlow<NavigationCommand> = MutableSharedFlow()
    val navigationCommandsB: Flow<NavigationCommand> = navigationEmitterB.asSharedFlow()

    private val navigationEmitterC: MutableSharedFlow<NavigationCommand> = MutableSharedFlow()
    val navigationCommandsC: Flow<NavigationCommand> = navigationEmitterC.asSharedFlow()

    suspend fun emit(tab: Tab, command: NavigationCommand) {
        when (tab) {
            Tab.HOME -> navigationEmitterA.emit(command)
            Tab.SEARCH -> navigationEmitterB.emit(command)
            Tab.ACCOUNT -> navigationEmitterC.emit(command)
        }
    }
}

typealias NavigationCommand = Router.(Context) -> Unit