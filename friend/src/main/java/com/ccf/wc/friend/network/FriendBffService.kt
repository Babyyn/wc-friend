package com.ccf.wc.friend.network

import com.ccf.wc.profile.entity.User
import io.reactivex.Single
import retrofit2.http.GET

interface FriendBffService {

    @GET("data/friend/friends.json")
    fun getFriends(): Single<List<User>>

    @GET("data/friend/search.json")
    fun searchFriend(): Single<User>
}