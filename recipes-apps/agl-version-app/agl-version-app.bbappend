require ${@bb.utils.contains('AGL_FEATURES', 'agl-flutter', 'agl-version-app_aglflutter.inc', '', d)}   
SRC_URI:append = " file://sound.cfg"
