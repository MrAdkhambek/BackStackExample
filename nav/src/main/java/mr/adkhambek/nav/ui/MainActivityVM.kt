package mr.adkhambek.nav.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import mr.adkhambek.nav.di.NavigationCommand
import mr.adkhambek.nav.di.NavigationDispatcher
import javax.inject.Inject


@HiltViewModel
class MainActivityVM @Inject constructor(
    private val router: NavigationDispatcher,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    val navigationCommands: Flow<NavigationCommand>
        get() = router.navigationCommands
}