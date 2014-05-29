robovm-sample-jfx-app
=====================

A simple, example JavaFX app for RoboVM

<div class="highlight highlight-bash"><pre>
mvn install:install-file -Dfile=/Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre/lib/jfxrt.jar -DgroupId=com.oracle.javafx \
    -DartifactId=javafx -Dversion=2.2 -Dpackaging=jar
</pre></div>
	
Then maven will install jfxrt.jar then you can simply reference it as 
 
  &lt;
 &lt;
 <span class="hl-tag">/dependency</span>
 &gt;<br>
   &lt;
 <span class="hl-tag">groupId</span>
 &gt;spring-context&lt;
 <span class="hl-tag">/groupId</span>
 &gt;<br>
   &lt;
 <span class="hl-tag">artifactId</span>
 &gt;spring-context&lt;
 <span class="hl-tag">/artifactId</span>
 &gt;<br>
   &lt;
   <span class="hl-tag">version</span>
   &gt;3.0.0.RELEASE&lt;
   <span class="hl-tag">/version</span>
   &gt;<br>
   &lt;
   <span class="hl-tag">/dependency</span>
   &gt;
   &lt;
 
        <p>&lt;dependency&gt;<br>
             &lt;groupId&gt;com.oracle&lt;/groupId&gt;<br>
             &lt;artifactId&gt;javafx&lt;/artifactId&gt;<br>
             &lt;version&gt;${javafx.version}&lt;/version&gt;<br>
         &lt;/dependency&gt;</p>

	
To let RoboVM make an iOS app on iphone, ipad simulator or iOS Device we need to call from the command line:	


<pre>	
mvn robovm:iphone-sim
mvn robovm:ipad-sim
mvn robovm:ios-device
</pre>



![ScreenShot](https://github.com/Kourtessia/robovm-sample-jfx-app/blob/master/images/EnterName.png?raw=true)'
!![ScreenShot](https://github.com/Kourtessia/robovm-sample-jfx-app/blob/master/images/HelloWorld.png?raw=true)'


