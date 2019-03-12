mvn release:prepare -DscmCommentPrefix="Blah" -DreleaseVersion=1.1.0 -DdevelopmentVersion=1.1.1-SNAPSHOT -DautoVersionSubmodukes=true 
mvn release:clean


-e
-X
