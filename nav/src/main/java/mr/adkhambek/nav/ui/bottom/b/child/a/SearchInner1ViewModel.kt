package mr.adkhambek.nav.ui.bottom.b.child.a

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SearchInner1ViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel()