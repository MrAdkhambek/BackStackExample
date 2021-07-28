package mr.adkhambek.nav.ui.bottom.a.child.a

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeInner1ViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel()