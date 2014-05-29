robovm-sample-jfx-app
=====================

A simple, example JavaFX app for RoboVM

<div class="highlight highlight-bash"><pre>
mvn install:install-file -Dfile=/Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/lib/jfxrt.jar -DgroupId=com.oracle.javafx \
    -DartifactId=javafx -Dversion=2.2 -Dpackaging=jar
</pre></div>
	
Then maven will install jfxrt.jar then you can simply reference it as 
 
<div class="highlight highlight-bash"><pre>
<dependency>
  <groupId>com.oracle.javafx</groupId>
  <artifactId>javafx</artifactId>
  <version>2.2</version>
</dependency>  	
</pre></div>
	
To let RoboVM make an iOS app we need to call:	
<div class="highlight highlight-bash"><pre>	
mvn robovm:iphone-sim
</pre></div>
or
<div class="highlight highlight-bash"><pre>
mvn robovm:ios-device 
</pre></div>


![ScreenShot](https://github.com/Kourtessia/robovm-sample-jfx-app/blob/master/images/EnterName.png?raw=true)'
!![ScreenShot](https://github.com/Kourtessia/robovm-sample-jfx-app/blob/master/images/HelloWorld.png?raw=true)'


