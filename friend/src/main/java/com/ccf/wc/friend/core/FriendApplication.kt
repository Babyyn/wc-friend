package com.ccf.wc.friend.core

import com.ccf.wc.baselib.BaseApplication

class FriendApplication : BaseApplication() {

    override fun initBaseAppModules() {
        registerBaseAppModule(FriendAppModule::class.java)
    }
}