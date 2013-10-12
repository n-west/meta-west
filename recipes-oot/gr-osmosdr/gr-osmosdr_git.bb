DESCRIPTION = "GNU Radio OOT module with sinks/sources for various devices"
HOMEPAGE = "http://sdr.osmocom.org/trac/wiki/GrOsmoSDR"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "git-native gnuradio bladerf hackrf uhd"
inherit cmake pythonnative
# osmocom cmake calls some python stuff

PV = "v0.1.0"
PR = "0"

SRC_URI = "git://git.osmocom.org/gr-osmosdr;protocol=git;branch=gr3.6"
SRCREV = "c7dcddc3cd98b03f1b23d0cc81fcc754592e9ece"

S = "${WORKDIR}/git"

OECMAKE_BUILDPATH = "${S}/build"
OECMAKE_SOURCEPATH = "${S}"
 
EXTRA_OEMAKE = "-C ${OECMAKE_BUILDPATH}"


FILES_${PN} += "${datadir}/* \
                ${prefix}/osmosdr/* \
                "

FILES_${PN}-debug += "${prefix}/osmosdr/.debug/*"

