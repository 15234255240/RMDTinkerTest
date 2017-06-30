package com.rmd

class Test{
    def getOldApkPath() {
        return hasProperty("OLD_APK") ? OLD_APK : ext.tinkerOldApkPath
    }

    def getApplyMappingPath() {
        return hasProperty("APPLY_MAPPING") ? APPLY_MAPPING : ext.tinkerApplyMappingPath
    }

    def getApplyResourceMappingPath() {
        return hasProperty("APPLY_RESOURCE") ? APPLY_RESOURCE : ext.tinkerApplyResourcePath
    }
}