#!/bin/bash
# Get the device properties
adb shell getprop | grep "model\|version.sdk\|manufacturer\|ro.serialno\|product.name\|brand\|version.release\|build.id\|security_patch" | sed 's/ro\.//g'
# get the device ime
echo "[device.imei]: [$(adb shell service call iphonesubinfo 1 | awk -F "'" '{print $2}' | sed '1 d'| tr -d '\n' | tr -d '.' | tr -d ' ')]"
# get the device phone number
echo "[device.phonenumber]: [$(adb shell service call iphonesubinfo 19 | awk -F "'" '{print $2}' | sed '1 d'| tr -d '\n' | tr -d '.' | tr -d ' ')]"
