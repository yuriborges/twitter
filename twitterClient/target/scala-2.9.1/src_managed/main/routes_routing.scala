// @SOURCE:C:/workspace/twitterClient/conf/routes
// @HASH:79a94d6f6fc0773a3709526cf8d7962f3b7ff628
// @DATE:Mon Nov 05 15:04:35 EET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/twitterClient"))))
                    

// @LINE:7
val controllers_TwitterController_start1 = Route("GET", PathPattern(List(StaticPart("/twitterClient/start"))))
                    

// @LINE:8
val controllers_TwitterController_pinPage2 = Route("GET", PathPattern(List(StaticPart("/twitterClient/pinPage"))))
                    

// @LINE:9
val controllers_TwitterController_userPage3 = Route("GET", PathPattern(List(StaticPart("/twitterClient/userPage"))))
                    

// @LINE:10
val controllers_TwitterController_logout4 = Route("GET", PathPattern(List(StaticPart("/twitterClient/logout"))))
                    

// @LINE:11
val controllers_TwitterController_loadUserPage5 = Route("POST", PathPattern(List(StaticPart("/twitterClient/loadUserPage"))))
                    

// @LINE:12
val controllers_TwitterController_postNewStatus6 = Route("POST", PathPattern(List(StaticPart("/twitterClient/postNewStatus"))))
                    

// @LINE:13
val controllers_TwitterController_search7 = Route("POST", PathPattern(List(StaticPart("/twitterClient/search"))))
                    

// @LINE:16
val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/twitterClient""","""controllers.Application.index()"""),("""GET""","""/twitterClient/start""","""controllers.TwitterController.start()"""),("""GET""","""/twitterClient/pinPage""","""controllers.TwitterController.pinPage()"""),("""GET""","""/twitterClient/userPage""","""controllers.TwitterController.userPage()"""),("""GET""","""/twitterClient/logout""","""controllers.TwitterController.logout()"""),("""POST""","""/twitterClient/loadUserPage""","""controllers.TwitterController.loadUserPage()"""),("""POST""","""/twitterClient/postNewStatus""","""controllers.TwitterController.postNewStatus()"""),("""POST""","""/twitterClient/search""","""controllers.TwitterController.search()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_TwitterController_start1(params) => {
   call { 
        invokeHandler(_root_.controllers.TwitterController.start(), HandlerDef(this, "controllers.TwitterController", "start", Nil))
   }
}
                    

// @LINE:8
case controllers_TwitterController_pinPage2(params) => {
   call { 
        invokeHandler(_root_.controllers.TwitterController.pinPage(), HandlerDef(this, "controllers.TwitterController", "pinPage", Nil))
   }
}
                    

// @LINE:9
case controllers_TwitterController_userPage3(params) => {
   call { 
        invokeHandler(_root_.controllers.TwitterController.userPage(), HandlerDef(this, "controllers.TwitterController", "userPage", Nil))
   }
}
                    

// @LINE:10
case controllers_TwitterController_logout4(params) => {
   call { 
        invokeHandler(_root_.controllers.TwitterController.logout(), HandlerDef(this, "controllers.TwitterController", "logout", Nil))
   }
}
                    

// @LINE:11
case controllers_TwitterController_loadUserPage5(params) => {
   call { 
        invokeHandler(_root_.controllers.TwitterController.loadUserPage(), HandlerDef(this, "controllers.TwitterController", "loadUserPage", Nil))
   }
}
                    

// @LINE:12
case controllers_TwitterController_postNewStatus6(params) => {
   call { 
        invokeHandler(_root_.controllers.TwitterController.postNewStatus(), HandlerDef(this, "controllers.TwitterController", "postNewStatus", Nil))
   }
}
                    

// @LINE:13
case controllers_TwitterController_search7(params) => {
   call { 
        invokeHandler(_root_.controllers.TwitterController.search(), HandlerDef(this, "controllers.TwitterController", "search", Nil))
   }
}
                    

// @LINE:16
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                