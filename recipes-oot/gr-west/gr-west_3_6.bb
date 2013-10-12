DESCRIPTION = "GNU Radio OOT module with stuff for nw"
HOMEPAGE = "http://nathanwest.us"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=f632546947588d911a0e937966bb28a8"

require ../oot.inc

inherit cmake pythonnative
# frequently cmake has to test python versions or paths...

PV = "v0"
PR = "${INC_PR}.0"

SRC_URI = "git://github.com/n-west/gr-west_3_6.git;protocol=https;branch=master"
SRCREV = "7848a9d80ee7e4396c1780bf598af72ce4f9c732"


