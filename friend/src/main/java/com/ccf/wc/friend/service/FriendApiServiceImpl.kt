package com.ccf.wc.friend.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
import com.ccf.wc.baselib.core.FriendConstants
import com.ccf.wc.profile.entity.User

@Route(path = FriendConstants.SERVICE_FRIEND)
class FriendApiServiceImpl: IFriendApiService, IProvider {

    override fun search(name: String): User {
        return User(name, 0, 18)
    }

    override fun pickFriends(): List<User> {
        return arrayListOf()
    }

    override fun init(context: Context?) {
    }
}