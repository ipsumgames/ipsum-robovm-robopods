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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZShowOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZShowOptionsPtr extends Ptr<HZShowOptions, HZShowOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZShowOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZShowOptions() {}
    protected HZShowOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "viewController")
    public native UIViewController getViewController();
    @Property(selector = "setViewController:", strongRef = true)
    public native void setViewController(UIViewController v);
    @Property(selector = "tag")
    public native String getTag();
    @Property(selector = "setTag:")
    public native void setTag(String v);
    @Property(selector = "completion")
    public native @Block VoidBlock2<Boolean, NSError> getCompletion();
    @Property(selector = "setCompletion:")
    public native void setCompletion(@Block VoidBlock2<Boolean, NSError> v);
    @Property(selector = "incentivizedInfo")
    public native String getIncentivizedInfo();
    @Property(selector = "setIncentivizedInfo:")
    public native void setIncentivizedInfo(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
