import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "apc-cms"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "mysql" % "mysql-connector-java" % "5.1.18", // for DEV
      "postgresql" % "postgresql" % "8.4-702.jdbc4", // for PROD
      "com.amazonaws" % "aws-java-sdk" % "1.3.12" // for access to Amazon S3 storage service
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
    )

}
