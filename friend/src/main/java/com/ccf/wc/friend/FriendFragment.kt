package com.ccf.wc.friend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.ccf.wc.baselib.core.FriendConstants
import com.ccf.wc.baselib.ui.Constants
import kotlinx.android.synthetic.main.fragment_friend.*

@Route(path = FriendConstants.ENTRY_FRAGMENT)
class FriendFragment : Fragment() {

    companion object {
        private const val TAG = "FriendFragment"
    }

    private val adapter = FriendListAdapter()
    lateinit var vm: FriendMainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm = ViewModelProviders.of(this).get(FriendMainViewModel::class.java)
        vm.loadFriends()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_friend, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        friend_click.setOnClickListener {
            val fragment: DialogFragment = ARouter.getInstance().build(Constants.ROUTE_ALERT_DIALOG)
                .navigation() as DialogFragment
            fragment.show(childFragmentManager, "")
        }
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter
        vm.friends.observe(this, Observer {
            it?.let {
                adapter.submitList(it)
            }
        })
    }
}