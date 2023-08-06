package com.newzarc.newzarcapp.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.newzarc.newzarcapp.data.datasource.UserRemoteDataSource
import com.newzarc.newzarcapp.data.model.user.UserEntity
import com.newzarc.newzarcapp.domain.repository.UserRepository
import retrofit2.Response

class UserRepositoryImpl(
    private val userRemoteDataSource: UserRemoteDataSource
) : UserRepository {
    override suspend fun getUser(email: String): List<UserEntity>? {
        return getUserFromEmail(email)
    }

    private suspend fun getUserFromEmail(email: String): List<UserEntity>? {
        var userList: List<UserEntity>? = null

        try {
            val response = userRemoteDataSource.getUser(email)
            val body = response.body()

            Log.d("Myviewmypostimpbody", body.toString())

            if (body != null) {
                userList = body
                Log.d("Myviewmypostimp", userList.toString())
            }
        } catch (exception: Exception) {
            userList = emptyList()
            Log.d("mypostimperr", exception.toString())
        }
        return userList
    }

    override suspend fun createUser(user: UserEntity): Response<UserEntity> {
        val createdList: MutableLiveData<Response<UserEntity>> = MutableLiveData()

        val response = userRemoteDataSource.createUser(user)
        createdList.value = response

        return response
    }
}