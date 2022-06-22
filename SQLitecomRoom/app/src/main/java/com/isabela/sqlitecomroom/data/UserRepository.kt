package com.isabela.sqlitecomroom.data

class UserRepository(private val userDao: UserDao) {

    val selectUsers = userDao.selectUser()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }

}