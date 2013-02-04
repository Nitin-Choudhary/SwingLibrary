/*
 * Copyright 2008-2011 Nokia Siemens Networks Oyj
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

package org.robotframework.swing.keyword.development;

import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.swing.container.ContainerIteratorForListing;
import org.robotframework.swing.context.Context;
import org.robotframework.swing.operator.ComponentWrapper;

import java.awt.*;

@RobotKeywords
public class DevelopmentKeywords {

    @RobotKeyword("Prints components (their types and their internal names) from the selected context.\n"
        + "The internal name is set with component's setName method: http://java.sun.com/j2se/1.4.2/docs/api/java/awt/Component.html#setName(java.lang.String).\n"
        + "See keywords, `Select Window`, `Select Dialog` and `Select Context` for details about context.\n\n"
        + "Example:\n"
        + "| Select Main Window         |\n"
        + "| List Components In Context |\n")
    public String listComponentsInContext() {
        ComponentWrapper operator = Context.getContext();
        return new ContainerIteratorForListing((Container) operator.getSource()).iterate().toString();
    }
}