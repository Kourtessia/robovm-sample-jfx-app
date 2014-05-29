robovm-sample-jfx-app
=====================

A simple, example JavaFX app for RoboVM

<div class="highlight highlight-bash"><pre>
mvn install:install-file -Dfile=/Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/lib/jfxrt.jar -DgroupId=com.oracle.javafx \
    -DartifactId=javafx -Dversion=2.2 -Dpackaging=jar
</pre></div>
	
Then maven will install jfxrt.jar then you can simply reference it as 
 
 
 <code class="bwp-syntax-inline"><span style="color: #009900;"><span style="color: #000000; font-weight: bold;">&lt;dependency<span style="color: #000000; font-weight: bold;">&gt;</span></span></span><br>
 <span style="color: #009900;"><span style="color: #000000; font-weight: bold;">&lt;groupId<span style="color: #000000; font-weight: bold;">&gt;</span></span></span>com.oracle.javafx<span style="color: #009900;"><span style="color: #000000; font-weight: bold;">&lt;/groupId<span style="color: #000000; font-weight: bold;">&gt;</span></span></span><br>
 <span style="color: #009900;"><span style="color: #000000; font-weight: bold;">&lt;artifactId<span style="color: #000000; font-weight: bold;">&gt;</span></span></span>javafx<span style="color: #009900;"><span style="color: #000000; font-weight: bold;">&lt;/artifactId<span style="color: #000000; font-weight: bold;">&gt;</span></span></span><br>
 <span style="color: #009900;"><span style="color: #000000; font-weight: bold;">&lt;version<span style="color: #000000; font-weight: bold;">&gt;</span></span></span>2.2<span style="color: #009900;"><span style="color: #000000; font-weight: bold;">&lt;/version<span style="color: #000000; font-weight: bold;">&gt;</span></span></span><br>
 <span style="color: #009900;"><span style="color: #000000; font-weight: bold;">&lt;/dependency<span style="color: #000000; font-weight: bold;">&gt;</span></span></span></code>
 
 
<dependency>
  <groupId>com.oracle.javafx</groupId>
  <artifactId>javafx</artifactId>
  <version>2.2</version>
</dependency>

	
To let RoboVM make an iOS app on iphone, ipad simulator or iOS Device we need to call from the command line:	

<div class="highlight highlight-bash">
<pre>	
mvn robovm:iphone-sim
mvn robovm:ipad-sim
mvn robovm:ios-device
</pre></div>



![ScreenShot](https://github.com/Kourtessia/robovm-sample-jfx-app/blob/master/images/EnterName.png?raw=true)'
!![ScreenShot](https://github.com/Kourtessia/robovm-sample-jfx-app/blob/master/images/HelloWorld.png?raw=true)'


