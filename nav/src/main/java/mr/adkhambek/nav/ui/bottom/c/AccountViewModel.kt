package mr.adkhambek.nav.ui.bottom.c

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class AccountViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel()