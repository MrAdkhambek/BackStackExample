package mr.adkhambek.cicerone.ui.bottom.c

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import mr.adkhambek.cicerone.di.NavigationCommand
import mr.adkhambek.cicerone.di.NavigationDispatcher
import javax.inject.Inject


@HiltViewModel
class AccountViewModel @Inject constructor(
    private val router: Router,
    private val bottomRouter: NavigationDispatcher,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    val navigationCommands: Flow<NavigationCommand>
        get() = bottomRouter.navigationCommandsC
}