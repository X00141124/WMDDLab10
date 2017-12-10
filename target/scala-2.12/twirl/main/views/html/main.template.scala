
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Online Shop - """),_display_(/*11.23*/title),format.raw/*11.28*/("""</title>

<!-- Bootstrap Core CSS -->
<link rel="stylesheet" type="text/css" href="../public/stylesheets/main.css">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS --> <link href=""""),_display_(/*17.34*/routes/*17.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.81*/("""" rel="stylesheet" />

</head>

<body>

<nav class="navbar navbar-inverse">

<div class="container-fluid">

<div class="navbar-header">

<a class="navbar-brand" href="#">Online Shop</a>

</div>

<ul class="nav navbar-nav">

<li><a href="/">Products</a></li>

<li><a href="/customers">Customers</a></li>

<li><a href="#">Contact</a></li>

</ul>

</div>

</nav>

<container>

<div class="row">

<div class="col-md-12">
<div class="content">
"""),_display_(/*53.2*/content),format.raw/*53.9*/("""
"""),format.raw/*54.1*/("""</div>
</div>

</div>

</container>

<container>

<div class="row">

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</div>

</container>
<script src=""""),_display_(/*74.15*/routes/*74.21*/.Assets.versioned("javascripts/main.js")),format.raw/*74.61*/(""""></script>
</body>

</html> """))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 09 19:54:14 GMT 2017
                  SOURCE: C:/Users/brand/Documents/WebLab/Lab8/CRUD-Labs/app/views/main.scala.html
                  HASH: e5387fc4992ce2a7e9a1c8d831d0a11578a8bb1d
                  MATRIX: 952->1|1077->31|1107->35|1231->132|1257->137|1539->392|1554->398|1616->439|2118->915|2145->922|2174->924|2398->1121|2413->1127|2474->1167
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|85->53|85->53|86->54|106->74|106->74|106->74
                  -- GENERATED --
              */
          