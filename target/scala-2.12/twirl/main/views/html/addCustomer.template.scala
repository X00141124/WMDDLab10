
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Customer")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""<p class="lead">Add or update a new customer</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addCustomerSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.106*/ {_display_(Seq[Any](format.raw/*8.108*/("""
    
    """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

    """),_display_(/*12.6*/inputText(customerForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.82*/("""
    """),_display_(/*13.6*/inputText(customerForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*13.88*/("""
    """),_display_(/*14.6*/inputText(customerForm("number"), '_label -> "Phone Number", 'class -> "form-control")),format.raw/*14.92*/("""
    """),_display_(/*15.6*/inputText(customerForm("dob"), '_label -> "Date of Birth", 'class -> "form-control")),format.raw/*15.90*/("""

    """),_display_(/*17.6*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.71*/("""

    """),format.raw/*19.5*/("""<div class="actions">

        <input type="submit" value="Add/Update Customer" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.customer),format.raw/*22.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>

    </div>
""")))}),format.raw/*27.2*/("""
""")))}))
      }
    }
  }

  def render(customerForm:Form[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((Form[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 09 19:30:07 GMT 2017
                  SOURCE: C:/Users/brand/Documents/WebLab/Lab8/CRUD-Labs/app/views/addCustomer.scala.html
                  HASH: 804993a5e735e45cd721fe83b2e0f0dd2d2d015f
                  MATRIX: 969->1|1079->43|1124->38|1154->60|1182->63|1210->83|1249->85|1277->87|1359->144|1468->244|1508->246|1547->259|1560->263|1591->273|1626->282|1723->358|1756->365|1859->447|1892->454|1999->540|2032->547|2137->631|2172->640|2258->705|2293->713|2446->839|2461->845|2506->869|2644->977
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|49->17|51->19|54->22|54->22|54->22|59->27
                  -- GENERATED --
              */
          