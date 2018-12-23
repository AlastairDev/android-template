package com.tess.androidTemplate.repository.database.users

import androidx.room.*
import java.util.*

@Entity(
        tableName = "users",
        foreignKeys = [ForeignKey(entity = UsersModel::class, parentColumns = ["id"], childColumns = ["user_id"])],
        indices = [Index("user_id")]
)
data class UsersModel(
        @ColumnInfo(name = "user_id") val userId: String,
        val firstName: String,
        val lastName: String,
        val years: Int,
        val phoneNumber: String
) {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0

    override fun toString() = "$firstName + $lastName + $phoneNumber"

}
