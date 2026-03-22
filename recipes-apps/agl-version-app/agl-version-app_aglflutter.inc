FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://agl-version-app.service \
            file://agl-version-app.toml \
"

APP_CONFIG = "agl-version-app.toml"

inherit systemd

do_install:append() {
    install -D -m 0644 ${WORKDIR}/${BPN}.service ${D}${systemd_system_unitdir}/${BPN}.service
}

RDEPENDS:${PN} += "agl-flutter-env"

SYSTEMD_SERVICE:${PN} = "agl-version-app.service"
