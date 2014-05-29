robovm-sample-jfx-app
=====================

A simple, example JavaFX app for RoboVM

mvn install:install-file -Dfile=/Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/lib/jfxrt.jar -DgroupId=com.oracle.javafx \
    -DartifactId=javafx -Dversion=2.2 -Dpackaging=jar
	
mvn robovm:iphone-sim


