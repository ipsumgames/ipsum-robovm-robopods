/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.heyzap;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZIncentivizedAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZIncentivizedAdPtr extends Ptr<HZIncentivizedAd, HZIncentivizedAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZIncentivizedAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZIncentivizedAd() {}
    protected HZIncentivizedAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:")
    public static native void setDelegate(HZIncentivizedAdDelegate delegate);
    @Method(selector = "show")
    public static native void show();
    @Method(selector = "showForTag:")
    public static native void show(String tag);
    @Method(selector = "showWithOptions:")
    public static native void show(HZShowOptions options);
    @Method(selector = "fetch")
    public static native void fetch();
    @Method(selector = "fetchForTag:")
    public static native void fetch(String tag);
    @Method(selector = "fetchWithCompletion:")
    public static native void fetch(@Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "fetchForTag:withCompletion:")
    public static native void fetch(String tag, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "isAvailable")
    public static native boolean isAvailable();
    @Method(selector = "isAvailableForTag:")
    public static native boolean isAvailableForTag(String tag);
    @Method(selector = "setUserIdentifier:")
    public static native void setCreativeID(String userIdentifier);
    @Method(selector = "setCreativeID:")
    public static native void setCreativeID(int creativeID);
    /*</methods>*/
}
