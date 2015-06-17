package org.foxbat.opswise

/**
 * Created by chlr on 6/17/15.
 */
package object settings {

  object Task {

    case class Create(name:String, command:String, agent:String)

    case class Delete(name:String)

  }

  object Trigger {

    case class Create(task:String, calendar:String = "System Default", name:String, month:String, hours:String, minutes:String, day_of_week:String, day_of_month:String)

    case class Switch(enable:Boolean, name:String)

    case class Delete(name:String)

    case class Update( name:String, month:String, minutes:String, day_of_week:String, day_of_month:String, hours:String)

  }

}
