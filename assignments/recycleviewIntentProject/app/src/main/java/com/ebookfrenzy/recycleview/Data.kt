package com.ebookfrenzy.recycleview

import kotlin.random.Random

object Data{


    val titles: Array<String> = arrayOf("Chapter One",
        "Chapter Two", "Chapter Three", "Chapter Four",
        "Chapter Five", "Chapter Six", "Chapter Seven",
        "Chapter Eight")

    val randTitles: Array<String> = arrayOf(titles[Random.nextInt(0,7)], titles[Random.nextInt(0,7)],
        titles[Random.nextInt(0,7)], titles[Random.nextInt(0,7)],
        titles[Random.nextInt(0,7)], titles[Random.nextInt(0,7)],
        titles[Random.nextInt(0,7)], titles[Random.nextInt(0,7)])
    // the recycler adapter will pass through an int in order to iterate through the new randomized array
    fun getTitle(int: Int): String {
        return randTitles[int]
    }


   val details = arrayOf("Item one details", "Item two details",
        "Item three details", "Item four details",
        "Item Five Details", "Item six details",
        "Item seven details", "Item eight details")

     val randDetails: Array<String> = arrayOf(details[Random.nextInt(0,7)], details[Random.nextInt(0,7)],
        details[Random.nextInt(0,7)], details[Random.nextInt(0,7)],
        details[Random.nextInt(0,7)], details[Random.nextInt(0,7)],
        details[Random.nextInt(0,7)], details[Random.nextInt(0,7)])

    fun getDetails(int: Int): String {
        return randDetails[int]
    }

    val images: IntArray = intArrayOf(R.drawable.android_image_1,
        R.drawable.android_image_1, R.drawable.android_image_3,
        R.drawable.android_image_4, R.drawable.android_image_5,
        R.drawable.android_image_6, R.drawable.android_image_7,
        R.drawable.android_image_8)

    val randImages: IntArray = intArrayOf(images[Random.nextInt(0,7)],
        images[Random.nextInt(0,7)], images[Random.nextInt(0,7)],
        images[Random.nextInt(0,7)], images[Random.nextInt(0,7)],
        images[Random.nextInt(0,7)], images[Random.nextInt(0,7)],
        images[Random.nextInt(0,7)])

    fun getImages(int: Int): Int {
        return randImages[int]
    }


}