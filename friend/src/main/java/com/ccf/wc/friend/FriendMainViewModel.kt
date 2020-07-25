package com.ccf.wc.friend

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ccf.wc.friend.network.FriendServices
import com.ccf.wc.profile.entity.User
import io.reactivex.schedulers.Schedulers

class FriendMainViewModel : ViewModel() {

    val TAG = "FriendMainViewModel"

    val friends = MutableLiveData<List<User>>()

    fun loadFriends() {
        FriendServices.friendBffService.getFriends()
            .subscribeOn(Schedulers.io())
            .subscribe({
                friends.postValue(it)
            }, {
                Log.e(TAG, "err = ${it}")
            })
    }
}