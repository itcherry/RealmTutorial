package com.test.uptech.realmtutorial.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required

data class Todo(val userId: Int?,
                @PrimaryKey @Required val id: Int,
                val title: String?,
                val completed: Boolean?): RealmObject()