# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "jethro"
LOCALVERSION = "-fslc"

SRCREV = "373fff21e22950b0b6670c286fe71d07dfe6b847"

SRC_URI = "git://github.com/PiltoTestYocto/openrex-linux-3.14;branch=${SRCBRANCH};protocol=https \
           file://defconfig"

#PV .= "+git${SRCPV}"
PV .= ""


COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex)"
