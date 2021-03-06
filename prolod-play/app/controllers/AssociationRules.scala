package controllers

import models.ViewFormats._
import models._
import play.api.libs.json._
import play.api.mvc.{Action, Controller}

object AssociationRules extends Controller {

  def getAssociationRules(dataset: String, group: List[String]) = Action {
    val data: List[AssociationRule] = Nil // List(AssociationRule("a", "b", 0.3, 0.9, 0.8))
    val json = Json.obj("data" -> data)
    Ok(json)
  }

}
