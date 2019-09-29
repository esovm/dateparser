addSbtPlugin("com.dwijnand"      % "sbt-travisci" % "1.2.0")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt" % "2.0.6")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"      % "1.0.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "5.2.0")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.28" // Needed by sbt-git
