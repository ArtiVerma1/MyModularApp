package com.example.mymodularapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.UserModel
import com.example.myapplication.module.MainRepository
import com.example.myapplication.module.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {
    // TODO: Implement the ViewModel
    private val _users = MutableLiveData<List<UserModel>>()
    val users: LiveData<List<UserModel>>
        get() = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            // _users.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.getUsers().let {
                    if (it.isSuccessful) {
                        //_users.postValue(Resource.success(it.body()))
                    } //else _users.postValue(Resource.error(it.errorBody().toString(), null))
                }
            }
        }
    }

}