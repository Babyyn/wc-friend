package com.ccf.wc.friend.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
import com.ccf.wc.baselib.core.FriendConstants
import com.ccf.wc.friend.network.FriendServices
import com.ccf.wc.profile.entity.User
import io.reactivex.Single

@Route(path = FriendConstants.SERVICE_FRIEND)
class FriendApiServiceImpl: IFriendApiService, IProvider {

    override fun search(name: String): Single<User> {
        return FriendServices.friendBffService.searchFriend()
    }

    override fun init(context: Context?) {
    }
}