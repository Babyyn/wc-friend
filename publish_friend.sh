./gradlew :friend:clean

./gradlew :friend_api:assembleRelease
./gradlew :friend_api:publish -Penv=stag -PpublishAar=true
./gradlew :friend_api:publish -Penv=prod -PpublishAar=true

./gradlew :friend:assembleRelease publishAar
./gradlew :friend:publish -Penv=stag -PpublishAar=true
./gradlew :friend:publish -Penv=prod -PpublishAar=true
