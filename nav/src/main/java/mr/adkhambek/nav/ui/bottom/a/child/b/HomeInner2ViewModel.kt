package mr.adkhambek.nav.ui.bottom.a.child.b

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeInner2ViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel()