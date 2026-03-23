LICENSE = "CLOSED"
SRC_URI = "git://github.com/Abdulrahman-Yasser/quiz_flutter_app.git;branch=master;protocol=https"
SRCREV = "38644012770112d22e8b1b03310fefba847dc1e9"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "agl_version_app"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "agl-version-app"
PUBSPEC_IGNORE_LOCKFILE = "1"




inherit flutter-app
