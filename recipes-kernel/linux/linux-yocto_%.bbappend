FILESEXTRAPATHS:prepend := "${THISDIR}/linux-yocto:"
SRC_URI:append = " file://zzz_sound_mine.cfg"
KERNEL_CONFIG_FRAGMENTS:append = " zzz_sound_mine.cfg"
