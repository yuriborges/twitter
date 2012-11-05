// @SOURCE:C:/workspace/twitterClient/conf/routes
// @HASH:79a94d6f6fc0773a3709526cf8d7962f3b7ff628
// @DATE:Mon Nov 05 15:04:35 EET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseTwitterController {
    


 
// @LINE:10
def logout() = {
   Call("GET", "/twitterClient/logout")
}
                                                        
 
// @LINE:9
def userPage() = {
   Call("GET", "/twitterClient/userPage")
}
                                                        
 
// @LINE:8
def pinPage() = {
   Call("GET", "/twitterClient/pinPage")
}
                                                        
 
// @LINE:12
def postNewStatus() = {
   Call("POST", "/twitterClient/postNewStatus")
}
                                                        
 
// @LINE:11
def loadUserPage() = {
   Call("POST", "/twitterClient/loadUserPage")
}
                                                        
 
// @LINE:13
def search() = {
   Call("POST", "/twitterClient/search")
}
                                                        
 
// @LINE:7
def start() = {
   Call("GET", "/twitterClient/start")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/twitterClient")
}
                                                        

                      
    
}
                            

// @LINE:16
class ReverseAssets {
    


 
// @LINE:16
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseTwitterController {
    


 
// @LINE:10
def logout = JavascriptReverseRoute(
   "controllers.TwitterController.logout",
   """
      function() {
      return _wA({method:"GET", url:"/twitterClient/logout"})
      }
   """
)
                                                        
 
// @LINE:9
def userPage = JavascriptReverseRoute(
   "controllers.TwitterController.userPage",
   """
      function() {
      return _wA({method:"GET", url:"/twitterClient/userPage"})
      }
   """
)
                                                        
 
// @LINE:8
def pinPage = JavascriptReverseRoute(
   "controllers.TwitterController.pinPage",
   """
      function() {
      return _wA({method:"GET", url:"/twitterClient/pinPage"})
      }
   """
)
                                                        
 
// @LINE:12
def postNewStatus = JavascriptReverseRoute(
   "controllers.TwitterController.postNewStatus",
   """
      function() {
      return _wA({method:"POST", url:"/twitterClient/postNewStatus"})
      }
   """
)
                                                        
 
// @LINE:11
def loadUserPage = JavascriptReverseRoute(
   "controllers.TwitterController.loadUserPage",
   """
      function() {
      return _wA({method:"POST", url:"/twitterClient/loadUserPage"})
      }
   """
)
                                                        
 
// @LINE:13
def search = JavascriptReverseRoute(
   "controllers.TwitterController.search",
   """
      function() {
      return _wA({method:"POST", url:"/twitterClient/search"})
      }
   """
)
                                                        
 
// @LINE:7
def start = JavascriptReverseRoute(
   "controllers.TwitterController.start",
   """
      function() {
      return _wA({method:"GET", url:"/twitterClient/start"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/twitterClient"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:16
class ReverseAssets {
    


 
// @LINE:16
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseTwitterController {
    


 
// @LINE:10
def logout() = new play.api.mvc.HandlerRef(
   controllers.TwitterController.logout(), HandlerDef(this, "controllers.TwitterController", "logout", Seq())
)
                              
 
// @LINE:9
def userPage() = new play.api.mvc.HandlerRef(
   controllers.TwitterController.userPage(), HandlerDef(this, "controllers.TwitterController", "userPage", Seq())
)
                              
 
// @LINE:8
def pinPage() = new play.api.mvc.HandlerRef(
   controllers.TwitterController.pinPage(), HandlerDef(this, "controllers.TwitterController", "pinPage", Seq())
)
                              
 
// @LINE:12
def postNewStatus() = new play.api.mvc.HandlerRef(
   controllers.TwitterController.postNewStatus(), HandlerDef(this, "controllers.TwitterController", "postNewStatus", Seq())
)
                              
 
// @LINE:11
def loadUserPage() = new play.api.mvc.HandlerRef(
   controllers.TwitterController.loadUserPage(), HandlerDef(this, "controllers.TwitterController", "loadUserPage", Seq())
)
                              
 
// @LINE:13
def search() = new play.api.mvc.HandlerRef(
   controllers.TwitterController.search(), HandlerDef(this, "controllers.TwitterController", "search", Seq())
)
                              
 
// @LINE:7
def start() = new play.api.mvc.HandlerRef(
   controllers.TwitterController.start(), HandlerDef(this, "controllers.TwitterController", "start", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:16
class ReverseAssets {
    


 
// @LINE:16
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                