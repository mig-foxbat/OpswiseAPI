package org.foxbat.opswise.util

/**
 * Created by chlr on 6/17/15.
 */


import com.ning.http.client.Response
import dispatch.Defaults._
import org.foxbat.opswise.core.OpswiseAPIManager

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object RestManager {

  val end_point = "http://"+(OpswiseAPIManager.config.opswise \ "server" \ "host").as[String]

  def postXML(url: String, body: String): Unit = {
    println(body)
    val request = (dispatch.url(end_point+url) setContentType ("application/xml", "UTF-8")).POST << body as_! ("chlr","seriesT-800")
    val result = dispatch.Http(request)
    val response = Await.result[Response](result,Duration(10,scala.concurrent.duration.SECONDS))
    println(response.getResponseBody)
  }

}
