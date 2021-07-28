package mr.adkhambek.cicerone.ui.bottom.c

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.github.terrakok.cicerone.*
import com.github.terrakok.cicerone.androidx.AppNavigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import mr.adkhambek.cicerone.R
import mr.adkhambek.cicerone.databinding.HomeFragmentBinding
import mr.adkhambek.cicerone.ui.BackButtonListener
import mr.adkhambek.cicerone.ui.bottom.LocalCiceroneHolder
import mr.adkhambek.cicerone.ui.bottom.RouterProvider
import mr.adkhambek.cicerone.ui.bottom.Tab
import javax.inject.Inject


@AndroidEntryPoint
class AccountFragment : Fragment(R.layout.account_fragment), RouterProvider, BackButtonListener {

    private val vm: AccountViewModel by viewModels()
    private val navigator: Navigator by lazy {
        AppNavigator(requireActivity(), R.id.navHostFragmentC, childFragmentManager)
    }

    @Inject
    lateinit var ciceroneHolder: LocalCiceroneHolder
    private val containerName: String get() = Tab.ACCOUNT.name
    private val cicerone: Cicerone<Router> get() = ciceroneHolder.getCicerone(containerName)
    override val router: Router get() = cicerone.router

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = HomeFragmentBinding.bind(view)
        if (childFragmentManager.findFragmentById(R.id.navHostFragmentA) == null) {
            navigator.applyCommands(arrayOf<Command>(Replace(AccountScreens.Child1())))
        }

        vm
            .navigationCommands
            .onEach {
                it.invoke(router, requireContext())
            }.launchIn(viewLifecycleOwner.lifecycleScope)
    }

    override fun onResume() {
        super.onResume()
        cicerone.getNavigatorHolder().setNavigator(navigator)
    }

    override fun onPause() {
        cicerone.getNavigatorHolder().removeNavigator()
        super.onPause()
    }

    private val currentFragment: Fragment?
        get() = childFragmentManager.fragments.firstOrNull { !it.isHidden }

    override fun onBackPressed(): Boolean {
        val listener = currentFragment as? BackButtonListener?
        return listener?.onBackPressed() ?: false
    }
}