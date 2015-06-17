package org.foxbat.opswise.core

import org.foxbat.opswise.settings.Config
import org.foxbat.opswise.settings.Task.Create

/**
 * Created by chlr on 6/17/15.
 */
class TaskHandler(val config:Config) {

  def create(setting: Create) = {
    val request = templates.task.xml.create.render(setting).body

  }

}
