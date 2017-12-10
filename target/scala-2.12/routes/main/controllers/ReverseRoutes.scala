
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Documents/WebLab/Lab8/CRUD-Labs/conf/routes
// @DATE:Sun Dec 10 01:25:13 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProductSubmit")
    }
  
    // @LINE:9
    def addCustomer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcustomer")
    }
  
    // @LINE:11
    def addCustomerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addCustomerSubmit")
    }
  
    // @LINE:12
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:14
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def deleteCustomer(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:15
    def updateCustomer(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:7
    def customer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "customers")
    }
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
