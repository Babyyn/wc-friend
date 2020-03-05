package com.ccf.wc.friend

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.ccf.wc.baselib.core.FriendConstants

@Route(path = FriendConstants.FRIEND_SEARCH)
class FriendSearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend_search)
    }
}