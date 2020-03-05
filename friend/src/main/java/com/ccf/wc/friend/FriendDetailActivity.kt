package com.ccf.wc.friend

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.ccf.wc.baselib.core.FriendConstants
import kotlinx.android.synthetic.main.activity_friend_detail.*

@Route(path = FriendConstants.FRIEND_DETAIL)
class FriendDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend_detail)

        val friendName = intent.getStringExtra(FriendConstants.EXTRA_FRIEND_DETAIL_NAME)
        friend_name.text = friendName

        invoke_from.text = intent.getStringExtra(FriendConstants.EXTRA_FRIEND_DETAIL_FROM)
    }
}