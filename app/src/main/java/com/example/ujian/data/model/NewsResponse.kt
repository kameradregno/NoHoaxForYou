package com.example.ujian.data.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class NewsResponse(

	@field:SerializedName("paths")
	val paths: List<PathsItem?>? = null,

	@field:SerializedName("name")
	val name: String? = null
) : Parcelable

@Parcelize
data class Data(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("title")
	val title: String? = null
) : Parcelable

@Parcelize
data class PathsItem(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("success")
	val success: Boolean? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("path")
	val path: String? = null,

	@field:SerializedName("name")
	val name: String? = null
) : Parcelable
