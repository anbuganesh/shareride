package com.example.ganesh.ShareRide

import android.app.Application

import io.realm.Realm
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * Created by ganesh on 09-01-2018.
 */
public class ExpenseShare : Application()
{
    public override fun onCreate() {
        super.onCreate()
        Realm.init(this)

    }
}




/**
 * Created by ganesh on 16-11-2017.
 */


open class Member : RealmObject()
{
    @PrimaryKey
    private var id = UUID.randomUUID().toString()
    var name : String = ""

    fun getId() : String{
        return  id
    }

    override fun toString() : String {
        return name

    }
}


