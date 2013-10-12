DEPENDS = "git-native gnuradio bladerf hackrf uhd"
inherit cmake pythonnative

PR = "0"
INC_PR = "r0"

S = "${WORKDIR}/git"

OECMAKE_BUILDPATH = "${S}/build"
OECMAKE_SOURCEPATH = "${S}"
 
EXTRA_OEMAKE = "-C ${OECMAKE_BUILDPATH}"


FILES_${PN}-debug += "${prefix}/*/.debug/*"
FILES_${PN} += "${datadir}/* \
                "

