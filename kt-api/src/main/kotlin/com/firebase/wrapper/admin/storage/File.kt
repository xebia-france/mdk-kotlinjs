package com.firebase.wrapper.admin.storage

import kotlin.js.Promise

external interface File {
    fun createWriteStream(options: WriteStreamOptions? = definedExternally): WriteStream

    fun makePublic(): Promise<MakeFilePublicResponse>
}

external interface MakeFilePublicResponse
