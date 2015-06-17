package org.foxbat.opswise.core

import org.foxbat.opswise.settings.Task.Create
import org.foxbat.opswise.util.RestManager

/**
 * Created by chlr on 6/17/15.
 */
class TaskHandler {

  def create(setting: Create) = {
    val request = templates.task.xml.create.render(setting).body
    val url = (OpswiseAPIManager.config.urls \ "task" \ "create").as[String]
    RestManager.postXML(url,request)
  }

}
