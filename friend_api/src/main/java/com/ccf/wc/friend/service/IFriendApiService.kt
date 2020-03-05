package com.ccf.wc.friend.service

import com.ccf.wc.profile.entity.User

interface IFriendApiService {

    fun search(name: String): User

    fun pickFriends(): List<User>
}