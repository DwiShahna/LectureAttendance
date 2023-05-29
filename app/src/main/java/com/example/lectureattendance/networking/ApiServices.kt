package com.example.lectureattendance.networking

object ApiServices {
    fun getLectureAttendanceServices(): LectureAttendanceApiServices{
        return RetrofitClient
            .getClient()
            .create(LectureAttendanceApiServices::class.java)
    }
}