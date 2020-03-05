package com.ccf.wc.friend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.ccf.wc.baselib.core.FriendConstants
import com.ccf.wc.baselib.ui.Constants
import kotlinx.android.synthetic.main.fragment_friend.*

@Route(path = FriendConstants.ENTRY_FRAGMENT)
class FriendFragment: Fragment() {

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
    }
}