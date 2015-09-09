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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HeyzapAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HeyzapAdsPtr extends Ptr<HeyzapAds, HeyzapAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HeyzapAds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HeyzapAds() {}
    protected HeyzapAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:forNetwork:")
    public static native void setDelegate(NSObject delegate, String network);
    @Method(selector = "networkCallbackWithBlock:")
    public static native void networkCallbackWithBlock(@Block VoidBlock2<NSString, NSString> block);
    @Method(selector = "isNetworkInitialized:")
    public static native boolean isNetworkInitialized(String network);
    @Method(selector = "startWithPublisherID:andOptions:")
    public static native void start(String publisherID, HZAdOptions options);
    @Method(selector = "startWithPublisherID:andOptions:andFramework:")
    public static native void start(String publisherID, HZAdOptions options, String framework);
    @Method(selector = "startWithPublisherID:")
    public static native void start(String publisherID);
    @Method(selector = "isStarted")
    public static native boolean isStarted();
    @Method(selector = "setDebugLevel:")
    public static native void setDebugLevel(HZDebugLevel debugLevel);
    @Method(selector = "setDebug:")
    public static native void setDebug(boolean choice);
    @Method(selector = "setOptions:")
    public static native void setOptions(HZAdOptions options);
    @Method(selector = "setFramework:")
    public static native void setFramework(String framework);
    @Method(selector = "setMediator:")
    public static native void setMediator(String mediator);
    @Method(selector = "setBundleIdentifier:")
    public static native void setBundleIdentifier(String bundleIdentifier);
    @Method(selector = "defaultTagName")
    public static native String defaultTagName();
    @Method(selector = "remoteData")
    public static native NSDictionary<?, ?> remoteData();
    @Method(selector = "presentMediationDebugViewController")
    public static native void presentMediationDebugViewController();
    @Method(selector = "pauseExpensiveWork")
    public static native void pauseExpensiveWork();
    @Method(selector = "resumeExpensiveWork")
    public static native void resumeExpensiveWork();
    @Method(selector = "getRemoteDataJsonString")
    public static native String getRemoteDataJsonString();
    @Method(selector = "onIAPPurchaseComplete:productName:price:")
    public static native void onIAPPurchaseComplete(String productId, String productName, NSDecimalNumber price);
    /*</methods>*/
}
