package com.firebase.wrapper.admin.firestore

import com.firebase.wrapper.admin.firestore.CollectionReference
import kotlin.js.Promise

external interface DocumentReference {
    val id: String
    val parent: DocumentReference

    fun collection(collectionPath: String): CollectionReference
    fun delete() : Promise<Unit>
    fun get(): Promise<DocumentSnapshot>
    fun get(value: String): Promise<DocumentSnapshot>
}
