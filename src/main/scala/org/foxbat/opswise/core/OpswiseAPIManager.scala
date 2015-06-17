package org.foxbat.opswise.core

import org.foxbat.opswise.settings.Config


/**
 * Created by chlr on 6/16/15.
 */
class OpswiseAPIManager(val config_dir:String, val opswise:String) {

  val config = new Config(config_dir,opswise)

  def getTaskHandler(): TaskHandler = new TaskHandler(config)


}



