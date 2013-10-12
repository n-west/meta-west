DESCRIPTION = "An image with a bunch of SDR stuff on it"
LICENSE = "GPLv3"

IMAGE_INSTALL += " gnuradio hackrf bladerf gr-osmocom"

require recipes-core/images/core-image-minimal.bb
