package mr.adkhambek.cicerone.ui.bottom.b.child.c

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import mr.adkhambek.cicerone.di.NavigationDispatcher
import mr.adkhambek.cicerone.ui.bottom.Tab
import javax.inject.Inject


@HiltViewModel
class SearchInner3ViewModel @Inject constructor(
    private val bottomRouter: NavigationDispatcher,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    fun onClickBackward() {
        viewModelScope.launch {
            bottomRouter.emit(Tab.SEARCH) {
                exit()
            }
        }
    }
}