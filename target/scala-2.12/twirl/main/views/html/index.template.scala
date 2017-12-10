
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""
"""),_display_(/*2.2*/main("Products Page")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
  
  """),format.raw/*4.3*/("""<p class="lead">Product Catalogue</p>
  <div class="row">
    <div class="col-sm-2">
      <h4>Categories</h4>
      <div class="list-group">
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.HomeController.index(0)),format.raw/*9.49*/("""" class="list-group-item">All categories</a>
        """),_display_(/*10.10*/for(c <- categories) yield /*10.30*/{_display_(Seq[Any](format.raw/*10.31*/("""
          """),format.raw/*11.11*/("""<a href=""""),_display_(/*11.21*/routes/*11.27*/.HomeController.index(c.getId)),format.raw/*11.57*/("""" class="list-group-item">"""),_display_(/*11.84*/c/*11.85*/.getName),format.raw/*11.93*/("""
            """),format.raw/*12.13*/("""<span class="badge">"""),_display_(/*12.34*/c/*12.35*/.getProducts.size()),format.raw/*12.54*/("""</span>
          </a>
        """)))}),format.raw/*14.10*/("""

      """),format.raw/*16.7*/("""</div>
    </div>
    <div class="col-sm-10">
  

  """),_display_(/*21.4*/if(flash.containsKey("success"))/*21.36*/{_display_(Seq[Any](format.raw/*21.37*/("""
      """),format.raw/*22.7*/("""<div class="alert alert-success">
        """),_display_(/*23.10*/flash/*23.15*/.get("success")),format.raw/*23.30*/("""
      """),format.raw/*24.7*/("""</div>
  """)))}),format.raw/*25.4*/("""

  
  """),format.raw/*28.3*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>

  <th>Category</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*55.4*/for(p<-products) yield /*55.20*/ {_display_(Seq[Any](format.raw/*55.22*/("""
  """),format.raw/*56.3*/("""<tr>
  
  <td>"""),_display_(/*58.8*/p/*58.9*/.getId),format.raw/*58.15*/("""</td>
  
  <td>"""),_display_(/*60.8*/p/*60.9*/.getName),format.raw/*60.17*/("""</td>

  <td>"""),_display_(/*62.8*/p/*62.9*/.getCategory.getName),format.raw/*62.29*/("""</td>
  
  <td>"""),_display_(/*64.8*/p/*64.9*/.getDescription),format.raw/*64.24*/("""</td>
  
  <td>"""),_display_(/*66.8*/p/*66.9*/.getStock),format.raw/*66.18*/("""</td>

  <td class="numeric">&euro; """),_display_(/*68.31*/("%.2f".format(p.getPrice))),format.raw/*68.58*/("""</td>

  <td>
    <a href=""""),_display_(/*71.15*/routes/*71.21*/.HomeController.updateProduct(p.getId)),format.raw/*71.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
      <span class="glyphicon glyphicon-pencil"></span>
    </a>
  </td>

  <td>
    <a href=""""),_display_(/*77.15*/routes/*77.21*/.HomeController.deleteProduct(p.getId)),format.raw/*77.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
      <span class="glyphicon glyphicon-trash"></span>
    </a>
  </td>
  
  </tr>
""")))}),format.raw/*83.2*/("""
  
  """),format.raw/*85.3*/("""</tbody>
  
  </table>

  <p>
    <a href=""""),_display_(/*90.15*/routes/*90.21*/.HomeController.addProduct()),format.raw/*90.49*/("""">
        <button class="btn btn-primary">Add a product</button>
    </a>

  </p>
</div>
</div>
  
  """)))}),format.raw/*98.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 10 01:24:55 GMT 2017
                  SOURCE: C:/Users/brand/Documents/WebLab/Lab8/CRUD-Labs/app/views/index.scala.html
                  HASH: 153c97158f2cdb73cdf1054ddd6f6c166046d911
                  MATRIX: 984->1|1146->68|1174->71|1203->92|1242->94|1276->102|1467->267|1481->273|1525->297|1607->352|1643->372|1682->373|1722->385|1759->395|1774->401|1825->431|1879->458|1889->459|1918->467|1960->481|2008->502|2018->503|2058->522|2123->556|2160->566|2244->624|2285->656|2324->657|2359->665|2430->709|2444->714|2480->729|2515->737|2556->748|2593->758|2955->1094|2987->1110|3027->1112|3058->1116|3101->1133|3110->1134|3137->1140|3181->1158|3190->1159|3219->1167|3261->1183|3270->1184|3311->1204|3355->1222|3364->1223|3400->1238|3444->1256|3453->1257|3483->1266|3549->1305|3597->1332|3655->1363|3670->1369|3729->1407|3919->1570|3934->1576|3993->1614|4175->1766|4210->1774|4286->1823|4301->1829|4350->1857|4491->1968
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|46->14|48->16|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|60->28|87->55|87->55|87->55|88->56|90->58|90->58|90->58|92->60|92->60|92->60|94->62|94->62|94->62|96->64|96->64|96->64|98->66|98->66|98->66|100->68|100->68|103->71|103->71|103->71|109->77|109->77|109->77|115->83|117->85|122->90|122->90|122->90|130->98
                  -- GENERATED --
              */
          