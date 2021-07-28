package mr.adkhambek.cicerone.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainActivityVM @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel()