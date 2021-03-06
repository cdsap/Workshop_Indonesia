package com.kotlin.server.service

import java.net.HttpURLConnection
import java.net.URL
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class CronService : HttpServlet() {
    companion object {
        const val URL = "https://kotlin-client-server.appspot.com/droidcon/v1/sync/1"
    }

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        val url = URL(URL)
        val conn = url.openConnection() as HttpURLConnection
        conn.requestMethod = "GET"
        conn.inputStream
        conn.disconnect()
    }
}
