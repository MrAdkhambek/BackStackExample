package mr.adkhambek.nav.ui.bottom.c.child

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class AccountInner1ViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel()