DESCRIPTION = "GNU Radio OOT module with sinks/sources for various devices"
HOMEPAGE = "http://sdr.osmocom.org/trac/wiki/GrOsmoSDR"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

require ../oot.inc

PV = "v0.1.0"
PR = "${INC_PR}.0"

SRC_URI = "git://git.osmocom.org/gr-osmosdr;protocol=git;branch=gr3.6"
SRCREV = "c7dcddc3cd98b03f1b23d0cc81fcc754592e9ece"

