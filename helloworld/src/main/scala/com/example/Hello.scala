package com.example

import org.hyperscala.web.Scope
import org.hyperscala.web.session.MapSession
import org.hyperscala.web.site.{WebpageResource, Website}

object Hello extends Website[MapSession]{
  val page = WebpageResource("/", new HelloPage, Scope.Request)
  protected def createSession() = new MapSession
}
