package mr.adkhambek.nav.ui.auth

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import mr.adkhambek.nav.di.NavigationDispatcher
import javax.inject.Inject


@HiltViewModel
class AuthViewModel @Inject constructor(
    private val router: NavigationDispatcher,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    fun navigateMain() {
        viewModelScope.launch {
            Log.i("TTT", "actionToMainFragment")
            router.emit(AuthFragmentDirections.actionToMainFragment())
        }
    }
}