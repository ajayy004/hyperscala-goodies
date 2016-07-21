package com.example

import java.util.Date

import org.hyperscala.html._
import org.hyperscala.web.site.Webpage

class HelloPage extends Webpage {
  title := "HyperScala - Hello World"


  body.contents += new tag.H1{
    contents += "HyperScala - Hello World"
  }

  body.contents += new tag.H3{
    contents += ""+new Date()+""
  }

  body.contents += new tag.P {
    contents += "Uses Markup.connected[HTML] to invoke a function (in this case, changing the title of the page) " +
      "when HTML is available as an ancestor in the tree. This allows modular components to be created and access " +
      "the elements higher in the hierarchical structure when it is connected."
  }
}