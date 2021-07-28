package mr.adkhambek.nav.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import mr.adkhambek.nav.R


@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: MainActivityVM by viewModels()
    private val navHostFragment: NavHostFragment by lazy {
        supportFragmentManager.findFragmentById(
            R.id.navHostFragment
        ) as NavHostFragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navController = navHostFragment.navController

        viewModel
            .navigationCommands
            .onEach { command ->
                command(navController, this)
            }.launchIn(lifecycleScope)
    }

    private val currentTabFragment: BackButtonListener?
        get() = navHostFragment.childFragmentManager.fragments.firstOrNull { !it.isHidden } as? BackButtonListener?

    override fun onSupportNavigateUp(): Boolean = findNavController(R.id.navHostFragment).navigateUp()

    override fun onBackPressed() {
        if (currentTabFragment?.onBackPressed() != false) super.onBackPressed()
    }
}


