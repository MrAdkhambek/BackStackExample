package mr.adkhambek.cicerone.ui.auth

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import mr.adkhambek.cicerone.MainScreens
import javax.inject.Inject


@HiltViewModel
class AuthViewModel @Inject constructor(
    private val router: Router,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    fun navigateMain() {
        Log.i("TTT", "actionToMainFragment")
        router.navigateTo(MainScreens.MainScreen())
    }
}