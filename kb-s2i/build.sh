#!/usr/bin/env bash

cd /tmp/src

cp -rp -- /tmp/src/target/kb-test-*.war "$TOMCAT_APPS/kb-test.war"
cp -- /tmp/src/conf/ocp/kb-test.xml "$TOMCAT_APPS/kb-test.xml"

export WAR_FILE=$(readlink -f "$TOMCAT_APPS/kb-test.war")
