package com.utils.session


import android.content.Context
import android.content.SharedPreferences

class Session(context: Context) {

    private val SessionPrefName: String = "App Name Here"
    private val KEY_ISLOGIN = "login"
    private val KEY_ID = "id"


    private val preferences: SharedPreferences =
        context.getSharedPreferences(SessionPrefName, Context.MODE_PRIVATE)

    var login: Boolean
        get() = preferences.getBoolean(KEY_ISLOGIN, false)
        set(value) = preferences.edit().putBoolean(KEY_ISLOGIN, value).apply()

    var id: String?
        get() = preferences.getString(KEY_ID,"")
        set(value) = preferences.edit().putString(KEY_ID, value).apply()

    var name: String?
        get() = preferences.getString("name", "")
        set(value) = preferences.edit().putString("name", value).apply()

    var status: String?
        get() = preferences.getString("status","")
        set(value) = preferences.edit().putString("status", value).apply()

    var email: String?
        get() = preferences.getString("email","")
        set(value) = preferences.edit().putString("email", value).apply()

    var email_verified_at: String?
        get() = preferences.getString("email_verified_at","")
        set(value) = preferences.edit().putString("email_verified_at", value).apply()

    var image_url: String?
        get() = preferences.getString("image_url","")
        set(value) = preferences.edit().putString("image_url", value).apply()

    var api_token: String?
        get() = preferences.getString("api_token","")
        set(value) = preferences.edit().putString("api_token", value).apply()

    var clientid: String?
        get() = preferences.getString("clientid","")
        set(value) = preferences.edit().putString("clientid", value).apply()


    var u: String
        get() = preferences.getString("u","").toString()
        set(value) = preferences.edit().putString("u", value).apply()

    var p: String
        get() = preferences.getString("p","").toString()
        set(value) = preferences.edit().putString("p", value).apply()

    var log: String?
        get() = preferences.getString("log", "")
        set(value) = preferences.edit().putString("log", value).apply()


}
