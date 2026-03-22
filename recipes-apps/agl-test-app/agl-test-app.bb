LICENSE = "CLOSED"
SRC_URI = "git://github.com/Abdulrahman-Yasser/flutter-message;branch=main;protocol=https"
SRCREV = "f2a02c2f426e797df904e139a9506a5ebf53505b"
S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "agl_test_app"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "agl-test-app"
PUBSPEC_IGNORE_LOCKFILE = "1"

inherit flutter-app
