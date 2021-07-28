package mr.adkhambek.cicerone.ui.bottom.b.child.a

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import mr.adkhambek.cicerone.di.NavigationDispatcher
import mr.adkhambek.cicerone.ui.bottom.Tab
import mr.adkhambek.cicerone.ui.bottom.a.HomeScreens
import mr.adkhambek.cicerone.ui.bottom.b.SearchScreens
import javax.inject.Inject


@HiltViewModel
class SearchInner1ViewModel @Inject constructor(
    private val bottomRouter: NavigationDispatcher,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    fun onClickForward() {
        viewModelScope.launch {
            bottomRouter.emit(Tab.SEARCH) {
                this.navigateTo(SearchScreens.Child2())
            }
        }
    }
}